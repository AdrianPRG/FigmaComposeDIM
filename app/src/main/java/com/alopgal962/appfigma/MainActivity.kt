package com.alopgal962.appfigma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.alopgal962.appfigma.routes.Routes
import com.alopgal962.appfigma.screens.ScreenBuscar
import com.alopgal962.appfigma.screens.Screencarrito

import com.alopgal962.appfigma.screens.Screenprinci
import com.alopgal962.appfigma.screens.Screenusuario
import com.alopgal962.appfigma.ui.theme.AppFigmaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppFigmaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navcontroller = rememberNavController()
                    NavHost(navController = navcontroller, startDestination = Routes.screeninicial.route){
                        composable(Routes.screeninicial.route) { Screenprinci(navController = navcontroller)}
                        composable(Routes.screenusuario.route) { Screenusuario(navController = navcontroller)}
                        composable(Routes.screencarrito.route) { Screencarrito(navController = navcontroller)}
                        composable(Routes.screenbucar.route) { ScreenBuscar(navController = navcontroller)}
                    }
                }
            }
        }
    }
}
