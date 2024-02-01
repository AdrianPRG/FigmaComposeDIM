package com.alopgal962.appfigma.campodeusuario

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
 * This composable was generated from the UI Package 'campodeusuario'.
 * Generated code; do not edit directly
 */
@Composable
fun Campodeusuario(
    modifier: Modifier = Modifier,
    onBotonborrarTapped: () -> Unit = {},
    onBotonactualizarTapped: () -> Unit = {},
    contraseATextContent: String,
    emailTextContent: String
) {
    TopLevel(modifier = modifier) {
        Campopassword(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -0.00002288818359375.dp,
                    y = 8.0.dp
                )
            )
        ) {
            MdiLock(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 6.60009765625.dp,
                        y = 10.9375.dp
                    )
                )
            ) {
                Vectorpass(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            ContraseA(
                contraseATextContent = contraseATextContent,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -4.127174377441406.dp,
                        y = -0.0625.dp
                    )
                )
            )
        }
        Campoemail(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.00000762939453125.dp,
                    y = -56.25.dp
                )
            )
        ) {
            MdiUser(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 4.60009765625.dp,
                        y = 11.0.dp
                    )
                )
            ) {
                Vectoruser(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
            CorreoElectronico(
                emailTextContent = emailTextContent,
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -2.6998977661132812.dp,
                        y = 0.25.dp
                    )
                )
            )
        }
        Botonborrar(
            onBotonborrarTapped = onBotonborrarTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 64.18279266357422.dp,
                    y = 68.5.dp
                )
            )
        ) {
            Textoborrar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.46236419677734375.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        Botonactualizar(
            onBotonactualizarTapped = onBotonactualizarTapped,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -65.19351959228516.dp,
                    y = 68.5.dp
                )
            )
        ) {
            Textoactualizar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -0.46236419677734375.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 282, heightDp = 200)
@Composable
private fun CampodeusuarioPreview() {
    MaterialTheme {
        RelayContainer {
            Campodeusuario(
                onBotonborrarTapped = {},
                onBotonactualizarTapped = {},
                contraseATextContent = "Contraseña...",
                emailTextContent = "Correo electronico..",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Vectorpass(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.campodeusuario_vectorpass),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.66668701171875.dp,
                top = 0.6666641235351562.dp,
                end = 2.666646957397461.dp,
                bottom = 2.6666688919067383.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MdiLock(
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
fun ContraseA(
    contraseATextContent: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = contraseATextContent,
        fontSize = 12.0.sp,
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
        modifier = modifier.requiredWidth(153.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Campopassword(
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
        modifier = modifier.requiredWidth(226.4545440673828.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun Vectoruser(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.campodeusuario_vectoruser),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 3.0.dp,
                top = 2.666667938232422.dp,
                end = 3.0.dp,
                bottom = 2.6666650772094727.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MdiUser(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(18.0.dp).requiredHeight(16.0.dp)
    )
}

@Composable
fun CorreoElectronico(
    emailTextContent: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = emailTextContent,
        fontSize = 12.0.sp,
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
        modifier = modifier.requiredWidth(153.0.dp).requiredHeight(16.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Campoemail(
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
        modifier = modifier.requiredWidth(225.59999084472656.dp).requiredHeight(37.5.dp)
    )
}

@Composable
fun Textoborrar(modifier: Modifier = Modifier) {
    RelayText(
        content = "Borrar",
        fontSize = 11.0.sp,
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
        modifier = modifier.requiredWidth(56.0.dp).requiredHeight(15.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Botonborrar(
    onBotonborrarTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 242,
            green = 161,
            blue = 161
        ),
        isStructured = false,
        radius = 2.0,
        content = content,
        modifier = modifier.tappable(onTap = onBotonborrarTapped).requiredWidth(86.92472839355469.dp).requiredHeight(31.0.dp)
    )
}

@Composable
fun Textoactualizar(modifier: Modifier = Modifier) {
    RelayText(
        content = "Actualizar",
        fontSize = 11.0.sp,
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
        modifier = modifier.requiredWidth(54.0.dp).requiredHeight(15.0.dp).wrapContentHeight(align = Alignment.CenterVertically)
    )
}

@Composable
fun Botonactualizar(
    onBotonactualizarTapped: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 216,
            green = 236,
            blue = 200
        ),
        isStructured = false,
        radius = 2.0,
        content = content,
        modifier = modifier.tappable(onTap = onBotonactualizarTapped).requiredWidth(86.92472839355469.dp).requiredHeight(31.0.dp)
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
