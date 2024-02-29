package com.example.sudokuplus
//Contains the route names of all the app's screens
sealed class ScreenHolder(val route:String) {
    object Home: ScreenHolder(route="HomeScreen")
    object GameScreen: ScreenHolder(route="GameScreen")
    object Dummy2: ScreenHolder(route="DummyScreen2")
}