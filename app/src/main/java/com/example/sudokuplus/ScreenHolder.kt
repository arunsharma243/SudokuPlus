package com.example.sudokuplus
//Contains the route names of all the app's screens
sealed class ScreenHolder(val route:String) {
    object Home: ScreenHolder(route="HomeScreen")
    object Dummy1: ScreenHolder(route="DummyScreen1")
    object Dummy2: ScreenHolder(route="DummyScreen2")
}