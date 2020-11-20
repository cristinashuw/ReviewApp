package com.cristinashuw.reviewapp.domain.repository

import com.cristinashuw.reviewapp.domain.result.Review
import io.reactivex.Observable
import io.reactivex.Single


interface ReviewRepository {
    fun getAllReview(productId: Long): Single<List<Review>>
    fun getDetailReview(productId: Long): Observable<Review>
    fun deleteReview(review: Review): Observable<Boolean>
    fun saveReview(review: Review): Observable<Boolean>
    fun updateReview(review: Review): Observable<Boolean>

    interface DataSource :
            ReviewRepository {

    }
}