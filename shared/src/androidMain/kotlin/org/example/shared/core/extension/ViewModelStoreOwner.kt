package org.example.shared.core.extension

import androidx.lifecycle.ViewModelStoreOwner
import org.example.shared.core.viewmodel.SharedViewModelStore
import org.example.shared.core.viewmodel.SharedViewModelStoreOwner

fun ViewModelStoreOwner.toShared(): SharedViewModelStoreOwner {

    val viewModelStore = viewModelStore

    return object : SharedViewModelStoreOwner {
        override val viewModelStore = viewModelStore.toShared()
    }
}