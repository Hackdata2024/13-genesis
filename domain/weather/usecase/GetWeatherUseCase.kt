package com.intelli.domain.weather.usecase

import com.intelli.data.local.db.weather.WeatherCurrentRoomEntity
import com.intelli.domain.base.result.DomainResult
import com.intelli.domain.weather.enitity.ModelWeather
import com.intelli.domain.weather.repository.WeatherRepository
import javax.inject.Inject

/**
 * Created by Jalaj on 16-01-2023.
 */
//private var weatherRepository: WeatherRepository
internal class GetWeatherUseCase @Inject constructor(private var weatherRepository: WeatherRepository)  {
    suspend operator fun invoke(): DomainResult<WeatherCurrentRoomEntity> = weatherRepository.getDetail()//DomainResult.Success(ModelWeather(0.1,0.2))//weatherRepository.getDetail()
}