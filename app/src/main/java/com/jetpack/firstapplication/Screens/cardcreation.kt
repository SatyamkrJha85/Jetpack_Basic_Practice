package com.jetpack.firstapplication.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jetpack.firstapplication.R

@Composable
fun caard(satyam:Int){
    Card (
        modifier = Modifier
            .padding(10.dp)
            .clip(RoundedCornerShape(CornerSize(15.dp)))
        ,
        elevation = CardDefaults.cardElevation(100.dp),

        ) {

        Column {
            Image(painter = painterResource(id = satyam), contentDescription =null ,
                modifier = Modifier
                    .padding(vertical = 10.dp, horizontal = 10.dp)
                    .align(Alignment.CenterHorizontally)
                    .size(300.dp)
                    .clip(RoundedCornerShape(CornerSize(15.dp)))


            )

            Text(text = "Jai Siya Ram", modifier = Modifier
                .padding(5.dp)
                .align(Alignment.CenterHorizontally))



        }
    }
}

