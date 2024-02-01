package com.alopgal962.appfigma.productos

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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
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

// Design to select for Productos
enum class Property1 {
    Variante2,
    Variante1,
    Normal
}

/**
 * This composable was generated from the UI Package 'productos'.
 * Generated code; do not edit directly
 *
 * @param onQuitarTapped Eliminar cantidad/producto del carrito
 * @param onAAdirTapped añadir mas cantidad de un producto al carrito
 */
@Composable
fun Productos(
    modifier: Modifier = Modifier,
    property1: Property1 = Property1.Variante2,
    onQuitarTapped: () -> Unit = {},
    onAAdirTapped: () -> Unit = {},
    tipoProducto: String
) {
    when (property1) {
        Property1.Variante2 -> TopLevelProperty1Variante2(modifier = modifier) {
            EspecificacionesProperty1Variante2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 131.0.dp,
                        y = 36.0.dp
                    )
                )
            ) {
                MarcaAsusModeloVivoBookPrecio499ProcesadorI51235Ram16GBDDR4Property1Variante2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 8.0.dp,
                            y = 10.0.dp
                        )
                    )
                )
            }
            ImagencompoProperty1Variante2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 36.0.dp
                    )
                )
            )
            PortatilProperty1Variante2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 15.0.dp,
                        y = 11.0.dp
                    )
                )
            )
            QuitarProperty1Variante2(
                onQuitarTapped = onQuitarTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 224.0.dp,
                        y = 4.0.dp
                    )
                )
            ) {
                Vectorve2Property1Variante2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            AAdirProperty1Variante2(
                onAAdirTapped = onAAdirTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 184.0.dp,
                        y = 4.0.dp
                    )
                )
            ) {
                Vectorv2Property1Variante2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        Property1.Variante1 -> TopLevelProperty1Variante1(modifier = modifier) {
            EspecificacionesProperty1Variante1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 131.0.dp,
                        y = 36.0.dp
                    )
                )
            ) {
                MarcaCorsairModeloVengeancePrecio49TecnologiaDDR4Property1Variante1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 8.0.dp,
                            y = 10.0.dp
                        )
                    )
                )
            }
            ImagencompoProperty1Variante1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 36.0.dp
                    )
                )
            )
            ComponenteProperty1Variante1(
                tipoProducto = tipoProducto,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 15.0.dp,
                        y = 11.0.dp
                    )
                )
            )
            QuitarProperty1Variante1(
                onQuitarTapped = onQuitarTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 232.0.dp,
                        y = 4.0.dp
                    )
                )
            ) {
                Vectorve1Property1Variante1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            AAdirProperty1Variante1(
                onAAdirTapped = onAAdirTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 192.0.dp,
                        y = 4.0.dp
                    )
                )
            ) {
                Vectorv1Property1Variante1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
        Property1.Normal -> TopLevelProperty1Normal(modifier = modifier) {
            EspecificacionesProperty1Normal(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 65.5.dp,
                        y = 18.0.dp
                    )
                )
            ) {
                MarcaAsusModeloH610MPrecio100SocketLGA1700Property1Normal(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.5.dp,
                            y = 0.5.dp
                        )
                    )
                )
            }
            ImagencompoProperty1Normal(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopCenter,
                    offset = DpOffset(
                        x = -66.0.dp,
                        y = 36.0.dp
                    )
                )
            )
            ComponenteProperty1Normal(
                tipoProducto = tipoProducto,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -65.5.dp,
                        y = -44.5.dp
                    )
                )
            )
            AAdirProperty1Normal(
                onAAdirTapped = onAAdirTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 72.5.dp,
                        y = -47.5.dp
                    )
                )
            ) {
                Vectorv0Property1Normal(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            QuitarProperty1Normal(
                onQuitarTapped = onQuitarTapped,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 112.5.dp,
                        y = -47.5.dp
                    )
                )
            ) {
                Vectorve0Property1Normal(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
    }
}

@Preview(widthDp = 263, heightDp = 127)
@Composable
private fun ProductosProperty1Variante2Preview() {
    MaterialTheme {
        RelayContainer {
            Productos(
                onQuitarTapped = {},
                onAAdirTapped = {},
                tipoProducto = "Componente",
                property1 = Property1.Variante2,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 263, heightDp = 127)
@Composable
private fun ProductosProperty1Variante1Preview() {
    MaterialTheme {
        RelayContainer {
            Productos(
                onQuitarTapped = {},
                onAAdirTapped = {},
                tipoProducto = "Componente",
                property1 = Property1.Variante1,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 263, heightDp = 127)
@Composable
private fun ProductosProperty1NormalPreview() {
    MaterialTheme {
        RelayContainer {
            Productos(
                onQuitarTapped = {},
                onAAdirTapped = {},
                tipoProducto = "Componente",
                property1 = Property1.Normal,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun MarcaAsusModeloVivoBookPrecio499ProcesadorI51235Ram16GBDDR4Property1Variante2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Marca: Asus\nModelo: VivoBook\nPrecio:  499\$\nProcesador: I5-1235\nRam: 16 GB DDR4",
        fontSize = 10.0.sp,
        fontFamily = libreBodoni,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.25.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(115.0.dp).requiredHeight(72.0.dp)
    )
}

@Composable
fun EspecificacionesProperty1Variante2(
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
        content = content,
        modifier = modifier.requiredWidth(132.0.dp).requiredHeight(91.0.dp)
    )
}

@Composable
fun ImagencompoProperty1Variante2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.productos_imagencompo),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(131.0.dp).requiredHeight(91.0.dp)
    )
}

@Composable
fun PortatilProperty1Variante2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Portatil",
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
        modifier = modifier.requiredWidth(102.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Vectorve2Property1Variante2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.productos_vectorve2),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 5.0.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun QuitarProperty1Variante2(
    onQuitarTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 235,
            green = 130,
            blue = 130
        ),
        isStructured = false,
        radius = 3.0,
        content = content,
        modifier = modifier.tappable(onTap = onQuitarTapped).requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Vectorv2Property1Variante2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.productos_vectorv2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.0.dp,
                top = 2.0.dp,
                end = 1.9999980926513672.dp,
                bottom = 1.9999980926513672.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun AAdirProperty1Variante2(
    onAAdirTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 39,
            green = 152,
            blue = 57
        ),
        isStructured = false,
        radius = 3.0,
        content = content,
        modifier = modifier.tappable(onTap = onAAdirTapped).requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variante2(
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
                        0.4f to Color(
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
                            0.98f,
                            0.02f
                        ),
                        end = Offset(
                            0.03f,
                            Float.POSITIVE_INFINITY
                        )
                    )
                )
                drawContent()
            }
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MarcaCorsairModeloVengeancePrecio49TecnologiaDDR4Property1Variante1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Marca: Corsair\nModelo: Vengeance\nPrecio:  49\$\nTecnologia: DDR4",
        fontSize = 10.0.sp,
        fontFamily = libreBodoni,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.25.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(115.0.dp).requiredHeight(72.0.dp)
    )
}

