package com.cristinashuw.reviewapp.data

import com.cristinashuw.reviewapp.domain.ListReview
import com.cristinashuw.reviewapp.domain.ReviewRepository
import io.reactivex.Observable
import io.reactivex.Single

class RemoteReviewSource  internal constructor(
    private val reviewApi: ReviewApi
) : ReviewRepository.DataSource {

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