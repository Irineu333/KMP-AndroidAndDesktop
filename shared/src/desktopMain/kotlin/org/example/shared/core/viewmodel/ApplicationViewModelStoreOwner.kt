package org.example.shared.core.viewmodel

object ApplicationViewModelStoreOwner : SharedViewModelStoreOwner {

    override val viewModelStore: SharedViewModelStore = DesktopViewModelStore()

}