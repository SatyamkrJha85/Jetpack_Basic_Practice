package com.jetpack.firstapplication.Screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jetpack.firstapplication.R

@Composable
fun thedialogbox(navController: NavController) {

    val context = LocalContext.current.applicationContext

    var openDialog  by remember { mutableStateOf(false) }
    Column(modifier = Modifier.fillMaxWidth(2f),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            openDialog=true
        })
        {
            Text(text = "Open Dialog")
        }
    }

    if (openDialog) {
        AlertDialog(
            onDismissRequest = { openDialog = false },

            icon = { Image(modifier = Modifier
                .size(100.dp)
                .clip(CircleShape), contentScale = ContentScale.Crop ,painter = painterResource(id = R.drawable.khushi), contentDescription = null) },
            title = { Text(text = "Geeks for Geeks", color = Color.Black) },
            text = { Text("Hello! This is our Alert Dialog..", color = Color.Black) },
            confirmButton = {
                TextButton(
                    onClick = {
                        openDialog = false
                        Toast.makeText(context, "Confirm Button Click", Toast.LENGTH_LONG).show()
                        navController.navigate("nexttextfield"){
                            popUpTo("dialog"){inclusive=true}
                        }
                    }
                ) {
                    Text("Confirm", color = Color.Black)
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        openDialog = false
                        Toast.makeText(context, "Dismiss Button Click", Toast.LENGTH_LONG).show()
                    }
                ) {
                    Text("Dismiss", color = Color.Black)
                }
            },
        )
    }
}


