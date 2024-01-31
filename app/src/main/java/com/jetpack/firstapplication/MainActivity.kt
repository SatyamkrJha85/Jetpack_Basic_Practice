package com.jetpack.firstapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jetpack.firstapplication.Screens.dialog2
import com.jetpack.firstapplication.data.FoodViewModel
import com.jetpack.firstapplication.ui.theme.FirstApplicationTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context= LocalContext.current
            val snackbarHostState= remember {
                SnackbarHostState()
            }
            val scope= rememberCoroutineScope()

            var exprendable by remember {
                mutableStateOf(false)
            }



            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text(text = "Title text") },
                        navigationIcon = {
                            Icon(modifier = Modifier.padding(5.dp), imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
                        },
                        actions = {
                            Icon( modifier = Modifier.padding(5.dp),imageVector = Icons.Default.Favorite, contentDescription = "Favorite")
                          //  Icon(modifier = Modifier.padding(25.dp), imageVector = Icons.Default.Search, contentDescription = "Search")
                            IconButton(onClick = {
                                // For menu
                                exprendable=true
                            }) {
                                Icon(modifier = Modifier.padding(5.dp), imageVector = Icons.Default.MoreVert, contentDescription = "Menu")
                            }

                            // Drop Down Menu Icons


                            DropdownMenu(expanded = exprendable, onDismissRequest = {
                                exprendable=false
                            }) {



                                DropdownMenuItem(text = { Text(text = "Setting")
                                }, leadingIcon = {Icon(imageVector = Icons.Default.Settings, contentDescription = null)},
                                    onClick = {
                                       Toast.makeText(context,"Bhai ki setting hai",Toast.LENGTH_SHORT).show()
                                })
                                DropdownMenuItem(text = { Text(text = "Search")
                                }, leadingIcon = {Icon(imageVector = Icons.Default.Search, contentDescription = null)},
                                    onClick = {
                                        Toast.makeText(context,"Bhai Search kr rha  hai",Toast.LENGTH_SHORT).show()

                                    })
                                DropdownMenuItem(text = { Text(text = "Home")
                                }, leadingIcon = {Icon(imageVector = Icons.Default.Home, contentDescription = null)},
                                    onClick = {
                                        Toast.makeText(context,"Bhai ka Ghar hai",Toast.LENGTH_SHORT).show()

                                    })

                            }
                        }
                    )
                },
                snackbarHost = {
                    SnackbarHost(snackbarHostState)
                },
                floatingActionButton = {
                    FloatingActionButton(modifier = Modifier.clip(CircleShape), onClick = {
                        scope.launch {
                            snackbarHostState.showSnackbar(
                                "Itna sb khaye hai",actionLabel = "Ab kya krna hai?",
                                withDismissAction = true,
                                duration = SnackbarDuration.Indefinite
                            )
                        }
                    }) {
                        Icon(imageVector = Icons.Default.Add, contentDescription =null )
                    }
                },

                bottomBar = {


                    BottomAppBar(
                        modifier= Modifier
                            .clip(shape = RoundedCornerShape(5.dp))
                            .height(50.dp)
                            , tonalElevation = 43.dp, contentPadding = PaddingValues(12.dp)
                    ) {
                        val context= LocalContext.current
                        run {
                            Row (modifier = Modifier.fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ){
                                IconButton(onClick = {
                                    Toast.makeText(context, "Loved it", Toast.LENGTH_SHORT).show()

                                }) {
                                    Icon(modifier = Modifier.size(30.dp)
                                        ,
                                        imageVector = Icons.Default.Favorite, contentDescription = null,

                                        )
                                }
                                IconButton(onClick = {
                                    Toast.makeText(context, "Welcome to home", Toast.LENGTH_SHORT).show()
                                }) {
                                    Icon(modifier = Modifier
                                        .size(30.dp),
                                        imageVector = Icons.Default.Home, contentDescription = null)
                                }
                                IconButton(onClick = {
                                    Toast.makeText(context, "Your Profile", Toast.LENGTH_SHORT).show()
                                }) {
                                    Icon(modifier = Modifier
                                        .size(30.dp),
                                        imageVector = Icons.Default.AccountCircle, contentDescription = null)
                                }
                                IconButton(onClick = {
                                    Toast.makeText(context, "Location Reached", Toast.LENGTH_SHORT).show()
                                }) {
                                    Icon(modifier = Modifier
                                        .size(30.dp),
                                        imageVector = Icons.Default.LocationOn, contentDescription = null)
                                }

                            }

                        }
                    }
                }



            ) {

                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()

                ) {
                    Spacer(modifier = Modifier.height(40.dp))
                    navcontroler()
                    Spacer(modifier = Modifier.height(40.dp))

                }

            }
}
        }
    }



@Composable
fun CallTheButton() {
    var context = LocalContext.current

    Column(
        modifier=Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(
            onClick = {
                Toast.makeText(
                    context,
                    "Hello Buddy How do you do and why",
                    Toast.LENGTH_SHORT
                ).show()
            },
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight()
        ) {
            Text(text = "Second Button")
        }
    }

}


    @Composable
    fun app(){
        var theme= remember {
            mutableStateOf(false)
        }

        FirstApplicationTheme (theme.value){

            Column(
                modifier=Modifier.fillMaxSize()
                ,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Satyam Jha")
                Button(onClick = {
                    theme.value=!theme.value
                }) {

                    Text(text = "Change Theme")
                }
            }
        }
    }

   @OptIn(ExperimentalFoundationApi::class)
   @Composable
   fun siyaram() {
    Text(text = "मामवलोकय पंकजलोचन। कृपा बिलोकनि सोच बिमोचन।। नील तामरस स्याम काम अरि। ह्रदय कंज मकरंद मधुप हरि।। जातुधान बरुथ बल भंजन। मुनि सज्जन रंजन अघ गंजन।। भूसुर ससि नव बृंद बलाहक। असरन सरन दीन जन गाहक।। भुजबल बिपुल भार महि खंडित। खर दूषन बिराध बध पंडित।। रावनारि सुखरुप भूपबर। जय दसरथ कुल कुमुद सुधाकर।। सुजस पुरान बिदित निगमागम। गावत सुर मुनि संत समागम।। कारुनीक ब्यलीक मद खंडन। सब विधि कुसल कोसला मंडन।। कलि मल मथन नाम ममताहन। तुलसिदास प्रभु पाहि प्रनत जन।। इति ध्यानम्"
        , fontSize = 19.sp,modifier= Modifier
            .padding(10.dp)
            .basicMarquee(iterations = 115, delayMillis = 500, velocity = 100.dp)
    )
}

@Composable
fun screennav() {
    val navController= rememberNavController()
    NavHost(startDestination = "mainscreen", navController = navController ){
        composable("mainscreen"){ dialog2(navController = navController)}
    }
}