package com.intelli.domain.plant.usecase

import com.intelli.data.local.assets.entities.ModelCategory
import com.intelli.data.local.db.plant.PlantDetailRoomData
import com.intelli.domain.base.result.DomainResult
import com.intelli.domain.plant.repository.PlantRepository
import javax.inject.Inject

/**
 * Created by Jalaj on 06-02-2023.
 */
class GetPlantCategoriesUseCase @Inject constructor(private var plantRepository: PlantRepository)  {

    suspend operator fun invoke(): DomainResult<List<ModelCategory>> = plantRepository.getCategoryList()
}