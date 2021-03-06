package test.demo.weatherapp.data

import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query
import test.demo.weatherapp.data.response.CurrentWeatherResponse
import test.demo.weatherapp.data.response.ForecastWeatherResponse

interface WeatherApiService {

    @GET("/v1/current.json")
    fun getCurrentWeather(@Query("key") key: String ?= NetworkHandler.KEY, @Query("q") cityName: String = NetworkHandler.CITY): Flowable<CurrentWeatherResponse>

    @GET("/v1/forecast.json")
    fun getWeatherForecast(@Query("key") key: String ?= NetworkHandler.KEY, @Query("q") cityName: String = NetworkHandler.CITY, @Query("days") day: String = NetworkHandler.DAYS): Flowable<ForecastWeatherResponse>
}