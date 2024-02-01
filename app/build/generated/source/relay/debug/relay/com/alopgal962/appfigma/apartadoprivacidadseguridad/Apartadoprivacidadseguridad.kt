package com.alopgal962.appfigma.apartadoprivacidadseguridad

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
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
 * This composable was generated from the UI Package 'apartadoprivacidadseguridad'.
 * Generated code; do not edit directly
 */
@Composable
fun Apartadoprivacidadseguridad(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Textoprivacidad(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -0.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 282, heightDp = 33)
@Composable
private fun ApartadoprivacidadseguridadPreview() {
    MaterialTheme {
        RelayContainer {
            Apartadoprivacidadseguridad(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Textoprivacidad(modifier: Modifier = Modifier) {
    RelayText(
        content = "Privacidad & Seguridad",
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
        modifier = modifier.requiredWidth(170.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 10.0,
        content = content,
        modifier = modifier.background(Color.Transparent).drawWithContent(
            onDraw = {
                drawRect(
                    brush = Brush.linearGradient(
                        0.16f to Color(
                            alpha = 255,
                            red = 103,
                            green = 86,
                            blue = 171
                        ),
                        0.83f to Color(
                            alpha = 255,
                            red = 24,
                            green = 33,
                            blue = 62
                        ),
                        start = Offset(
                            Float.POSITIVE_INFINITY,
                            0.48f
                        ),
                        end = Offset(
                            0.0f,
                            0.48f
                        )
                    )
                )
                drawContent()
            }
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
