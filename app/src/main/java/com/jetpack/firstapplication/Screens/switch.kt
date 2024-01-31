package com.jetpack.firstapplication.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun switch(navController: NavController) {
    var ischecked by remember {
        mutableStateOf(false)
    }
    val icon:(@Composable () -> Unit)? = {
        if (ischecked){
            Icon(imageVector = Icons.Filled.Star, contentDescription = null)
        }
        else{
            Icon(imageVector = Icons.Filled.Favorite, contentDescription = null)
        }
    }
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )

    {
        Switch(modifier = Modifier
            .padding(vertical = 10.dp, horizontal = 10.dp)
            ,checked =ischecked ,
            thumbContent = icon,
            onCheckedChange ={ischecked=it} ,
        )
        Text(text = "Switch is "+if (ischecked) "On" else "Off")

        Spacer(modifier = Modifier.width(10.dp))

        CircularProgressIndicator()

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedButton(onClick = {
            navController.navigate("nexttextfield"){
                popUpTo("switch"){inclusive=true}
            }
        }) {
            Text(text = "Go to main Screen")

        }



    }

}


