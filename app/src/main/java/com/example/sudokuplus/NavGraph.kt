package com.example.sudokuplus

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sudokuplus.screens.DummyScreen1
import com.example.sudokuplus.screens.DummyScreen2
import com.example.sudokuplus.screens.HomeScreen

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
        composable(ScreenHolder.Dummy1.route)
        {
            DummyScreen1()
        }
        composable(ScreenHolder.Dummy2.route)
        {
            DummyScreen2()
        }
    }
}