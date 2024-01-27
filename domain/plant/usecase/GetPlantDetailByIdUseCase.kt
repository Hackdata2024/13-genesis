package com.intelli.domain.plant.usecase

import com.intelli.data.local.db.plant.PlantDetailRoomData
import com.intelli.domain.base.result.DomainResult
import com.intelli.domain.plant.repository.PlantRepository
import javax.inject.Inject

/**
 * Created by Jalaj on 02-02-2023.
 */
class GetPlantDetailByIdUseCase @Inject constructor(private var plantRepository: PlantRepository)  {

    suspend operator fun invoke(plantId: Int): DomainResult<PlantDetailRoomData> = plantRepository.getPlantDetail(plantId)
}