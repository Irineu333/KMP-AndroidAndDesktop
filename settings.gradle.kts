@file:Suppress("UnstableApiUsage")

rootProject.name = "KMP-AndroidAndDesktop"

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

include(":application")
