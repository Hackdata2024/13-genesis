package com.intelli.data.local.db.plant.inner

import androidx.room.Entity
import androidx.room.Index
import retrofit2.http.Field

/**
 * Created by Jalaj on 30-11-2023.
 */

data class PlantGrowthEntity( var phMaximum: Float?,
                              var phMinimum: Float?,
                              var light: Int?,
                              var atmHumidity: Float?,
                              var soilHumidity: Float?,
                              var bloomMonths: List<String>,
                              var growthMonths: List<String>,
                              var fruitMonths: List<String>,
                              var soilNutriments: Int?,
                              var soilSalinity: Int?) {
}