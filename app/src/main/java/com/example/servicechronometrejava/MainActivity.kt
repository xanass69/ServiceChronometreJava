package com.example.servicechronometrejava

import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.os.IBinder
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    private lateinit var tvTemps: TextView
    private lateinit var btnStart: Button
    private lateinit var btnStop: Button
    private var chronometreService: ChronometreService? = null
    private var isBound = false

    // Connexion au service (Bound Service)
    private val connection = object : ServiceConnection {
        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            val binder = service as ChronometreService.LocalBinder
            chronometreService = binder.getService()
            isBound = true
        }

        override fun onServiceDisconnected(name: ComponentName?) {
            isBound = false
            chronometreService = null
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTemps = findViewById(R.id.tvTemps)
        btnStart = findViewById(R.id.btnStart)
        btnStop = findViewById(R.id.btnStop)

        btnStart.setOnClickListener {
            startService()
        }

        btnStop.setOnClickListener {
            stopService()
        }
    }

    private fun startService() {
        val intent = Intent(this, ChronometreService::class.java)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(intent)
        } else {
            startService(intent)
        }
        bindService(intent, connection, Context.BIND_AUTO_CREATE)
    }

    private fun stopService() {
        val intent = Intent(this, ChronometreService::class.java)
        intent.action = "STOP"
        stopService(intent)

        if (isBound) {
            unbindService(connection)
            isBound = false
        }
        tvTemps.text = "00:00"
    }

    override fun onDestroy() {
        if (isBound) {
            unbindService(connection)
        }
        super.onDestroy()
    }

    // Demander la permission de notification pour Android 13+
    override fun onResume() {
        super.onResume()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (checkSelfPermission(android.Manifest.permission.POST_NOTIFICATIONS)
                != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(
                    arrayOf(android.Manifest.permission.POST_NOTIFICATIONS),
                    1001
                )
            }
        }
    }
}