# Technical Demonstration of Multiplatform Framework
	
* Rick and Morty API
* Kotlin/Compose Multiplatform Mobile [KMM]
* [Compose]
* [Voyager]
* [Compose Multiplatform Wizard]
* [MVI]
* [Flow]
* [Sqldelight]
* [Ktor]
* [Koin]



## Run project

### Android
To run the application on android device/emulator:
- open project in Android Studio and run imported android run configuration

To build the application bundle:
- run `./gradlew :composeApp:assembleDebug`
- find `.apk` file in `composeApp/build/outputs/apk/debug/composeApp-debug.apk`

### Desktop
Run the desktop application: `./gradlew :composeApp:run`

### iOS
To run the application on iPhone device/simulator:
- Open `iosApp/iosApp.xcworkspace` in Xcode and run standard configuration
- Or use [Kotlin Multiplatform Mobile plugin](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform-mobile) for Android Studio

### Browser
Run the browser application: `./gradlew :composeApp:jsBrowserDevelopmentRun`





