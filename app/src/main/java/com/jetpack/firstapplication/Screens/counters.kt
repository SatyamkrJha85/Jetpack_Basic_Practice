package com.jetpack.firstapplication.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun Counterbtn(navController: NavController) {
    var counter by rememberSaveable{ mutableStateOf(0) }
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "The Value of counter is $counter")
        Button(onClick = { counter++ }) {
            Text(text = "Counter")

        }
        Button(onClick = {
            navController.navigate("dialog"){
                popUpTo("counter"){inclusive=true}
            }
        }) {
            Text(text = "Go To Dialog Box")

        }
    }
}