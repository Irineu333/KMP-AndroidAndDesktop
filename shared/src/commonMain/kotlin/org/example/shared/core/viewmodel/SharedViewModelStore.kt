package org.example.shared.core.viewmodel

interface SharedViewModelStore {

    fun put(key: String, viewModel: SharedViewModel)

    operator fun get(key: String): SharedViewModel?

    fun keys(): Set<String>

    fun clear()

}