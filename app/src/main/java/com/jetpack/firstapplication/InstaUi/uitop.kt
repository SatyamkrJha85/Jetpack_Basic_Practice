package com.jetpack.firstapplication.InstaUi

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.FilledIconButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedIconButton
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
import androidx.compose.ui.unit.sp
import com.jetpack.firstapplication.R

@Preview(showSystemUi = true)
@Composable
fun thetop1() {
    Row(
        modifier= Modifier
            .padding(start = 5.dp, end = 5.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
       // horizontalArrangement = Arrangement.Absolute.Left
    ) {
        Icon(imageVector = Icons.Default.Lock, contentDescription =null )
        Text(modifier = Modifier.padding(start = 5.dp),text = "Satyam_Kr_jha_", fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
        Icon(imageVector = Icons.Default.KeyboardArrowDown, contentDescription =null )
        Icon(modifier = Modifier.size(10.dp), tint = Color.Red,painter = painterResource(id = R.drawable.redcirle), contentDescription =null )


        Icon(modifier = Modifier.padding(start = 70.dp, end = 20.dp),painter = painterResource(id = R.drawable.addbtn), contentDescription =null )


        Icon(imageVector = Icons.Default.Menu, contentDescription =null )
        Icon(modifier = Modifier.size(10.dp).padding(), tint = Color.Red,painter = painterResource(id = R.drawable.redcirle), contentDescription =null )



    }
}