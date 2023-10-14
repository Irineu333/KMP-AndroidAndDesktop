package org.example.shared.core.viewmodel

open class SharedViewModelStore {

    private val viewModels = mutableMapOf<String, SharedViewModel>()

    fun put(key: String, viewModel: SharedViewModel) {

        val oldViewModel = viewModels.put(key, viewModel)

        oldViewModel?.onCleared()
    }

    operator fun get(key: String): SharedViewModel? {

        return viewModels[key]
    }


    fun keys(): Set<String> {

        return HashSet(viewModels.keys)
    }

    fun clear() {
        for (viewModel in viewModels.values) {

            viewModel.clear()
        }

        viewModels.clear()
    }
}