package org.example.shared.core.viewmodel

import kotlinx.coroutines.CoroutineScope

expect abstract class SharedViewModel() {

    val viewModelScope: CoroutineScope

    fun onCleared()
    fun clear()

}
