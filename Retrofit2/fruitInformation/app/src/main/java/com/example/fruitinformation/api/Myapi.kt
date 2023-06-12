package com.example.fruitinformation.api

import com.example.fruitinformation.model.Plant
import retrofit2.http.GET

interface Myapi{


    @GET("googlecodelabs/kotlin-coroutines/master/advanced-coroutines-codelab/sunflower/src/main/assets/plants.json")
    suspend fun getAllPlants() : List<Plant>
}