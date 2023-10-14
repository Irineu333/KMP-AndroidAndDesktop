package org.example.shared.core.viewmodel

import androidx.compose.runtime.Composable

@Composable
inline fun <reified T : SharedViewModel> sharedViewModel(
    viewModelStoreOwner: SharedViewModelStoreOwner = checkNotNull(LocalSharedViewModelStoreOwner.current) {
        "No SharedViewModelStoreOwner was provided via LocalSharedViewModelStoreOwner"
    },
): T {

    return SharedViewModelProvider(viewModelStoreOwner).provide(T::class)
}