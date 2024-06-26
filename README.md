# Rick and Morty app with MVI
*  This app demonstrates the Compose Multiplatform framework with Login and UI shared for Android and iOS.
*  It uses MVI architecture.



## Tech Demonstration with MVVM and MVI Architecture
*  This app demonstrates the Kotlin Multiplatform framework with Login is shared but UI is native to Android and iOS. It uses MVVM architecture [My MVVM App](https://github.com/bhojak/RickMortyApp-KMM/tree/master).
*  This app demonstrates the Compose Multiplatform framework with Login and UI shared for Android and iOS. It uses MVI architecture [My MVI App](https://github.com/bhojak/RickAndMortyApp-CMP). 
*  These apps consume data from the open [Rick And Morty Api](https://rickandmortyapi.com/).





### Framework and library used
	
* Rick and Morty API
* Compose Multiplatform Mobile
* Compose
* Voyager
* Compose Multiplatform Wizard
* MVI
* Couroutine and Flow
* Sqldelight
* Ktor
* Koin



## Run project

### Android
To run the application on an Android device/emulator:
- open the project in Android Studio and run the imported Android run configuration

To build the application bundle:
- run `./gradlew :composeApp:assembleDebug`
- find the `.apk` file in `composeApp/build/outputs/apk/debug/composeApp-debug.apk`

### Desktop
Run the desktop application: `./gradlew :composeApp:run`

### iOS
To run the application on an iPhone device/simulator:
- Open `iosApp/iosApp.xcworkspace` in Xcode and run standard configuration
- Or use [Kotlin Multiplatform Mobile plugin](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform-mobile) for Android Studio

### Browser
Run the browser application: `./gradlew :composeApp:jsBrowserDevelopmentRun`





