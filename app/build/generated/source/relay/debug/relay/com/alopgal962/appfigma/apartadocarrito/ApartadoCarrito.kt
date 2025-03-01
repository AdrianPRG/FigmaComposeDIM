package com.alopgal962.appfigma.apartadocarrito

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'apartado_carrito'.
 * Generated code; do not edit directly
 */
@Composable
fun ApartadoCarrito(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        MiCarrito(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.5.dp,
                    y = 0.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 263, heightDp = 34)
@Composable
private fun ApartadoCarritoPreview() {
    MaterialTheme {
        RelayContainer {
            ApartadoCarrito(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun MiCarrito(modifier: Modifier = Modifier) {
    RelayText(
        content = "Mi carrito",
        fontSize = 12.0.sp,
        fontFamily = libreBodoni,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.25.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(168.0.dp).requiredHeight(23.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 38,
            green = 50,
            blue = 91
        ),
        isStructured = false,
        radius = 4.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
