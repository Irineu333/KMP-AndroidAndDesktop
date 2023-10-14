package org.example.shared.core.viewmodel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidedValue
import androidx.compose.runtime.compositionLocalOf

object LocalSharedViewModelStoreOwner {

    private val LocalViewModelStoreOwner = compositionLocalOf<SharedViewModelStoreOwner?> { null }

    val current: SharedViewModelStoreOwner?
        @Composable
        get() = LocalViewModelStoreOwner.current ?: getStartsViewModelStoreOwner()

    infix fun provides(
        viewModelStoreOwner: SharedViewModelStoreOwner
    ): ProvidedValue<SharedViewModelStoreOwner?> {
        return LocalViewModelStoreOwner.provides(viewModelStoreOwner)
    }
}

@Composable
expect fun getStartsViewModelStoreOwner() : SharedViewModelStoreOwner?