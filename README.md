# [Template] KMP Android And Desktop

Kotlin Multiplatform project template with **Android** and **desktop** targets, and **Compose Multiplatform**.

## Versions

Latest combination without errors and warnings (2023-10-07):

- Kotlin: 1.8.10 (compatible with compose compiler 1.4.3)
- AGP: 7.4.0 (compatible with Kotlin Plugin 1.8.10)
- JDK: 17 (supported for AGP 7.4.0)
- Android SDK: 33.0.0 (compatible with AGP 7.4.0)

## Build

To build this project, the JDK (Java Development Kit) and the Android SDK are required. 
I recommend using [Intellij IDEA](https://www.jetbrains.com/idea/download) as the IDE, with the **Android**, **Jetpack Compose** and **Compose Multiplatform** plugins installed.

> You can get the **JDK** and **Android SDK** directly from **Intellij IDEA**.

Use run configurations to get started.
<br> ![run-android.png](screenshots/run-android.png)

## Screenshots

|                        Android                        |                      Desktop                      |
|:-----------------------------------------------------:|:-------------------------------------------------:|
|        ![android.png](screenshots/android.png)        |        ![desktop](screenshots/desktop.png)        |
|                    Android Dialog                     |                  Desktop Dialog                   |
| ![android dialog.png](screenshots/android-dialog.png) | ![desktop dialog](screenshots/desktop-dialog.png) |

## Docs
- [Configure a Gradle project | Kotlin](https://kotlinlang.org/docs/gradle-configure-project.html)
- [Understand Multiplatform project structure | Kotlin](https://kotlinlang.org/docs/multiplatform-discover-project.html)
- [Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/)

## Examples
- [Compose Multiplatform Template](https://github.com/JetBrains/compose-multiplatform-template)
- [Compose Multiplatform Examples](https://github.com/JetBrains/compose-multiplatform/tree/master/examples)