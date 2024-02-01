package com.alopgal962.appfigma.menuabajo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.alopgal962.appfigma.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * Componente de la parte de abajo para las screens para la navegación
 *
 * This composable was generated from the UI Package 'menuabajo'.
 * Generated code; do not edit directly
 *
 * @param onUsuarioTapped Al pulsar va a la sección usuario
 * @param onBuscarTapped Al pulsar va a la sección buscar
 * @param onCarritoTapped Al pulsar va a la seccion carrito
 * @param onCasaTapped Al pulsar va a la sección home
 */
@Composable
fun Menuabajo(
    modifier: Modifier = Modifier,
    onUsuarioTapped: () -> Unit = {},
    onBuscarTapped: () -> Unit = {},
    onCarritoTapped: () -> Unit = {},
    onCasaTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Usuario(
            onUsuarioTapped = onUsuarioTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 124.0.dp,
                    y = 0.5.dp
                )
            )
        ) {
            Vector(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Buscar(
            onBuscarTapped = onBuscarTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 36.0.dp,
                    y = 0.5.dp
                )
            )
        ) {
            Vector3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Carrito(
            onCarritoTapped = onCarritoTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -52.0.dp,
                    y = 0.5.dp
                )
            )
        ) {
            Vector2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Casa(
            onCasaTapped = onCasaTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -132.0.dp,
                    y = 0.5.dp
                )
            )
        ) {
            Vector1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.6021833419799805.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 360, heightDp = 64)
@Composable
private fun MenuabajoPreview() {
    MaterialTheme {
        RelayContainer {
            Menuabajo(
                onUsuarioTapped = {},
                onBuscarTapped = {},
                onCarritoTapped = {},
                onCasaTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.menuabajo_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.84210205078125.dp,
                top = 2.4736785888671875.dp,
                end = 9.15789794921875.dp,
                bottom = 3.4013214111328125.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Usuario(
    onUsuarioTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onUsuarioTapped).requiredWidth(48.0.dp).requiredHeight(47.0.dp)
    )
}

@Composable
fun Vector3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.menuabajo_vector3),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.61602783203125.dp,
                top = 7.380950927734375.dp,
                end = 7.617973327636719.dp,
                bottom = 7.531761169433594.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Buscar(
    onBuscarTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onBuscarTapped).requiredWidth(48.0.dp).requiredHeight(47.0.dp)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.menuabajo_vector2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 6.4000244140625.dp,
                top = 5.465118408203125.dp,
                end = 6.467491149902344.dp,
                bottom = 5.08050537109375.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Carrito(
    onCarritoTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onCarritoTapped).requiredWidth(48.0.dp).requiredHeight(47.0.dp)
    )
}

@Composable
fun Vector1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.menuabajo_vector1),
        modifier = modifier.requiredWidth(28.0.dp).requiredHeight(30.128957748413086.dp)
    )
}

@Composable
fun Casa(
    onCasaTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.tappable(onTap = onCasaTapped).requiredWidth(48.0.dp).requiredHeight(47.0.dp)
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
                        0.31f to Color(
                            alpha = 255,
                            red = 19,
                            green = 37,
                            blue = 81
                        ),
                        0.99f to Color(
                            alpha = 255,
                            red = 73,
                            green = 100,
                            blue = 169
                        ),
                        start = Offset(
                            Float.POSITIVE_INFINITY,
                            0.06f
                        ),
                        end = Offset(
                            0.0f,
                            Float.POSITIVE_INFINITY
                        )
                    )
                )
                drawContent()
            }
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
