package org.example.shared.core

import kotlinx.coroutines.CoroutineScope

expect abstract class SharedViewModel() {
    val scope: CoroutineScope
}