package com.cristinashuw.reviewapp.data.remote

import com.cristinashuw.reviewapp.domain.repository.ReviewRepository.DataSource
import com.cristinashuw.reviewapp.domain.result.Review
import io.reactivex.Observable
import io.reactivex.Single
import java.lang.UnsupportedOperationException
import javax.inject.Inject

class RemoteReviewSource @Inject internal constructor(
    private val reviewApi: ReviewApi,
    private val reviewResponseMapper: ReviewResponseMapper
) : DataSource {

    override fun getAllReview(productId: Long): Single<List<Review>> {
        TODO("Not yet implemented")
    }

    override fun getDetailReview(productId: Long): Observable<Review> {
        TODO("Not yet implemented")
    }

    override fun deleteReview(review: Review): Observable<Boolean> {
        throw UnsupportedOperationException()
    }

    override fun saveReview(review: Review): Observable<Boolean> {
        TODO("Not yet implemented")
    }

    override fun updateReview(review: Review): Observable<Boolean> {
        TODO("Not yet implemented")
    }


}