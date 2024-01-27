package com.intelli.domain.plant.repository

import androidx.paging.Pager
import androidx.paging.PagingData
import com.intelli.data.local.assets.entities.ModelCategory
import com.intelli.data.local.db.plant.PlantDetailRoomData
import com.intelli.data.local.db.plant.PlantEntity
import com.intelli.data.local.db.plant.PlantRecentSearchEntity
import com.intelli.data.local.db.plant.PlantSearchEntryEntity
import com.intelli.domain.base.result.DomainResult
import kotlinx.coroutines.flow.Flow

/**
 * Created by Jalaj on 22-01-2023.
 */
interface PlantRepository {
    fun searchPaginated(q: String): Flow<PagingData<PlantSearchEntryEntity>>
    fun filterPaginated(filterForEdible: Boolean, q: String): Flow<PagingData<PlantSearchEntryEntity>>
    //PagingData<PlantSearchEntryEntity>
    fun recentSearchPaginated(q: String?): Flow<PagingData<PlantRecentSearchEntity>>

    suspend fun recentSearchList(): DomainResult<List<PlantRecentSearchEntity>>

    suspend fun addRecentSearches(search: List<PlantRecentSearchEntity>): DomainResult<List<Long>>
    suspend fun getPlantDetail(plantId: Int): DomainResult<PlantDetailRoomData>

    suspend fun getRecentPlantList(): DomainResult<List<PlantEntity>>
    suspend fun getCategoryList(): DomainResult<List<ModelCategory>>
    suspend fun clearData(): DomainResult<Unit>

}