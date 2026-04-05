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
📬 Tiroir notifications	Affiche le temps en direct:

## Screenshots 

1. ACCUEIL
<img width="177" height="370" alt="accueill" src="https://github.com/user-attachments/assets/09226107-63b5-41a1-8068-c5b6e754f7a3" />

2. DEMARRER SERVICE
<img width="164" height="82" alt="chrono" src="https://github.com/user-attachments/assets/774558fa-4cd7-45f4-a62f-bc70ec6cbf4f" />

3. QUITTER APPLICATION
<img width="162" height="353" alt="quitterapp" src="https://github.com/user-attachments/assets/9ba4103d-25f1-4d8f-8eed-9878d9136f7b" />

4. ARRETER SERVICE
<img width="164" height="328" alt="arreter" src="https://github.com/user-attachments/assets/f627dd13-e292-4ea9-9186-90174f6cae95" />




