package com.mjapp.weatherapp.domain.repository

import com.mjapp.weatherapp.domain.util.Resource
import com.mjapp.weatherapp.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}