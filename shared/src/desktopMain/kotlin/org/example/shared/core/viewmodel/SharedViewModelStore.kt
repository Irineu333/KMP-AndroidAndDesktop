package org.example.shared.core.viewmodel

class DesktopViewModelStore : SharedViewModelStore {

    private val viewModels: MutableMap<String, SharedViewModel> = mutableMapOf()

    override fun put(key: String, viewModel: SharedViewModel) {

        val oldViewModel = viewModels.put(key, viewModel)

        oldViewModel?.onCleared()
    }

    override operator fun get(key: String): SharedViewModel? {

        return viewModels[key]
    }


    override fun keys(): Set<String> {

        return HashSet(viewModels.keys)
    }

    override fun clear() {
        for (viewModel in viewModels.values) {

            viewModel.clear()
        }

        viewModels.clear()
    }
}