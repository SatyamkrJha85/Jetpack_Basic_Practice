package com.jetpack.firstapplication.InstaUi

import android.widget.GridView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.RecomposeScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpack.firstapplication.R

@Preview(showSystemUi = true)
@Composable
fun gridui() {

     val image = arrayOf(
        R.drawable.p1,
        R.drawable.p2,
        R.drawable.p3,

    )


   Column {
       Row(
           modifier= Modifier
               .fillMaxWidth()
               .background(Color.Black),
           verticalAlignment = Alignment.CenterVertically,
           horizontalArrangement = Arrangement.SpaceBetween
       ) {
           Image(modifier=Modifier.size(130.dp)
               ,painter = painterResource(id = R.drawable.satya), contentDescription = null)
           Image(modifier=Modifier.size(130.dp)
               ,painter = painterResource(id = R.drawable.p3), contentDescription = null)
           Image(modifier= Modifier
               .size(130.dp)
               .clip(shape = RectangleShape)
               ,painter = painterResource(id = R.drawable.me), contentDescription = null)
       }
       Divider(thickness = 1.dp, color = Color.Black)
       Row(
           modifier=Modifier.fillMaxWidth(),
           verticalAlignment = Alignment.CenterVertically,
           horizontalArrangement = Arrangement.SpaceBetween
       ) {
           Image(modifier=Modifier.size(130.dp)
               ,painter = painterResource(id = R.drawable.p1), contentDescription = null)
           Image(modifier=Modifier.size(130.dp)
               ,painter = painterResource(id = R.drawable.p6), contentDescription = null)
           Image(modifier= Modifier
               .size(130.dp)
               .clip(shape = RectangleShape)
               ,painter = painterResource(id = R.drawable.p4), contentDescription = null)
       }
   }
}