@Composable
fun EspecificacionesProperty1Variante1(
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
        content = content,
        modifier = modifier.requiredWidth(132.0.dp).requiredHeight(91.0.dp)
    )
}

@Composable
fun ImagencompoProperty1Variante1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.productos_imagencompo1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(131.0.dp).requiredHeight(91.0.dp)
    )
}

@Composable
fun ComponenteProperty1Variante1(
    tipoProducto: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = tipoProducto,
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
        modifier = modifier.requiredWidth(102.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Vectorve1Property1Variante1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.productos_vectorve1),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 5.0.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun QuitarProperty1Variante1(
    onQuitarTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 235,
            green = 130,
            blue = 130
        ),
        isStructured = false,
        radius = 3.0,
        content = content,
        modifier = modifier.tappable(onTap = onQuitarTapped).requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Vectorv1Property1Variante1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.productos_vectorv1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.0.dp,
                top = 2.0.dp,
                end = 1.9999980926513672.dp,
                bottom = 1.9999980926513672.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun AAdirProperty1Variante1(
    onAAdirTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 39,
            green = 152,
            blue = 57
        ),
        isStructured = false,
        radius = 3.0,
        content = content,
        modifier = modifier.tappable(onTap = onAAdirTapped).requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variante1(
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
                        0.4f to Color(
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
                            0.98f,
                            0.02f
                        ),
                        end = Offset(
                            0.03f,
                            Float.POSITIVE_INFINITY
                        )
                    )
                )
                drawContent()
            }
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MarcaAsusModeloH610MPrecio100SocketLGA1700Property1Normal(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontFamily = libreBodoni,
                    fontWeight = FontWeight(500.0.toInt())
                )
            ) {
                append("Marca")
            }
            append(": Asus\n")
            withStyle(
                style = SpanStyle(
                    fontFamily = libreBodoni,
                    fontWeight = FontWeight(500.0.toInt())
                )
            ) {
                append("Modelo")
            }
            append(": H610M\n")
            withStyle(
                style = SpanStyle(
                    fontFamily = libreBodoni,
                    fontWeight = FontWeight(500.0.toInt())
                )
            ) {
                append("Precio")
            }
            append(":  100\$\n")
            withStyle(
                style = SpanStyle(
                    fontFamily = libreBodoni,
                    fontWeight = FontWeight(500.0.toInt())
                )
            ) {
                append("Socket")
            }
            append(": LGA 1700")
        },
        fontSize = 10.0.sp,
        fontFamily = libreBodoni,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 1.25.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(115.0.dp).requiredHeight(72.0.dp)
    )
}

@Composable
fun EspecificacionesProperty1Normal(
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
        content = content,
        modifier = modifier.requiredWidth(132.0.dp).requiredHeight(91.0.dp)
    )
}

@Composable
fun ImagencompoProperty1Normal(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.productos_imagencompo2),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.requiredWidth(131.0.dp).requiredHeight(91.0.dp)
    )
}

@Composable
fun ComponenteProperty1Normal(
    tipoProducto: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = tipoProducto,
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
        modifier = modifier.requiredWidth(102.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Vectorv0Property1Normal(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.productos_vectorv0),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.0.dp,
                top = 2.0.dp,
                end = 1.9999980926513672.dp,
                bottom = 1.9999980926513672.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun AAdirProperty1Normal(
    onAAdirTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 39,
            green = 152,
            blue = 57
        ),
        isStructured = false,
        radius = 3.0,
        content = content,
        modifier = modifier.tappable(onTap = onAAdirTapped).requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun Vectorve0Property1Normal(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.productos_vectorve0),
        modifier = modifier.padding(paddingValues = PaddingValues(all = 5.0.dp)).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun QuitarProperty1Normal(
    onQuitarTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 235,
            green = 130,
            blue = 130
        ),
        isStructured = false,
        radius = 3.0,
        content = content,
        modifier = modifier.tappable(onTap = onQuitarTapped).requiredWidth(24.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun TopLevelProperty1Normal(
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
                        0.4f to Color(
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
                            0.98f,
                            0.02f
                        ),
                        end = Offset(
                            0.03f,
                            Float.POSITIVE_INFINITY
                        )
                    )
                )
                drawContent()
            }
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
