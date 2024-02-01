package com.alopgal962.appfigma.menuarriba

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * Menu de arriba que permite navegar
 *
 * This composable was generated from the UI Package 'menuarriba'.
 * Generated code; do not edit directly
 *
 * @param onLupitaTapped Botón que redirige 
 * @param textoABuscar Texto para buscar
 */
@Composable
fun Menuarriba(
    modifier: Modifier = Modifier,
    onLupitaTapped: () -> Unit = {},
    textoABuscar: String
) {
    TopLevel(modifier = modifier) {
        Logo(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -138.5.dp,
                    y = 0.0.dp
                )
            )
        )
        Campobuscar(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 20.5.dp,
                    y = 0.5.dp
                )
            )
        ) {
            Textobuscar(
                textoABuscar = textoABuscar,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -33.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        Lupita(
            onLupitaTapped = onLupitaTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 96.0.dp,
                    y = 0.0.dp
                )
            )
        ) {
            Vector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Preview(widthDp = 360, heightDp = 104)
@Composable
private fun MenuarribaPreview() {
    MaterialTheme {
        RelayContainer {
            Menuarriba(
                onLupitaTapped = {},
                textoABuscar = "Pulsa para buscar...",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Logo(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.menuarriba_logo),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(67.0.dp).requiredHeight(56.0.dp)
    )
}

@Composable
fun Textobuscar(
    textoABuscar: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = textoABuscar,
        fontSize = 12.0.sp,
        fontFamily = libreBodoni,
        color = Color(
            alpha = 255,
            red = 66,
            green = 61,
            blue = 31
        ),
        height = 1.25.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(127.0.dp).requiredHeight(23.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Campobuscar(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 243,
            green = 238,
            blue = 238
        ),
        isStructured = false,
        radius = 4.0,
        content = content,
        modifier = modifier.requiredWidth(209.0.dp).requiredHeight(39.0.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.menuarriba_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.8079833984375.dp,
                top = 3.769012451171875.dp,
                end = 3.8090152740478516.dp,
                bottom = 3.845989227294922.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Lupita(
    onLupitaTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onLupitaTapped).requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.background(Color.Transparent).drawWithContent(
            onDraw = {
                drawRect(
                    brush = Brush.linearGradient(
                        0.0f to Color(
                            alpha = 255,
                            red = 73,
                            green = 100,
                            blue = 169
                        ),
                        Float.POSITIVE_INFINITY to Color(
                            alpha = 255,
                            red = 73,
                            green = 100,
                            blue = 169
                        ),
                        start = Offset(
                            0.5f,
                            0.0f
                        ),
                        end = Offset(
                            0.5f,
                            Float.POSITIVE_INFINITY
                        )
                    )
                )
                drawContent()
            }
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
