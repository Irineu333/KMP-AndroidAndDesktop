package org.example.shared.core.viewmodel

object DefaultViewModelStoreOwner : SharedViewModelStoreOwner {
    override val viewModelStore = DefaultViewModelStore()
}