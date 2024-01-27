package com.intelli.domain.plant.usecase

import com.intelli.data.local.db.plant.PlantRecentSearchEntity
import com.intelli.domain.plant.repository.PlantRepository
import javax.inject.Inject

/**
 * Created by Jalaj on 25-01-2023.
 */
class AddPlantRecentSearchesUseCase @Inject constructor(private var plantRepository: PlantRepository)  {

    suspend operator fun invoke(recentSearch:List<PlantRecentSearchEntity> ) = plantRepository.addRecentSearches(recentSearch)
}