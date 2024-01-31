package com.jetpack.firstapplication

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.jetpack.firstapplication.InstaUi.instaui
import com.jetpack.firstapplication.Screens.Counterbtn
import com.jetpack.firstapplication.Screens.DetailScreen
import com.jetpack.firstapplication.Screens.GreedScreen
import com.jetpack.firstapplication.Screens.Horizontal1Pager
import com.jetpack.firstapplication.Screens.MainScreen
import com.jetpack.firstapplication.Screens.animationpage
import com.jetpack.firstapplication.Screens.basictodo
import com.jetpack.firstapplication.Screens.maincardscreen
import com.jetpack.firstapplication.Screens.switch
import com.jetpack.firstapplication.Screens.thedialogbox
import com.jetpack.firstapplication.data.FoodViewModel

@Composable
fun navcontroler() {
    val navController = rememberNavController()
    val foodViewModel = viewModel<FoodViewModel>()
    NavHost(navController, startDestination = "nexttextfield") {
        composable("nexttextfield") { newtextfield(navController)}
        composable(route = "basictodo") { basictodo(navController)}
        composable("counter"){ Counterbtn(navController)}
        composable("cardscreen"){ maincardscreen(navController)}
        composable("switch"){ switch(navController)}
        composable("dialog"){ thedialogbox(navController)}
        composable("gridscreen"){ GreedScreen(navController = navController)}
        composable("pager1screen"){ Horizontal1Pager(navController = navController)}
        composable("animation1"){ animationpage(navController = navController)}
        composable("instaui"){ instaui(navController)}
        composable("foodscreen"){ MainScreen(
            imageId = foodViewModel.getImages() ,
            names = foodViewModel.getNames(),
            ingredients = foodViewModel.getIngredients(),
            navController = navController
        )
        }
        composable(route = "DetailScreen/{index}",
            arguments = listOf(
                navArgument(name = "index") {
                    type = NavType.IntType
                }
            )
        ) { index->
            DetailScreen(
                photos = foodViewModel.getImages(),
                names = foodViewModel.getNames(),
                ingredients = foodViewModel.getIngredients(),
                itemIndex = index.arguments?.getInt("index")
            )
        }
    }


    }

