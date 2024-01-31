package com.jetpack.firstapplication

import android.app.Dialog
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview


@Preview(showSystemUi = true)
@Composable
fun alertdialog() {
    var dialogrem by remember {
        mutableStateOf(false)
    }
    var context= LocalContext.current
    Button(onClick = {
        dialogrem=true
    }) {
        Text(text = "New Button")

    }

    if(dialogrem){
        AlertDialog(onDismissRequest = {

                                       dialogrem=false
        },
            title = { Text(text = "The Amazing Spider Man") },
            text = { Text(text = "The new superhero will be come one day and show you everything") },
            icon = { Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null)},

            confirmButton = {
            Button(onClick = {
                Toast.makeText(context,"Hello Confirm",Toast.LENGTH_SHORT).show()
                dialogrem=false
            }) {
                Text(text = "Confirm")

            }
        },

            dismissButton = {

                Button(onClick = {
                    Toast.makeText(context,"Hello Dissmis",Toast.LENGTH_SHORT).show()
                    dialogrem=false
                }) {
                    Text(text = "Dismiss")

                }

            }
            )
    }

}