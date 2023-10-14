package org.example.shared.core.viewmodel

object SingletonViewModelStoreOwner : SharedViewModelStoreOwner {

    override val viewModelStore = SharedViewModelStore()

}