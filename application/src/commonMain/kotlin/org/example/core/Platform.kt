package org.example.core

enum class Platform() {
    DESKTOP,
    ANDROID;
}

expect fun getPlatform(): Platform