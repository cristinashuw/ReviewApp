package com.cristinashuw.reviewapp.data.remote

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface ReviewApi {

    @GET("api/Review/{id}")
    fun getAllReview(@Path("id") productId: Long): Single<ReviewResponse>

    @GET("api/Review/{id}")
    fun getDetailReview(@Path("id") productId: Long): Single<ReviewResponse>

}