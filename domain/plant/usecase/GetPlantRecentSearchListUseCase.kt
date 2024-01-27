package com.intelli.domain.plant.usecase

import androidx.paging.PagingData
import com.intelli.data.local.db.plant.PlantRecentSearchEntity
import com.intelli.domain.base.result.DomainResult
import com.intelli.domain.plant.repository.PlantRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * Created by Jalaj on 04-02-2023.
 */
class GetPlantRecentSearchListUseCase @Inject constructor(private var plantRepository: PlantRepository)  {

   suspend operator fun invoke(): DomainResult<List<PlantRecentSearchEntity>> = plantRepository.recentSearchList()
}