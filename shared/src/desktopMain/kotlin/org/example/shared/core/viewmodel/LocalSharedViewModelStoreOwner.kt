package org.example.shared.core.viewmodel

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidedValue
import androidx.compose.runtime.compositionLocalOf

@Composable
internal actual fun getInitialViewModelStoreOwner(): SharedViewModelStoreOwner? {

    return ApplicationViewModelStoreOwner
}