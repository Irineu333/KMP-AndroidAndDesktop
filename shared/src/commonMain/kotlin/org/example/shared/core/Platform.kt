package org.example.shared.core

enum class Platform() {
    DESKTOP,
    ANDROID;
}

expect fun getPlatform(): Platform