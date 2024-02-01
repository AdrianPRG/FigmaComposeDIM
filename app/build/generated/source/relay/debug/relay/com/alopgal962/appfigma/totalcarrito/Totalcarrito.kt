package com.alopgal962.appfigma.totalcarrito

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'totalcarrito'.
 * Generated code; do not edit directly
 *
 * @param precioTotalCarritoTextContent precio del carrito
 */
@Composable
fun Totalcarrito(
    modifier: Modifier = Modifier,
    precioTotalCarritoTextContent: String
) {
    TopLevel(modifier = modifier) {
        PrecioTotalDelCarrito602(
            precioTotalCarritoTextContent = precioTotalCarritoTextContent,
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 16.0.dp,
                    y = 16.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 360, heightDp = 48)
@Composable
private fun TotalcarritoPreview() {
    MaterialTheme {
        RelayContainer {
            Totalcarrito(
                precioTotalCarritoTextContent = "Precio total del carrito:     602\$",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun PrecioTotalDelCarrito602(
    precioTotalCarritoTextContent: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = precioTotalCarritoTextContent,
        fontSize = 18.0.sp,
        fontFamily = poly,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.1879999372694228.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(329.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 234,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
