package com.alopgal962.appfigma.actividad1

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.alopgal962.appfigma.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'actividad1'.
 * Generated code; do not edit directly
 *
 * @param onHistorialcompraTapped Para ir a historial
 * @param onComparacionesTapped Para ir a comparaciones
 */
@Composable
fun Actividad1(
    modifier: Modifier = Modifier,
    onHistorialcompraTapped: () -> Unit = {},
    onComparacionesTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Historialcompra(
            onHistorialcompraTapped = onHistorialcompraTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.000026702880859375.dp,
                    y = -30.626869201660156.dp
                )
            )
        ) {
            HistorialDeCompra(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 8.49997329711914.dp,
                        y = -0.37313079833984375.dp
                    )
                )
            )
            MaterialSymbolsHistoryRounded(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -47.00002670288086.dp,
                        y = -0.37313079833984375.dp
                    )
                )
            ) {
                Vectorhistorial(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        Comparaciones(
            onComparacionesTapped = onComparacionesTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.4967613220214844.dp,
                    y = 32.895530700683594.dp
                )
            )
        ) {
            FluentMdl2CompareUneven(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -42.107845306396484.dp,
                        y = -1.6492538452148438.dp
                    )
                )
            ) {
                Vectorcomp(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            Comparaciones(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 13.023563385009766.dp,
                        y = -0.000011444091796875.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 152)
@Composable
private fun Actividad1Preview() {
    MaterialTheme {
        RelayContainer {
            Actividad1(
                onHistorialcompraTapped = {},
                onComparacionesTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun HistorialDeCompra(modifier: Modifier = Modifier) {
    RelayText(
        content = "Historial de compra",
        fontSize = 9.0.sp,
        fontFamily = libreBodoni,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.25.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(91.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Vectorhistorial(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.actividad1_vectorhistorial),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.0.dp,
                top = 2.0.dp,
                end = 1.9999990463256836.dp,
                bottom = 1.9999980926513672.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MaterialSymbolsHistoryRounded(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(16.0.dp).requiredHeight(16.0.dp)
    )
}

@Composable
fun Historialcompra(
    onHistorialcompraTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        radius = 5.0,
        content = content,
        modifier = modifier.tappable(onTap = onHistorialcompraTapped).requiredWidth(118.22222137451172.dp).requiredHeight(36.29850769042969.dp)
    )
}

@Composable
fun Vectorcomp(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.actividad1_vectorcomp),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.9375.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun FluentMdl2CompareUneven(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(15.0.dp).requiredHeight(15.0.dp)
    )
}

@Composable
fun Comparaciones(modifier: Modifier = Modifier) {
    RelayText(
        content = "Comparaciones",
        fontSize = 10.0.sp,
        fontFamily = libreBodoni,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.25.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(79.1431884765625.dp).requiredHeight(18.149253845214844.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Comparaciones(
    onComparacionesTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        radius = 5.0,
        content = content,
        modifier = modifier.tappable(onTap = onComparacionesTapped).requiredWidth(119.21569061279297.dp).requiredHeight(36.29850769042969.dp)
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
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
