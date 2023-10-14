package org.example.shared.core.viewmodel

object ApplicationViewModelStoreOwner : SharedViewModelStoreOwner {

    override val store: SharedViewModelStore = DesktopViewModelStore()

}