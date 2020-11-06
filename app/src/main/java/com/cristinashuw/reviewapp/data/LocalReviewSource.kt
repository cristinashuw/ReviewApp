package com.cristinashuw.reviewapp.data

import com.cristinashuw.reviewapp.domain.ListReview
import com.cristinashuw.reviewapp.domain.ReviewRepository
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject

class LocalReviewSource @Inject internal constructor(
    private val db: AppDatabase
) : ReviewRepository.DataSource{
    override fun getAllReview(productId: Long): Single<ListReview> {
        TODO("Not yet implemented")
    }

    override fun getDetailReview(productId: Long): Observable<String> {
        TODO("Not yet implemented")
    }

    override fun deleteReview(): Observable<Boolean> {
        TODO("Not yet implemented")
    }

    override fun getReviewId(): Long {
        TODO("Not yet implemented")
    }
}