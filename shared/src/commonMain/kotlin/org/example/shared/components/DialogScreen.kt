package org.example.shared.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.DpSize
import org.example.shared.core.viewmodel.DefaultViewModelStore
import org.example.shared.core.viewmodel.LocalSharedViewModelStoreOwner
import org.example.shared.core.viewmodel.SharedViewModelStore
import org.example.shared.core.viewmodel.SharedViewModelStoreOwner

class DialogViewModelStoreOwner private constructor(
    private val tag: String
) : SharedViewModelStoreOwner {

    override val viewModelStore: SharedViewModelStore = DefaultViewModelStore()

    init {
        owners[tag] = this
    }

    fun onClosedRequest() {
        owners.remove(tag)
        viewModelStore.clear()
    }

    companion object {

        internal val owners = mutableMapOf<String, DialogViewModelStoreOwner>()

        internal fun get(tag: String): DialogViewModelStoreOwner {
            return owners[tag] ?: DialogViewModelStoreOwner(tag)
        }
    }
}

@Composable
fun DialogScreen(
    title: String,
    icon: Painter? = null,
    size: DpSize = DpSize.Unspecified,
    onCloseRequest: () -> Unit,
    content: @Composable () -> Unit,
) {
    val viewModelStoreOwner = DialogViewModelStoreOwner.get(title)

    CompositionLocalProvider(LocalSharedViewModelStoreOwner provides viewModelStoreOwner) {
        SharedDialog(
            title = title,
            icon = icon,
            size = size,
            onCloseRequest = {
                viewModelStoreOwner.onClosedRequest()
                onCloseRequest()
            },
            content = content
        )
    }
}