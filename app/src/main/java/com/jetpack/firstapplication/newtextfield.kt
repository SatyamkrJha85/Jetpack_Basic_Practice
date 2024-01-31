package com.jetpack.firstapplication

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun newtextfield(navController: NavController) {

  var name by remember {
    mutableStateOf("")
  }

  var gmail by remember {
    mutableStateOf("")
  }

  var number by remember {
    mutableStateOf("")
  }

  LazyColumn( modifier = Modifier
    .padding(16.dp)
    .fillMaxWidth(),
    horizontalAlignment = Alignment.CenterHorizontally,content = {

      item {

        Text(text = "Fill The Form", color = Color.Blue, modifier = Modifier
          .padding(bottom = 10.dp), fontSize = 20.sp)

        // Name

        OutlinedTextField(label = { Text(text = "Enter Your Name")},
          leadingIcon = { androidx.compose.material3.Icon(imageVector = Icons.Default.Person, contentDescription = "Enter the name") },
          modifier = Modifier
            .padding(vertical = 8.dp)
            .fillMaxWidth()
          ,value = name, onValueChange={name=it}, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        // Email

        OutlinedTextField(value = gmail, onValueChange ={gmail=it}, modifier = Modifier
          .padding(vertical = 8.dp)
          .fillMaxWidth(), label = { Text(text = "Enter Your Email")},

          keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
          ,leadingIcon = {
            androidx.compose.material3.Icon(imageVector = Icons.Default.MailOutline, contentDescription = "Email fill")
          })

        // number

        OutlinedTextField(value = number, onValueChange ={number=it},
          modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
          leadingIcon = { androidx.compose.material3.Icon(imageVector = Icons.Default.Call, contentDescription =null )},
          label = { Text(text = "Enter Your Phone Number")},
          keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)

        )

        // Button
        val context= LocalContext.current

        Button(onClick = {
          Toast.makeText(context,"Your Form Has Been Submited",Toast.LENGTH_SHORT).show()
        }
          ,
          modifier = Modifier
            .padding(horizontal = 50.dp, vertical = 20.dp)
            .fillMaxWidth()
        ) {
          Text(text = "Submit Info")

        }

        ElevatedButton(onClick = {
          navController.navigate("basictodo"){
            popUpTo("nexttextfield"){inclusive=true}
          }
        }) {
          Text(text = "Go to Todo")

        }

        ElevatedButton(onClick = {
          navController.navigate("cardscreen"){
            popUpTo("nexttextfield"){inclusive=true}
          }
        }) {
          Text(text = "Go to Card Screen")

        }

        ElevatedButton(onClick = {
          navController.navigate("foodscreen"){
            //  popUpTo("nexttextfield"){inclusive=true}
          }
        }) {
          Text(text = "Go to Food Screen")
        }

        ElevatedButton(onClick = {
          navController.navigate("gridscreen"){
            //  popUpTo("nexttextfield"){inclusive=true}
          }
        }) {
          Text(text = "Go to Grid Screen")
        }


        ElevatedButton(onClick = {
          navController.navigate("pager1screen"){
            //  popUpTo("nexttextfield"){inclusive=true}
          }
        }) {
          Text(text = "Go to  Horizontal Pager")
        }

        ElevatedButton(onClick = {
          navController.navigate("animation1"){
            //  popUpTo("nexttextfield"){inclusive=true}
          }
        }) {
          Text(text = "Go to Animation")
        }

        ElevatedButton(onClick = {
          navController.navigate("instaui"){
            //  popUpTo("nexttextfield"){inclusive=true}
          }
        }) {
          Text(text = "Go to Insta Ui")
        }

        Spacer(modifier = Modifier.height(20.dp))
      }

  })

}