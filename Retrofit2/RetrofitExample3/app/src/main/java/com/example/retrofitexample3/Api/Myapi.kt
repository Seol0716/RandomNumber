package com.example.retrofitexample3.Api

import com.example.retrofitexample3.Model.Plant
import retrofit2.http.GET
import retrofit2.http.Path

interface Myapi {
    @GET("googlecodelabs/kotlin-coroutines/master/advanced-coroutines-codelab/sunflower/src/main/assets/plants.json")
    suspend fun getAllPlants() : List<Plant>

}
