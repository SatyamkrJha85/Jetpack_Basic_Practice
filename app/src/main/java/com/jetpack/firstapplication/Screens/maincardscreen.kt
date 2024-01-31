package com.jetpack.firstapplication.Screens

import androidx.activity.compose.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun maincardscreen(navController: NavController) {
    Column {
        LazyRow(content = {
            item{
                caard(satyam = com.jetpack.firstapplication.R.drawable.khushi)
                caard(satyam = com.jetpack.firstapplication.R.drawable.khushi)
                caard(satyam = com.jetpack.firstapplication.R.drawable.khushi)
                caard(satyam = com.jetpack.firstapplication.R.drawable.khushi)
                caard(satyam = com.jetpack.firstapplication.R.drawable.khushi)
                caard(satyam = com.jetpack.firstapplication.R.drawable.khushi)
                caard(satyam = com.jetpack.firstapplication.R.drawable.khushi)
                caard(satyam = com.jetpack.firstapplication.R.drawable.khushi)
            }
        })


        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier= Modifier.fillMaxWidth()
        ) {
            Button(onClick = {
                navController.navigate("switch"){
                    popUpTo("cardscreen"){inclusive=true}
                }
            }) {
                Text(text = "Switch Screen")
            }
        }
    }


}