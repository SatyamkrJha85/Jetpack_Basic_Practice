package com.jetpack.firstapplication.InstaUi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpack.firstapplication.R

@Preview(showSystemUi = true)
@Composable
fun sectionui() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(start = 40.dp, end = 40.dp, bottom = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(modifier = Modifier.size(30.dp),painter = painterResource(id = R.drawable.gridpic), contentDescription =null )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(modifier = Modifier.size(30.dp),painter = painterResource(id = R.drawable.reel), contentDescription =null )
        }
        IconButton(onClick = { /*TODO*/ }) {
            Icon(modifier = Modifier.size(30.dp),painter = painterResource(id = R.drawable.contactpic), contentDescription =null )
        }
    }
}