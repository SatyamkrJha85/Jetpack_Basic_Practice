package com.jetpack.firstapplication.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun GreedScreen(navController: NavController) {
    
    LazyVerticalGrid(columns = GridCells.Fixed(3), content ={

        items(50){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {

                if (it%2==0){
                    ElevatedCard(

                        modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(10.dp)

                    ) {
                        Image(painter = painterResource(id =com.jetpack.firstapplication.R.drawable.p1), contentDescription = null)
                        Text(textAlign = TextAlign.Right,text = "Pizza Khalo")

                    }
                }
                else{

                    ElevatedCard(

                        modifier = Modifier
                            .padding(4.dp)
                            .fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(10.dp)

                    ) {
                        Image(painter = painterResource(id =com.jetpack.firstapplication.R.drawable.p5), contentDescription = null)
                        Text(textAlign = TextAlign.Center,text = "New Wala Khaoo")

                    }
                }

            }





        }
    } )
    
}