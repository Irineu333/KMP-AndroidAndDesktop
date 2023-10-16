package org.example.shared.core.viewmodel

import androidx.compose.runtime.Composable

@Composable
internal actual fun getInitialViewModelStoreOwner(): SharedViewModelStoreOwner? {

    return DefaultViewModelStoreOwner
}