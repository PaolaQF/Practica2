package views

import android.annotation.SuppressLint
import android.graphics.fonts.FontStyle
import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.leanback.widget.TitleView

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Avista(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Pantalla A", fontSize = 24.sp, fontWeight = FontWeight.Bold)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.Magenta
                )

            )
        }
    ) {
        Lista(navController)
    }
}

@Composable
fun Lista(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(
            onClick = {
                navController.navigate("B/DANNA QUEZADA")
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Magenta),
            elevation =  ButtonDefaults.elevatedButtonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
        ))

        {
            Text(text = "DANNA QUEZADA", color = Color.White, fontSize = 32.sp)
        }

        Spacer(modifier = Modifier.height(24.dp))


        Button(
            onClick = {
                navController.navigate("B/MIA BARRON")
            }, colors = ButtonDefaults.buttonColors(
                containerColor = Color.Magenta),
            elevation =  ButtonDefaults.elevatedButtonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp

        ))

        {
            Text(text = "MIA BARRON", color = Color.White, fontSize = 32.sp)
        }

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                navController.navigate("B/JESUS ZAMARRIPA")
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Magenta),
            elevation =  ButtonDefaults.elevatedButtonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp
            ))

        {
            Text(text = "JESUS ZAMARRIPA", color = Color.White, fontSize = 32.sp)
        }




    }
}