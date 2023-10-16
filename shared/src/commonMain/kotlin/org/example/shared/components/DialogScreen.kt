package org.example.shared.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.DpSize
import org.example.shared.core.viewmodel.DefaultViewModelStore
import org.example.shared.core.viewmodel.LocalSharedViewModelStoreOwner
import org.example.shared.core.viewmodel.SharedViewModelStore
import org.example.shared.core.viewmodel.SharedViewModelStoreOwner

@Composable
fun DialogScreen(
    title: String, /* used as tag */
    icon: Painter? = null,
    size: DpSize = DpSize.Unspecified,
    onCloseRequest: () -> Unit,
    content: @Composable () -> Unit,
) {
    val dialogViewModelStoreOwner = remember { ProvideDialogViewModelStoreOwner.provide(title) }

    CompositionLocalProvider(LocalSharedViewModelStoreOwner provides dialogViewModelStoreOwner) {
        SharedDialog(
            title = title,
            icon = icon,
            size = size,
            onCloseRequest = {
                dialogViewModelStoreOwner.onClosedRequest()
                onCloseRequest()
            },
            content = content
        )
    }
}

object ProvideDialogViewModelStoreOwner {

    private val owners = mutableMapOf<String, DialogViewModelStoreOwner>()

    fun provide(
        tag: String
    ) = owners[tag] ?: DialogViewModelStoreOwner(tag).also {
        owners[tag] = it
    }

    internal fun remove(tag: String)  = owners.remove(tag)
}

class DialogViewModelStoreOwner internal constructor(
    private val tag: String
) : SharedViewModelStoreOwner {

    override val viewModelStore: SharedViewModelStore = DefaultViewModelStore()

    fun onClosedRequest() {
        ProvideDialogViewModelStoreOwner.remove(tag)
        viewModelStore.clear()
    }
}