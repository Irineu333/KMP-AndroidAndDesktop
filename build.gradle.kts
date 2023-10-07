plugins {
    kotlin("multiplatform") version "1.8.10" apply false
    kotlin("android") version "1.8.10" apply false
    id("com.android.application") version "7.4.0" apply false
    id("com.android.library") version "7.4.0" apply false
    id("org.jetbrains.compose") version "1.4.3" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

group = "org.example"
version = "1.0-DEV"