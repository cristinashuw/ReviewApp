package com.cristinashuw.reviewapp.domain.repository

import com.cristinashuw.reviewapp.domain.result.ListReview
import io.reactivex.Observable
import io.reactivex.Single


interface ReviewRepository {
    fun getAllReview(productId: Long): Single<ListReview>
    fun getDetailReview(productId: Long): Observable<String>
    fun deleteReview(): Observable<Boolean>
    fun getReviewId(): Long

    interface DataSource :
            ReviewRepository {

    }
}