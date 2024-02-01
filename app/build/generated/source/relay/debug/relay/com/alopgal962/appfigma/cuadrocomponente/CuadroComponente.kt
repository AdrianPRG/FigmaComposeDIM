package com.alopgal962.appfigma.cuadrocomponente

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

// Design to select for CuadroComponente
enum class Property1 {
    Normal,
    Variant1,
    Variant2,
    Variant4,
    Variant5,
    Variant6,
    Variant7,
    Variant8
}

/**
 * This composable was generated from the UI Package 'cuadro_componente'.
 * Generated code; do not edit directly
 */
@Composable
fun CuadroComponente(
    modifier: Modifier = Modifier,
    property1: Property1 = Property1.Normal
) {
    when (property1) {
        Property1.Normal -> TopLevelProperty1Normal(modifier = modifier) {
            CaracteristicascomponenteProperty1Normal(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 64.0.dp
                    )
                )
            ) {
                PrecioProperty1Normal(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 48.0.dp,
                            y = 0.0.dp
                        )
                    )
                ) {
                    Class230Property1Normal(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                }
                LenovoIdeaPadIntelCeleronN4020156Property1Normal(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -24.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
            ImagencomponenteProperty1Normal(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -20.0.dp
                    )
                )
            )
        }
        Property1.Variant1 -> TopLevelProperty1Variant1(modifier = modifier) {
            CaracteristicascomponenteProperty1Variant1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 64.0.dp
                    )
                )
            ) {
                PrecioProperty1Variant1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 48.0.dp,
                            y = 0.0.dp
                        )
                    )
                ) {
                    Class280Property1Variant1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                }
                IntelCoreI514500265GHzProperty1Variant1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -24.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
            ImagencomponenteProperty1Variant1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -20.0.dp
                    )
                )
            )
        }
        Property1.Variant2 -> TopLevelProperty1Variant2(modifier = modifier) {
            CaracteristicascomponenteProperty1Variant2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 64.0.dp
                    )
                )
            ) {
                PrecioProperty1Variant2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 48.0.dp,
                            y = 0.0.dp
                        )
                    )
                ) {
                    Class52Property1Variant2(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                }
                KingstonFURYDDR43200MHz16GBProperty1Variant2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -24.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
            ImagencomponenteProperty1Variant2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -20.0.dp
                    )
                )
            )
        }
        Property1.Variant4 -> TopLevelProperty1Variant4(modifier = modifier) {
            CaracteristicascomponenteProperty1Variant4(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 64.0.dp
                    )
                )
            ) {
                PrecioProperty1Variant4(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 48.0.dp,
                            y = 0.0.dp
                        )
                    )
                ) {
                    Class105Property1Variant4(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                }
                GigabyteB760MDS3HDDR4Property1Variant4(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -24.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
            ImagencomponenteProperty1Variant4(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -20.0.dp
                    )
                )
            )
        }
        Property1.Variant5 -> TopLevelProperty1Variant5(modifier = modifier) {
            CaracteristicascomponenteProperty1Variant5(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 64.0.dp
                    )
                )
            ) {
                PrecioProperty1Variant5(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 48.0.dp,
                            y = 0.0.dp
                        )
                    )
                ) {
                    Class45Property1Variant5(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                }
                TempestLiquidCooler120KitProperty1Variant5(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -24.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
            ImagencomponenteProperty1Variant5(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -20.0.dp
                    )
                )
            )
        }
        Property1.Variant6 -> TopLevelProperty1Variant6(modifier = modifier) {
            CaracteristicascomponenteProperty1Variant6(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 64.0.dp
                    )
                )
            ) {
                PrecioProperty1Variant6(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 48.0.dp,
                            y = 0.0.dp
                        )
                    )
                ) {
                    Class47Property1Variant6(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                }
                TempestPSUPRO750W80BronzeProperty1Variant6(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -24.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
            ImagencomponenteProperty1Variant6(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -20.0.dp
                    )
                )
            )
        }
        Property1.Variant7 -> TopLevelProperty1Variant7(modifier = modifier) {
            CaracteristicascomponenteProperty1Variant7(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 64.0.dp
                    )
                )
            ) {
                PrecioProperty1Variant7(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 48.0.dp,
                            y = 0.0.dp
                        )
                    )
                ) {
                    Class250Property1Variant7(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                }
                MSICubi5IntelCoreI31215UProperty1Variant7(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -24.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
            ImagencomponenteProperty1Variant7(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -20.0.dp
                    )
                )
            )
        }
        Property1.Variant8 -> TopLevelProperty1Variant8(modifier = modifier) {
            CaracteristicascomponenteProperty1Variant8(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 64.0.dp
                    )
                )
            ) {
                PrecioProperty1Variant8(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 48.0.dp,
                            y = 0.0.dp
                        )
                    )
                ) {
                    Class230Property1Variant8(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                }
                TempestSpectraRGBTorreATXBlancaProperty1Variant8(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -24.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
            ImagencomponenteProperty1Variant8(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -20.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 168)
@Composable
private fun CuadroComponenteProperty1NormalPreview() {
    MaterialTheme {
        RelayContainer {
            CuadroComponente(
                property1 = Property1.Normal,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 168)
@Composable
private fun CuadroComponenteProperty1Variant1Preview() {
    MaterialTheme {
        RelayContainer {
            CuadroComponente(
                property1 = Property1.Variant1,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 168)
@Composable
private fun CuadroComponenteProperty1Variant2Preview() {
    MaterialTheme {
        RelayContainer {
            CuadroComponente(
                property1 = Property1.Variant2,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 168)
@Composable
private fun CuadroComponenteProperty1Variant4Preview() {
    MaterialTheme {
        RelayContainer {
            CuadroComponente(
                property1 = Property1.Variant4,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 168)
@Composable
private fun CuadroComponenteProperty1Variant5Preview() {
    MaterialTheme {
        RelayContainer {
            CuadroComponente(
                property1 = Property1.Variant5,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 168)
@Composable
private fun CuadroComponenteProperty1Variant6Preview() {
    MaterialTheme {
        RelayContainer {
            CuadroComponente(
                property1 = Property1.Variant6,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 168)
@Composable
private fun CuadroComponenteProperty1Variant7Preview() {
    MaterialTheme {
        RelayContainer {
            CuadroComponente(
                property1 = Property1.Variant7,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 152, heightDp = 168)
@Composable
private fun CuadroComponenteProperty1Variant8Preview() {
    MaterialTheme {
        RelayContainer {
            CuadroComponente(
                property1 = Property1.Variant8,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Class230Property1Normal(modifier: Modifier = Modifier) {
    RelayText(
        content = "230\$",
        fontSize = 8.0.sp,
        fontFamily = libreBodoni,
        color = Color(
            alpha = 255,
            red = 30,
            green = 49,
            blue = 118
        ),
        height = 1.25.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(34.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun PrecioProperty1Normal(
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
        clipToParent = false,
        radius = 7.0,
        content = content,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun LenovoIdeaPadIntelCeleronN4020156Property1Normal(modifier: Modifier = Modifier) {
    RelayText(
        content = "Lenovo IdeaPad | Intel Celeron N4020  15.6",
        fontSize = 9.0.sp,
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
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(30.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun CaracteristicascomponenteProperty1Normal(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 56,
            green = 73,
            blue = 127
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(152.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun ImagencomponenteProperty1Normal(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cuadro_componente_imagencomponente),
        radius = 8.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(152.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun TopLevelProperty1Normal(
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
        radius = 8.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Class280Property1Variant1(modifier: Modifier = Modifier) {
    RelayText(
        content = "280\$",
        fontSize = 8.0.sp,
        fontFamily = libreBodoni,
        color = Color(
            alpha = 255,
            red = 30,
            green = 49,
            blue = 118
        ),
        height = 1.25.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(34.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun PrecioProperty1Variant1(
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
        clipToParent = false,
        radius = 7.0,
        content = content,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun IntelCoreI514500265GHzProperty1Variant1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Intel Core i5-14500 2.6/5GHz",
        fontSize = 9.0.sp,
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
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(30.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun CaracteristicascomponenteProperty1Variant1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 56,
            green = 73,
            blue = 127
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(152.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun ImagencomponenteProperty1Variant1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cuadro_componente_imagencomponente1),
        radius = 8.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(152.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant1(
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
        radius = 8.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Class52Property1Variant2(modifier: Modifier = Modifier) {
    RelayText(
        content = "52\$",
        fontSize = 8.0.sp,
        fontFamily = libreBodoni,
        color = Color(
            alpha = 255,
            red = 30,
            green = 49,
            blue = 118
        ),
        height = 1.25.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(34.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun PrecioProperty1Variant2(
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
        clipToParent = false,
        radius = 7.0,
        content = content,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun KingstonFURYDDR43200MHz16GBProperty1Variant2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Kingston FURY DDR4 3200MHz 16GB",
        fontSize = 9.0.sp,
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
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(30.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun CaracteristicascomponenteProperty1Variant2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 56,
            green = 73,
            blue = 127
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(152.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun ImagencomponenteProperty1Variant2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cuadro_componente_imagencomponente2),
        radius = 8.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(152.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant2(
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
        radius = 8.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Class105Property1Variant4(modifier: Modifier = Modifier) {
    RelayText(
        content = "105\$",
        fontSize = 8.0.sp,
        fontFamily = libreBodoni,
        color = Color(
            alpha = 255,
            red = 30,
            green = 49,
            blue = 118
        ),
        height = 1.25.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(34.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun PrecioProperty1Variant4(
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
        clipToParent = false,
        radius = 7.0,
        content = content,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun GigabyteB760MDS3HDDR4Property1Variant4(modifier: Modifier = Modifier) {
    RelayText(
        content = "Gigabyte B760M DS3H DDR4",
        fontSize = 9.0.sp,
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
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(30.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun CaracteristicascomponenteProperty1Variant4(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 56,
            green = 73,
            blue = 127
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(152.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun ImagencomponenteProperty1Variant4(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cuadro_componente_imagencomponente3),
        radius = 8.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(152.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant4(
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
        radius = 8.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Class45Property1Variant5(modifier: Modifier = Modifier) {
    RelayText(
        content = "45\$",
        fontSize = 8.0.sp,
        fontFamily = libreBodoni,
        color = Color(
            alpha = 255,
            red = 30,
            green = 49,
            blue = 118
        ),
        height = 1.25.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(34.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun PrecioProperty1Variant5(
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
        clipToParent = false,
        radius = 7.0,
        content = content,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun TempestLiquidCooler120KitProperty1Variant5(modifier: Modifier = Modifier) {
    RelayText(
        content = "Tempest Liquid Cooler 120 Kit",
        fontSize = 9.0.sp,
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
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(30.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun CaracteristicascomponenteProperty1Variant5(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 56,
            green = 73,
            blue = 127
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(152.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun ImagencomponenteProperty1Variant5(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cuadro_componente_imagencomponente4),
        radius = 8.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(152.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant5(
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
        radius = 8.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Class47Property1Variant6(modifier: Modifier = Modifier) {
    RelayText(
        content = "47\$",
        fontSize = 8.0.sp,
        fontFamily = libreBodoni,
        color = Color(
            alpha = 255,
            red = 30,
            green = 49,
            blue = 118
        ),
        height = 1.25.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(34.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun PrecioProperty1Variant6(
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
        clipToParent = false,
        radius = 7.0,
        content = content,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun TempestPSUPRO750W80BronzeProperty1Variant6(modifier: Modifier = Modifier) {
    RelayText(
        content = "Tempest PSU PRO 750W 80+ Bronze",
        fontSize = 9.0.sp,
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
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(30.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun CaracteristicascomponenteProperty1Variant6(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 56,
            green = 73,
            blue = 127
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(152.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun ImagencomponenteProperty1Variant6(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cuadro_componente_imagencomponente5),
        radius = 8.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(152.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant6(
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
        radius = 8.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Class250Property1Variant7(modifier: Modifier = Modifier) {
    RelayText(
        content = "250\$",
        fontSize = 8.0.sp,
        fontFamily = libreBodoni,
        color = Color(
            alpha = 255,
            red = 30,
            green = 49,
            blue = 118
        ),
        height = 1.25.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(34.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun PrecioProperty1Variant7(
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
        clipToParent = false,
        radius = 7.0,
        content = content,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun MSICubi5IntelCoreI31215UProperty1Variant7(modifier: Modifier = Modifier) {
    RelayText(
        content = "MSI Cubi 5 Intel Core i3-1215U",
        fontSize = 9.0.sp,
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
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(30.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun CaracteristicascomponenteProperty1Variant7(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 56,
            green = 73,
            blue = 127
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(152.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun ImagencomponenteProperty1Variant7(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cuadro_componente_imagencomponente6),
        radius = 8.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(152.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant7(
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
        radius = 8.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Class230Property1Variant8(modifier: Modifier = Modifier) {
    RelayText(
        content = "230\$",
        fontSize = 8.0.sp,
        fontFamily = libreBodoni,
        color = Color(
            alpha = 255,
            red = 30,
            green = 49,
            blue = 118
        ),
        height = 1.25.em,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(34.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun PrecioProperty1Variant8(
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
        clipToParent = false,
        radius = 7.0,
        content = content,
        modifier = modifier.requiredWidth(40.0.dp).requiredHeight(24.0.dp)
    )
}

@Composable
fun TempestSpectraRGBTorreATXBlancaProperty1Variant8(modifier: Modifier = Modifier) {
    RelayText(
        content = "Tempest Spectra RGB Torre ATX Blanca",
        fontSize = 9.0.sp,
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
        modifier = modifier.requiredWidth(96.0.dp).requiredHeight(30.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun CaracteristicascomponenteProperty1Variant8(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 56,
            green = 73,
            blue = 127
        ),
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(152.0.dp).requiredHeight(40.0.dp)
    )
}

@Composable
fun ImagencomponenteProperty1Variant8(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.cuadro_componente_imagencomponente7),
        radius = 8.0,
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(152.0.dp).requiredHeight(128.0.dp)
    )
}

@Composable
fun TopLevelProperty1Variant8(
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
        radius = 8.0,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
