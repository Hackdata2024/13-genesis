package com.intelli.domain.plant.usecase

import androidx.paging.PagingData
import com.intelli.data.local.db.plant.PlantRecentSearchEntity
import com.intelli.domain.plant.repository.PlantRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Created by Jalaj on 25-01-2023.
 */
class GetPlantRecentSearchByQueryUseCase @Inject constructor(private var plantRepository: PlantRepository)  {

    operator fun invoke(q:String? ): Flow<PagingData<PlantRecentSearchEntity>> = plantRepository.recentSearchPaginated(q)
}