package com.intelli.domain.plant.usecase

import androidx.paging.Pager
import androidx.paging.PagingData
import com.intelli.data.local.db.plant.PlantSearchEntryEntity
import com.intelli.domain.base.result.DomainResult
import com.intelli.domain.plant.repository.PlantRepository
import com.intelli.domain.weather.enitity.ModelWeather
import com.intelli.domain.weather.repository.WeatherRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Created by Jalaj on 23-01-2023.
 */

internal class GetPlantsByQueryUseCase  @Inject constructor(private var plantRepository: PlantRepository)  {

    operator fun invoke(q:String ): Flow<PagingData<PlantSearchEntryEntity>> = plantRepository.searchPaginated(q)
}