package com.awais.mvvmnavdaggerunit.network

import com.awais.mvvmnavdaggerunit.animalslist.AnimalListModel
import com.awais.mvvmnavdaggerunit.animalslist.ApiKey
import io.reactivex.Single
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface AnimalApi {

    @GET("getKey")
    fun getApiKey(): Single<ApiKey>

    @FormUrlEncoded
    @POST("getAnimals")
    fun getAnimals(@Field("key") key: String): Single<List<AnimalListModel>>

}