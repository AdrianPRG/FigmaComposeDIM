package com.alopgal962.appfigma.screens

import android.annotation.SuppressLint
import android.util.Log
import android.view.RoundedCorner
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.alopgal962.appfigma.actividad1.Actividad1
import com.alopgal962.appfigma.actividad2.Actividad2
import com.alopgal962.appfigma.apartadocarrito.ApartadoCarrito
import com.alopgal962.appfigma.apartadodatosregistros.Apartadodatosregistros
import com.alopgal962.appfigma.apartadoprivacidadseguridad.Apartadoprivacidadseguridad
import com.alopgal962.appfigma.campodeusuario.Campodeusuario
import com.alopgal962.appfigma.comparadorcomponentes.Comparadorcomponentes
import com.alopgal962.appfigma.comparadores.Comparadores
import com.alopgal962.appfigma.comparadorordenadores.Comparadorordenadores
import com.alopgal962.appfigma.comparadorprecio.Comparadorprecio
import com.alopgal962.appfigma.cuadrocomponente.CuadroComponente
import com.alopgal962.appfigma.datosusuario.Datosusuario
import com.alopgal962.appfigma.menuabajo.Menuabajo
import com.alopgal962.appfigma.menuarriba.Menuarriba
import com.alopgal962.appfigma.ofertas.Ofertas
import com.alopgal962.appfigma.ofertascomponentes.Ofertascomponentes
import com.alopgal962.appfigma.ofertasportatiles.Ofertasportatiles
import com.alopgal962.appfigma.productos.Productos
import com.alopgal962.appfigma.productos.Property1
import com.alopgal962.appfigma.routes.Routes
import com.alopgal962.appfigma.totalcarrito.Totalcarrito


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screenprinci(navController: NavController) {
    Scaffold(
        topBar = {
            Menuarriba(
                textoABuscar = "Pulsa para buscar...",
                modifier = Modifier.size(415.dp, 100.dp)
            )
        },
        bottomBar = {
            Menuabajo(
                modifier = Modifier.size(415.dp, 80.dp),
                onUsuarioTapped = { navController.navigate(Routes.screenusuario.route) },
                onBuscarTapped = { navController.navigate(Routes.screenbucar.route) },
                onCarritoTapped = { navController.navigate(Routes.screencarrito.route) }
            )
        }) {
        //Columna que muestra la pantalla del centro
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 100.dp, bottom = 80.dp)
                .background(Color(240, 235, 242)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(Modifier.padding(top = 30.dp)) {
                Ofertas(Modifier.size(120.dp, 35.dp))
            }
            Row(Modifier.padding(top = 30.dp)) {
                Ofertasportatiles(
                    Modifier
                        .size(148.dp, 120.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
                Spacer(modifier = Modifier.padding(15.dp))
                Ofertascomponentes(
                    Modifier
                        .size(148.dp, 120.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
            }
            Row(Modifier.padding(top = 40.dp)) {
                Comparadores(modifier = Modifier.size(140.dp, 35.dp))
            }
            Row(Modifier.padding(top = 40.dp)) {
                Comparadorprecio(
                    Modifier
                        .size(148.dp, 120.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
                Spacer(modifier = Modifier.padding(15.dp))
                Comparadorcomponentes(
                    Modifier
                        .size(148.dp, 120.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
            }
            Row(Modifier.padding(top = 40.dp)) {
                Comparadorordenadores(
                    Modifier
                        .size(328.dp, 95.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun Screenusuario(navController: NavController) {
    Scaffold(
        topBar = {
            Menuarriba(
                textoABuscar = "Pulsa para buscar...",
                modifier = Modifier.size(415.dp, 100.dp)
            )
        },
        bottomBar = {
            Menuabajo(
                modifier = Modifier.size(415.dp, 80.dp),
                onCasaTapped = { navController.navigate(Routes.screeninicial.route) },
                onCarritoTapped = { navController.navigate(Routes.screencarrito.route) },
                onBuscarTapped = { navController.navigate(Routes.screenbucar.route) }
            )
        }) {
        Column(
            modifier = Modifier
                .padding(top = 100.dp)
                .fillMaxSize()
                .background(Color(240, 235, 242)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Apartadoprivacidadseguridad(
                modifier = Modifier
                    .padding(top = 30.dp)
                    .size(190.dp, 40.dp)
                    .clip(RoundedCornerShape(10.dp))
            )
            Campodeusuario(
                contraseATextContent = "Contraseña...",
                emailTextContent = "Nombre de usuario...",
                modifier = Modifier
                    .size(320.dp, 270.dp)
                    .padding(top = 30.dp)
                    .clip(RoundedCornerShape(10.dp))
            )
            Apartadodatosregistros(
                modifier = Modifier
                    .padding(top = 30.dp)
                    .size(190.dp, 40.dp)
                    .clip(RoundedCornerShape(10.dp))
            )
            Row(modifier = Modifier.padding(top = 30.dp)) {
                Actividad2(
                    modifier = Modifier
                        .padding(end = 30.dp)
                        .size(120.dp, 170.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
                Actividad1(
                    modifier = Modifier
                        .padding()
                        .size(170.dp, 170.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screencarrito(navController: NavController) {
    Scaffold(
        topBar = {
            Menuarriba(
                textoABuscar = "Pulsa para buscar...",
                modifier = Modifier.size(415.dp, 100.dp)
            )
        },
        bottomBar = {
            Menuabajo(
                modifier = Modifier.size(415.dp, 80.dp),
                onCasaTapped = { navController.navigate(Routes.screeninicial.route) },
                onUsuarioTapped = { navController.navigate(Routes.screenusuario.route) },
                onBuscarTapped = { navController.navigate(Routes.screenbucar.route) }
            )
        }) {
        Column(
            modifier = Modifier
                .padding(top = 100.dp)
                .fillMaxSize()
                .background(Color(240, 235, 242)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ApartadoCarrito(
                modifier = Modifier
                    .size(120.dp, 60.dp)
                    .padding(top = 30.dp)
            )
            Productos(
                modifier = Modifier
                    .padding(top = 40.dp)
                    .size(260.dp, 127.dp)
                    .clip(RoundedCornerShape(5.dp)),
                tipoProducto = "Componente",
                onAAdirTapped = { Log.d("añadido", "cantidad de producto añadida") },
                onQuitarTapped = { Log.d("eliminado", "producto eliminado de carro") },
                property1 = Property1.Normal
            )
            Productos(
                modifier = Modifier
                    .padding(top = 40.dp)
                    .size(260.dp, 127.dp)
                    .clip(RoundedCornerShape(5.dp)),
                tipoProducto = "Componente",
                onAAdirTapped = { Log.d("añadido", "cantidad de producto añadida") },
                onQuitarTapped = { Log.d("eliminado", "producto eliminado de carro") },
                property1 = Property1.Variante1
            )
            Productos(
                modifier = Modifier
                    .padding(top = 40.dp)
                    .size(260.dp, 127.dp)
                    .clip(RoundedCornerShape(5.dp)),
                tipoProducto = "Portatil",
                onAAdirTapped = { Log.d("añadido", "cantidad de producto añadida") },
                onQuitarTapped = { Log.d("eliminado", "producto eliminado de carro") },
                property1 = Property1.Variante2
            )
            Totalcarrito(
                precioTotalCarritoTextContent = "Precio del carrito: 602$",
                modifier = Modifier.padding(top = 30.dp)
            )
        }

    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenBuscar(navController: NavController) {
    Scaffold(
        topBar = {
            Menuarriba(
                textoABuscar = "Pulsa para buscar...",
                modifier = Modifier.size(415.dp, 100.dp)
            )
        },
        bottomBar = {
            Menuabajo(
                modifier = Modifier.size(415.dp, 80.dp),
                onCasaTapped = { navController.navigate(Routes.screeninicial.route) },
                onUsuarioTapped = {navController.navigate(Routes.screenusuario.route)},
                onCarritoTapped = {navController.navigate(Routes.screencarrito.route)}
                )
        }) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 100.dp, bottom = 80.dp)
                .background(Color(240, 235, 242))
        ) {
            LazyVerticalGrid(
                modifier = Modifier.fillMaxSize(),
                columns = GridCells.Fixed(count = 2),
                contentPadding = PaddingValues(horizontal = 40.dp, vertical = 30.dp),
                verticalArrangement = Arrangement.spacedBy(40.dp),
                horizontalArrangement = Arrangement.spacedBy(30.dp)
            ) {
                item {
                    CuadroComponente(
                        modifier = Modifier
                            .size(160.dp, 170.dp)
                            .clip(RoundedCornerShape(25.dp))
                    )
                }
                item {
                    CuadroComponente(
                        modifier = Modifier
                            .size(160.dp, 170.dp)
                            .clip(RoundedCornerShape(25.dp)),
                        property1 = com.alopgal962.appfigma.cuadrocomponente.Property1.Variant1
                    )
                }
                item {
                    CuadroComponente(
                        modifier = Modifier
                            .size(160.dp, 170.dp)
                            .clip(RoundedCornerShape(25.dp)),
                        property1 = com.alopgal962.appfigma.cuadrocomponente.Property1.Variant2
                    )
                }
                item {
                    CuadroComponente(
                        modifier = Modifier
                            .size(160.dp, 170.dp)
                            .clip(RoundedCornerShape(25.dp)),
                        property1 = com.alopgal962.appfigma.cuadrocomponente.Property1.Variant4
                    )
                }
                item {
                    CuadroComponente(
                        modifier = Modifier
                            .size(160.dp, 170.dp)
                            .clip(RoundedCornerShape(25.dp)),
                        property1 = com.alopgal962.appfigma.cuadrocomponente.Property1.Variant5
                    )
                }
                item {
                    CuadroComponente(
                        modifier = Modifier
                            .size(160.dp, 170.dp)
                            .clip(RoundedCornerShape(25.dp)),
                        property1 = com.alopgal962.appfigma.cuadrocomponente.Property1.Variant6
                    )
                }
                item {
                    CuadroComponente(
                        modifier = Modifier
                            .size(160.dp, 170.dp)
                            .clip(RoundedCornerShape(25.dp)),
                        property1 = com.alopgal962.appfigma.cuadrocomponente.Property1.Variant7
                    )
                }
                item {
                    CuadroComponente(
                        modifier = Modifier
                            .size(160.dp, 170.dp)
                            .clip(RoundedCornerShape(25.dp)),
                        property1 = com.alopgal962.appfigma.cuadrocomponente.Property1.Variant8
                    )
                }
            }
        }
    }
}