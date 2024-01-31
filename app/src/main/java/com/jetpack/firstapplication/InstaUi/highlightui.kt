package com.jetpack.firstapplication.InstaUi

import android.inputmethodservice.Keyboard
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpack.firstapplication.R

@Preview(showSystemUi = true)
@Composable
fun highlightui() {
Column(
    modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp),
    verticalArrangement = Arrangement.Center
) {

    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){

        Image(modifier= Modifier
            .size(70.dp)
            .clip(shape = CircleShape)
            .border(2.dp, Color.Gray, shape = CircleShape)
            ,painter = painterResource(id = R.drawable.satya), contentDescription =null )


        Image(modifier= Modifier
            .size(70.dp)
            .clip(shape = CircleShape)
            .border(2.dp, Color.Gray, shape = CircleShape)
            ,painter = painterResource(id = R.drawable.me), contentDescription =null )

        Image(modifier= Modifier
            .size(70.dp)
            .clip(shape = CircleShape)
            .border(2.dp, Color.Gray, shape = CircleShape)
            ,painter = painterResource(id = R.drawable.pic1), contentDescription =null )

        Image(modifier= Modifier
            .size(70.dp)
            .clip(shape = CircleShape)
            .border(2.dp, Color.Gray, shape = CircleShape)
            ,painter = painterResource(id = R.drawable.we), contentDescription =null )
    }
    Row (
        modifier = Modifier.fillMaxWidth().padding(start = 8.dp, top = 8.dp, end = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(modifier = Modifier.padding(start = 8.dp),text = "\uD83D\uDE0A\n")
        Text(modifier = Modifier.padding(start = 18.dp),text = "\uD83C\uDF3B\n")
        Text(modifier = Modifier.padding(start = 1.dp, bottom = 18.dp),text = "श्रोत", fontWeight = FontWeight.SemiBold)
        Text(modifier = Modifier.padding(end = 15.dp, bottom = 18.dp),text = "mitr", fontWeight = FontWeight.SemiBold)

    }



    }

}
