package com.intelli.domain.weather.usecase

import com.intelli.domain.base.result.DomainResult
import com.intelli.domain.weather.repository.WeatherRepository
import javax.inject.Inject

/**
 * Created by Jalaj on 08-02-2023.
 */
class DeleteAllWeatherUseCase  @Inject constructor(private var weatherRepository: WeatherRepository)  {

    suspend operator fun invoke( ): DomainResult<Unit> = weatherRepository.clearData()
}