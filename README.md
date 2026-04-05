# ⏱️ Service Chronomètre - Android Foreground Service

## 📱 Description
Application Android démontrant l'utilisation d'un **Foreground Service** avec **Bound Service** pour créer un chronomètre persistant.

## 🎯 Objectifs pédagogiques
- ✅ Créer un Foreground Service (obligatoire depuis Android 8.0)
- ✅ Afficher une notification persistante avec mise à jour en temps réel
- ✅ Implémenter un Bound Service pour la communication Activity-Service
- ✅ Gérer le cycle de vie des services (onStartCommand, onBind, onDestroy)
- ✅ Utiliser START_STICKY pour la persistance
- ✅ Respecter les contraintes Android (permisssions, foregroundServiceType)

## 📋 Prérequis
- Android Studio Hedgehog | Giraffe | ou plus récent
- SDK minimum : API 24 (Android 7.0)
- SDK cible : API 34 (Android 14)

## 📱 Utilisation
Action	Résultat
🔘 DÉMARRER SERVICE	Lance le chronomètre + notification persistante
🔘 ARRÊTER SERVICE	Arrête le chrono + supprime la notification
🏠 Quitter l'application	Le service continue en arrière-plan !
📬 Tiroir notifications	Affiche le temps en direct
