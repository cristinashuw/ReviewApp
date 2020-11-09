package com.cristinashuw.reviewapp.data.local

import com.cristinashuw.reviewapp.domain.repository.ReviewRepository.DataSource
import com.cristinashuw.reviewapp.domain.result.ListReview
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject

class LocalReviewSource @Inject internal constructor(
    private val db: AppDatabase,
    private val reviewEntityMapper: ReviewEntityMapper
) : DataSource {
    override fun getAllReview(productId: Long): Single<ListReview> {
        throw UnsupportedOperationException()
    }

    override fun getDetailReview(productId: Long): Observable<String> {
        throw UnsupportedOperationException()
    }

    override fun deleteReview(): Observable<Boolean> {
        throw UnsupportedOperationException()
    }

    override fun getReviewId(): Long {
        throw UnsupportedOperationException()
    }
}