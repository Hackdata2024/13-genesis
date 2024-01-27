package com.intelli.domain.weather.repository

import com.intelli.data.local.db.weather.WeatherCurrentRoomEntity
import com.intelli.data.local.db.weather.WeatherForecastRoomData
import com.intelli.domain.base.result.DomainResult
import com.intelli.domain.weather.enitity.ModelWeather

/**
 * Created by Jalaj on 16-01-2023.
 */
interface WeatherRepository {

    suspend fun getDetail(): DomainResult<WeatherCurrentRoomEntity>
    suspend fun getForecast(): DomainResult<WeatherForecastRoomData>

    suspend fun clearData(): DomainResult<Unit>
}