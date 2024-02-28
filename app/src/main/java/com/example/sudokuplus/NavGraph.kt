package com.example.sudokuplus

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sudokuplus.Screens.DummyScreen2
import com.example.sudokuplus.Screens.HomeScreen
import com.example.sudokuplus.Screens.GameScreen

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = ScreenHolder.Home.route
    ) {
        composable(ScreenHolder.Home.route)
        {
            HomeScreen(navController=navController)
        }
        composable(ScreenHolder.GameScreen.route)
        {
            GameScreen()
        }
        composable(ScreenHolder.Dummy2.route)
        {
            DummyScreen2()
        }
    }
}