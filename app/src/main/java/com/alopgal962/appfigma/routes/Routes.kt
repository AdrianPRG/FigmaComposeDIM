package com.alopgal962.appfigma.routes

sealed class Routes(val route:String){
    object screeninicial:Routes("inicio")
    object screenusuario:Routes("usuario")
    object screencarrito:Routes("carrito")

    object screenbucar:Routes("buscar")
}
