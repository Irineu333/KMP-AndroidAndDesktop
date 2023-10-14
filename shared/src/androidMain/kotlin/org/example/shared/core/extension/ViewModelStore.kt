package org.example.shared.core.extension

import androidx.lifecycle.ViewModelStore
import org.example.shared.core.viewmodel.SharedViewModel
import org.example.shared.core.viewmodel.SharedViewModelStore

fun ViewModelStore.toShared() : SharedViewModelStore {

    val viewModelStore = this

    return object : SharedViewModelStore {

        override fun put(key: String, viewModel: SharedViewModel) {
            viewModelStore.put(key, viewModel)
        }

        override fun get(key: String): SharedViewModel? {
           return viewModelStore[key] as? SharedViewModel
        }

        override fun keys(): Set<String> {
            return viewModelStore.keys()
        }

        override fun clear() {
            viewModelStore.clear()
        }
    }
}