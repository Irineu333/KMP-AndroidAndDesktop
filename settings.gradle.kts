@file:Suppress("UnstableApiUsage")

rootProject.name = "KMP-AndroidAndDesktop-Project"

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
