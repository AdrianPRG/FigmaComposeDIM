package com.alopgal962.appfigma.actividad2

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
 * This composable was generated from the UI Package 'actividad2'.
 * Generated code; do not edit directly
 *
 * @param onFavoritosTapped Para ir a favoritos
 * @param onReseAsTapped Para ir a reseñas
 */
@Composable
fun Actividad2(
    modifier: Modifier = Modifier,
    onFavoritosTapped: () -> Unit = {},
    onReseAsTapped: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Favoritos(
            onFavoritosTapped = onFavoritosTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -1.5.dp,
                    y = -31.294130325317383.dp
                )
            )
        ) {
            MaterialSymbolsFavoriteOutline(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -32.0.dp,
                        y = 0.7941303253173828.dp
                    )
                )
            ) {
                Vectorfavs(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            Favoritos(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 5.0.dp,
                        y = 0.2941303253173828.dp
                    )
                )
            )
        }
        ReseAs(
            onReseAsTapped = onReseAsTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -1.0.dp,
                    y = 30.73530387878418.dp
                )
            )
        ) {
            TusReseAs(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 10.0.dp,
                        y = -0.7353038787841797.dp
                    )
                )
            )
            MaterialSymbolsReviewsOutline(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -33.0.dp,
                        y = 0.2646961212158203.dp
                    )
                )
            ) {
                VectorreseA(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
    }
}

@Preview(widthDp = 114, heightDp = 152)
@Composable
private fun Actividad2Preview() {
    MaterialTheme {
        RelayContainer {
            Actividad2(
                onFavoritosTapped = {},
                onReseAsTapped = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Vectorfavs(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.actividad2_vectorfavs),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.25.dp,
                top = 1.65625.dp,
                end = 1.25.dp,
                bottom = 1.875.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MaterialSymbolsFavoriteOutline(
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
fun Favoritos(modifier: Modifier = Modifier) {
    RelayText(
        content = "Favoritos",
        fontSize = 9.0.sp,
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
        modifier = modifier.requiredWidth(55.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Favoritos(
    onFavoritosTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onFavoritosTapped).requiredWidth(95.0.dp).requiredHeight(35.764705657958984.dp)
    )
}

@Composable
fun TusReseAs(modifier: Modifier = Modifier) {
    RelayText(
        content = "Tus reseñas",
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
        modifier = modifier.requiredWidth(60.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun VectorreseA(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.actividad2_vectorrese_a),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.33331298828125.dp,
                top = 1.333343505859375.dp,
                end = 1.333353042602539.dp,
                bottom = 1.3333234786987305.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MaterialSymbolsReviewsOutline(
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
fun ReseAs(
    onReseAsTapped: () -> Unit,
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
        modifier = modifier.tappable(onTap = onReseAsTapped).requiredWidth(96.0.dp).requiredHeight(34.64706039428711.dp)
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
