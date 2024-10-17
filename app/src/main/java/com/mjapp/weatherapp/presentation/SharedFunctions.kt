package com.mjapp.weatherapp.presentation

fun convertCelsiusToFahrenheit (double: Double): String {
    val fahrenheit = (double * 9/5) + 32
    return "%.2f".format(fahrenheit)
}
