package com.jetpack.firstapplication.InstaUi

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jetpack.firstapplication.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
//@Preview(showSystemUi = true)
fun instaui(navController: NavController) {
        Scaffold(
            bottomBar = {
                BottomAppBar(
                    actions = {

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {

                            IconButton(onClick = { /* do something */ }) {
                                Icon(Icons.Filled.Home, contentDescription = "Localized description",modifier = Modifier.size(25.dp),)
                            }
                            IconButton(onClick = { /* do something */ }) {
                                Icon(
                                    Icons.Filled.Search,
                                    contentDescription = "Localized description",modifier = Modifier.size(25.dp),
                                )
                            }
                            IconButton(onClick = { /* do something */ }) {
                                Icon(modifier = Modifier.size(25.dp),
                                    painter = painterResource(id = R.drawable.addbtn),
                                    contentDescription = "Localized description",
                                )
                            }
                            IconButton(onClick = { /* do something */ }) {
                                Icon(modifier = Modifier.size(25.dp),
                                    painter = painterResource(id = R.drawable.reel),
                                    contentDescription = "Localized description",
                                )
                            }
                            IconButton(onClick = { /*TODO*/ }) {
                                Image(modifier = Modifier.size(40.dp).clip(shape = CircleShape).border(1.dp,
                                    Color.Black, shape = CircleShape),painter = painterResource(id = R.drawable.satya) , contentDescription = null)

                            }
                        }

                    }

                )
            },
        ) { innerPadding ->

            LazyColumn(content = {
                item {
                    thetop1()
                }

                item {

                    profileui()
                }
                item {
                    btnsection()
                }
                item {
                    highlightui()
                }
                item {
                    sectionui()
                }
                item {
                    gridui()
                }

            })


        }
    }






