package test.gojek.gojektest.ui.weather_info

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import test.gojek.gojektest.R
import test.gojek.gojektest.ui.WeatherForecast

class WeatherForecastAdapter : RecyclerView.Adapter<WeatherForecastHolder>() {

    var list = mutableListOf<WeatherForecast>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeatherForecastHolder {
        return WeatherForecastHolder(LayoutInflater.from(parent.context).inflate(R.layout.forecast_weather_row,parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: WeatherForecastHolder, position: Int) {
        holder.bind(list.get(position))
    }
}