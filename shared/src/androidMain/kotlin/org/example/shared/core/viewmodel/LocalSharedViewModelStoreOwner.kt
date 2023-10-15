package org.example.shared.core.viewmodel

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import org.example.shared.core.extension.toShared

@Composable
internal actual fun getInitialViewModelStoreOwner() = LocalViewModelStoreOwner.current?.toShared()