package com.jetpack.firstapplication.Screens

import android.widget.Space
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.jetpack.firstapplication.R
import com.jetpack.firstapplication.data.FoodViewModel

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class,
    ExperimentalFoundationApi::class
)
@Composable
fun Horizontal1Pager(navController: NavController) {
    val foodViewModel = viewModel<FoodViewModel>()

    val image = arrayOf(
        R.drawable.p1,
        R.drawable.p2,
        R.drawable.p3,
        R.drawable.p4,
        R.drawable.khushi,
        R.drawable.ramji
    )


    val pagerState = rememberPagerState(pageCount = {
        6
    })
    HorizontalPager(
        modifier = Modifier
            .fillMaxWidth(), pageSpacing = 4.dp, state = pagerState
    ) { page ->

        Column(
            Modifier
                .fillMaxSize()
                .padding(5.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier
                    .padding(10.dp)
                    .clip(shape = RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Fit,
                painter = painterResource(id = image[page]),
                contentDescription = null
            )

            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Page: $page",
            )
        }

    }


//
//    VerticalPager(
//        modifier = Modifier,
//        horizontalAlignment = Alignment.End,
//        pageSpacing = 4.dp,
//        state = pagerState
//    ) { page ->
//
//        Row(
//            Modifier
//                .height(200.dp)
//                .width(200.dp)
//                .padding(5.dp),
//            verticalAlignment = Alignment.Bottom,
//            horizontalArrangement = Arrangement.End
//        ) {
//            Image(
//                modifier = Modifier
//                    .padding(10.dp)
//                    .clip(shape = CircleShape),
//                contentScale = ContentScale.Crop,
//                painter = painterResource(id = image[page]),
//                contentDescription = null
//            )
//
//            Spacer(modifier = Modifier.height(10.dp))
//            Text(
//                text = "Page: $page",
//            )
//        }
//
//    }


}

