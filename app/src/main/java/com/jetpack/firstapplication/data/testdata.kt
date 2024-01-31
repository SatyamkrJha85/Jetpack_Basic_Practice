package com.jetpack.firstapplication.data

import kotlin.random.Random


import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.jetpack.firstapplication.R
import com.jetpack.firstapplication.Screens.DetailScreen
import com.jetpack.firstapplication.Screens.MainScreen



    @Composable
    fun thelastscreen() {

        val imageId = arrayOf(
            R.drawable.ramji,
            R.drawable.ramji,
            R.drawable.ramji,
            R.drawable.ramji,
            R.drawable.ramji,
            R.drawable.ramji


        )

        val names = arrayOf(
            "Peperoni",
            "Vegan",
            "FourCheese",
            "Margaritta",
            "American",
            "Mexican"
        )

        val ingredients = arrayOf(
            "Tomato sos, cheese, oregano,",
            "Tomato sos, cheese, oregano",
            "Tomato sos, oregano, moza",
            "Tomato sos, cheese, oregano",
            "Tomato sos, cheese, oregano",
            "Tomato sos, cheese, oregano,",
        )

        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "MainScreen") {
            composable(route = "MainScreen") {
                MainScreen(imageId, names, ingredients, navController)
            }
            composable(route = "DetailScreen/{index}",
                arguments = listOf(
                    navArgument(name = "index") {
                        type = NavType.IntType
                    }
                )
            ) { index->
                DetailScreen(
                    photos = imageId,
                    names = names,
                    ingredients = ingredients,
                    itemIndex = index.arguments?.getInt("index")
                )
            }
        }

    }



