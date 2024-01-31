package com.jetpack.firstapplication.InstaUi

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpack.firstapplication.R

@Preview(showSystemUi = true)
@Composable
fun profileui() {
    Column {
        Row (
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(modifier= Modifier
                .size(100.dp)
                .clip(shape = CircleShape),painter = painterResource(id = R.drawable.satya), contentDescription =null )
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
                , modifier = Modifier.fillMaxWidth()
            ){
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                    , modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 30.dp)
                ) {
                    Text(text = "28", fontWeight = FontWeight.ExtraBold, fontSize = 19.sp)
                    Text(text = "1,243", fontWeight = FontWeight.ExtraBold, fontSize = 19.sp)
                    Text(text = "213", fontWeight = FontWeight.ExtraBold, fontSize = 19.sp)
                }
                Spacer(modifier = Modifier.height(5.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                    , modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 22.dp)
                ) {
                    Text(text = "posts", fontWeight = FontWeight.Normal, fontSize = 15.sp)
                    Text(text = "followers", fontWeight = FontWeight.Normal, fontSize = 15.sp)
                    Text(text = "following", fontWeight = FontWeight.Normal, fontSize = 15.sp)
                }

            }
        }
        Column(
            modifier = Modifier.padding(start = 12.dp)
        ) {
            Text(text = "Satyam Jha", fontWeight = FontWeight.SemiBold)
            Text(text = "राधे राधे \uD83D\uDC9E\n")
        }

    }


}