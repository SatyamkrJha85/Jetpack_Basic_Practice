package com.jetpack.firstapplication.Screens

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jetpack.firstapplication.ui.theme.my

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("RememberReturnType")
@Composable
fun basictodo(navController: NavController) {
    val todolist = remember {
        mutableStateListOf("Satyam", "Shivam", "Sundaram")
    }
    var addtext by remember {
        mutableStateOf("")
    }
    var context= LocalContext.current

    ElevatedCard(
        modifier = Modifier.padding(15.dp),
        colors = CardDefaults.cardColors(
            containerColor = my,
        ),        elevation = CardDefaults.cardElevation(defaultElevation = 20.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        ) {
            Row(
                modifier = Modifier.padding(top = 10.dp)
                ,
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End,

            ) {
                OutlinedTextField(modifier= Modifier
                    .width(250.dp)
                    .height(50.dp)
                    ,value = addtext, onValueChange = {addtext=it})

                Spacer(modifier = Modifier.width(10.dp))

                IconButton(modifier= Modifier
                    .fillMaxWidth()
                    .size(50.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
                    .background(Color.LightGray)
                    .padding(vertical = 5.dp, horizontal = 5.dp),onClick = {
                    if(addtext.length==0 || addtext.length<5){
                        Toast.makeText(context,"Your Word < 5", Toast.LENGTH_SHORT).show()
                    }
                    else{
                        todolist.add(addtext)
                        addtext=""
                    }
                }) {
                    Icon(imageVector = Icons.Default.Check, contentDescription = null)
                }
            }
            todolist.forEach {item->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, start = 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = item)
                    IconButton(onClick = {
                        // Add your delete functionality here
                        todolist.remove(item)
                        Toast.makeText(context,"Deleted $item", Toast.LENGTH_SHORT).show()
                    }) {
                        Icon(imageVector = Icons.Default.Delete, contentDescription = null)
                    }
                }

            }
        }

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier=Modifier.fillMaxWidth().padding(bottom = 10.dp),

        ) {
            OutlinedButton(onClick = {
                navController.navigate("counter"){
                    popUpTo("basictodo"){inclusive=true}
                }
            }) {
                Text(text = "Go To Counter")
            }
        }

    }


}



