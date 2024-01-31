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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jetpack.firstapplication.R

@Composable
fun dialog2(navController: NavController) {
    val context = LocalContext.current
    var dialogvalue by remember {
        mutableStateOf(false)
    }


    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(onClick = {
            dialogvalue = true
        }) {
            Text(text = "Click for dialog Open")

        }
    }
    if (dialogvalue) {


        AlertDialog(onDismissRequest = {
            dialogvalue=false
        }, title = { Text(text = "Khushi suniye n") },
            icon = { Image(modifier = Modifier
                .size(100.dp)
                .clip(CircleShape), contentScale = ContentScale.Crop ,painter = painterResource(id = R.drawable.khushi), contentDescription = null) },

            text = { Text(text = "Ek baat pata hai aapko i love you bhut zor se bolne ka man kr rha hai") },
            confirmButton = {
                Button(onClick = {
                    dialogvalue=false
                    Toast.makeText(context,"Conformed", Toast.LENGTH_SHORT).show()
                }) {
                    Text(text = "Conform")

                }

            },
            dismissButton = {

                Button(onClick = {
                    dialogvalue=false
                    Toast.makeText(context,"Cancled", Toast.LENGTH_SHORT).show()
                }) {
                    Text(text = "Cancel")

                }
            }

        )

    }
}
