package com.alopgal962.appfigma.comparadorordenadores

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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.alopgal962.appfigma.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'comparadorordenadores'.
 * Generated code; do not edit directly
 */
@Composable
fun Comparadorordenadores(
    modifier: Modifier = Modifier,
    onComparadorordenadoresTapped: () -> Unit = {}
) {
    TopLevel(
        onComparadorordenadoresTapped = onComparadorordenadoresTapped,
        modifier = modifier
    ) {
        Textocomparadorpc(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 8.0.dp,
                    y = 8.0.dp
                )
            )
        )
        Imagencomparadorpc(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 31.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 329, heightDp = 96)
@Composable
private fun ComparadorordenadoresPreview() {
    MaterialTheme {
        RelayContainer {
            Comparadorordenadores(
                onComparadorordenadoresTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Textocomparadorpc(modifier: Modifier = Modifier) {
    RelayText(
        content = "PC & Portatiles",
        fontSize = 16.0.sp,
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
        modifier = modifier.requiredWidth(312.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Imagencomparadorpc(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.comparadorordenadores_imagencomparadorpc),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(329.0.dp).requiredHeight(65.0.dp)
    )
}

@Composable
fun TopLevel(
    onComparadorordenadoresTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        radius = 5.0,
        content = content,
        modifier = modifier.background(Color.Transparent).drawWithContent(
            onDraw = {
                drawRect(
                    brush = Brush.linearGradient(
                        0.51f to Color(
                            alpha = 255,
                            red = 58,
                            green = 75,
                            blue = 135
                        ),
                        Float.POSITIVE_INFINITY to Color(
                            alpha = 255,
                            red = 105,
                            green = 133,
                            blue = 231
                        ),
                        start = Offset(
                            0.99f,
                            0.04f
                        ),
                        end = Offset(
                            0.0f,
                            0.95f
                        )
                    )
                )
                drawContent()
            }
        ).tappable(onTap = onComparadorordenadoresTapped).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
