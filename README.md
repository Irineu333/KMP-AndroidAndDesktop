# [Template] KMP Android And Desktop

Cross-platform project template with **android** and **desktop** targets (with **Compose Multiplatform**).

## Versions

Latest combination without errors and warnings (2023-10-07):

- Kotlin: 1.8.10 (compatible with compose compiler 1.4.3)
- AGP: 7.4.0 (compatible with Kotlin Plugin 1.8.10)
- JDK: 17 (supported for AGP 7.4.0)
- Android SDK: 33.0.0 (compatible with AGP 7.4.0)

## Build

Download and install [Intellij IDEA](https://www.jetbrains.com/idea/download).

### Android

1. Configure the JDK (17) and Android SDK.
2. Open the project in Intellij IDEA.
3. Create a `local.properties` with `sdk.dir=<path to Android SDK>` in the root of the project.
4. Open a and install with gradlew `gradlew :android:installDebug`(connected device or emulator required).
5. Or build an apk with `gradlew :android:assembleDebug` (android/build/outputs/apk/debug/android-debug.apk) .

### Desktop

1. Configure the JDK (17).
2. Open the project in Intellij IDEA.
3. Run with `gradlew :desktop:run`.
4. Or package a distribution with `gradlew :desktop:packageDistributionForCurrentOS` (build/compose/binaries).

## Screenshots

| Android                                 | Desktop                                   |
|-----------------------------------------|-------------------------------------------|
| ![android.png](screenshots/android.png) | ![desktop image](screenshots/desktop.png) |

## Docs
- [Configure a Gradle project | Kotlin](https://kotlinlang.org/docs/gradle-configure-project.html)
- [Understand Multiplatform project structure | Kotlin](https://kotlinlang.org/docs/multiplatform-discover-project.html)
- [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/)

## Examples
- [Issue Tracker | JetBrains](https://github.com/JetBrains/compose-multiplatform/tree/master/examples/issues)
- [KMP Calculator | Anthoni Ipiranga](https://github.dev/ipirangad3v/kmp-calculator)
- [MusicApp-KMP | Abdul Basit](https://github.com/SEAbdulbasit/MusicApp-KMP)