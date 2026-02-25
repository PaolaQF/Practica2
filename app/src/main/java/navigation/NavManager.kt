package navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import views.Avista
import views.Cvista
import views.DetailView


@Composable
fun Navegacion() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "A"
    ) {

        composable("A") { Avista(navController)
        }


    composable("B/{nombre}", arguments = listOf(
        navArgument("nombre") { type = NavType.StringType }
    )){
        val nombre = it.arguments?.getString("nombre") ?: ""
        DetailView(navController, nombre)
    }
        composable("C"){Cvista(navController)}

}
}