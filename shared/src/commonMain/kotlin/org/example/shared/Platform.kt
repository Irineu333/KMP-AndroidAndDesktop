package org.example.shared

enum class Platform(val value : String) {
    DESKTOP("Desktop"),
    ANDROID("Android")
}

expect fun getPlatform(): Platform