package com.jetpack.firstapplication.InstaUi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpack.firstapplication.R

@Preview(showSystemUi = true)
@Composable
fun btnsection () {
 Row (
     modifier=Modifier.fillMaxWidth().padding(top = 10.dp),
     verticalAlignment = Alignment.CenterVertically,
     horizontalArrangement = Arrangement.SpaceEvenly
 ){
     ElevatedButton(modifier = Modifier
         .height(34.dp)
         .padding(horizontal = 1.dp),
         shape = MaterialTheme.shapes.medium,
         colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),onClick = { }) {
         Text(text = "Edit Profile")
     }
     ElevatedButton(modifier = Modifier
         .height(34.dp)
         .padding(horizontal = 1.dp),
         shape = MaterialTheme.shapes.medium,
         colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),onClick = { }) {
         Text(text = "Share Profile")
     }
     ElevatedButton(modifier = Modifier
         .height(34.dp),
         shape = MaterialTheme.shapes.medium,
         colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray),onClick = { }) {
         Icon(painter = painterResource(id = R.drawable.addfriend), contentDescription =null )
     }
 }
}