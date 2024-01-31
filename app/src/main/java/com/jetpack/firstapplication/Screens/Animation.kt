package com.jetpack.firstapplication.Screens

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.jetpack.firstapplication.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun animationpage(navController: NavController) {


    val image = arrayOf(
        R.drawable.p1,
        R.drawable.p2,
        R.drawable.p3,
        R.drawable.p4,
        R.drawable.khushi,
        R.drawable.ramji
    )

    var isvisible by remember {
        mutableStateOf(false)
    }

    var notvisible by remember {
        mutableStateOf(false)
    }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Button(onClick = {

            isvisible=!isvisible
        }) {
            Text(text = if(isvisible) "Hide" else "Show")
        }

        AnimatedVisibility(visible = isvisible,
            enter = scaleIn(tween(500)),
            exit = scaleOut(tween(500))
        ) {

          Box(modifier = Modifier
              .size(200.dp)
              .align(Alignment.End)
              .background(Color.Magenta)){

              Image(modifier= Modifier
                  .clip(shape = CircleShape)
                  .padding(5.dp),painter = painterResource(id = R.drawable.p3), contentDescription = null)
            }


        }

        Button(onClick = { notvisible=!notvisible }) {
            Text(text = if (notvisible) "Collapse" else "Expand")
        }

       Box(modifier = Modifier
           .animateContentSize(tween(500))
           .background(Color.Blue)
           .clip(shape = RoundedCornerShape(10.dp))
           .padding(20.dp )
       ){
           AnimatedContent(targetState = notvisible, label = "") { it->
               if(it){
                   Text(text = "Hey Mother \n Father Atul", color = Color.White, modifier = Modifier.padding(16.dp))
               }
               else{
                   Text(text = "Hey Bkl Atul \n Gendu Generation", color = Color.White, modifier = Modifier.padding(16.dp))

               }

           }
       }
    }
}