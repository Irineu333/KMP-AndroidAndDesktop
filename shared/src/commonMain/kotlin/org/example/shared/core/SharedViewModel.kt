package org.example.shared.core

import kotlinx.coroutines.CoroutineScope

expect open class SharedViewModel() {

    val scope: CoroutineScope

}