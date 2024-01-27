package com.intelli.domain.plant.usecase

import com.intelli.data.local.db.plant.PlantEntity
import com.intelli.domain.base.result.DomainResult
import com.intelli.domain.plant.repository.PlantRepository
import javax.inject.Inject

/**
 * Created by Jalaj on 14-02-2023.
 */
class GetPlantDetailsUseCase @Inject constructor(private var plantRepository: PlantRepository)  {

    suspend operator fun invoke(): DomainResult<List<PlantEntity>> = plantRepository.getRecentPlantList()
}