package org.example.shared.core.viewmodel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidedValue
import androidx.compose.runtime.compositionLocalOf

object LocalSharedViewModelStoreOwner {

    private val LocalSharedViewModelStoreOwner =
        compositionLocalOf<SharedViewModelStoreOwner?> { null }

    val current: SharedViewModelStoreOwner?
        @Composable
        get() = LocalSharedViewModelStoreOwner.current ?: getInitialViewModelStoreOwner()

    infix fun provides(
        viewModelStoreOwner: SharedViewModelStoreOwner
    ): ProvidedValue<SharedViewModelStoreOwner?> {
        return LocalSharedViewModelStoreOwner.provides(viewModelStoreOwner)
    }
}

@Composable
internal expect fun getInitialViewModelStoreOwner(): SharedViewModelStoreOwner?