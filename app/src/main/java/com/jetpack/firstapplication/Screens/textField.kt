package com.jetpack.firstapplication.Screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue

// Text Input Field

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun textfield(){

    var valueOfField by remember {
        mutableStateOf(TextFieldValue(""))
    }

    Box (contentAlignment = Alignment.BottomCenter,
        modifier = Modifier.fillMaxSize()
    )
    {
        TextField(value = valueOfField, onValueChange ={valueOfField=it}
            ,
            leadingIcon = { Icon(Icons.Default.AccountBox, contentDescription =null ) },
            trailingIcon = { Icon(Icons.Default.Call, contentDescription =null ) },
            label = { Text(text = "Hello bro Please ") },
            placeholder = { Text(text = "Are Yaar Tu") },

            )

    }
}

