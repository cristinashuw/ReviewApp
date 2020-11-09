package com.cristinashuw.reviewapp.data.remote

import com.cristinashuw.reviewapp.domain.repository.ReviewRepository.DataSource
import com.cristinashuw.reviewapp.domain.result.ListReview
import io.reactivex.Observable
import io.reactivex.Single
import java.lang.UnsupportedOperationException
import javax.inject.Inject

class RemoteReviewSource @Inject internal constructor(
    private val reviewApi: ReviewApi,
    private val reviewResponseMapper: ReviewResponseMapper
) : DataSource {

    override fun getAllReview(productId: Long): Single<ListReview> {
        return reviewApi.getAllReview(productId)
                .onErrorResumeNext { Single.error(it) }
                .map { reviewResponseMapper.toData(it) }
    }

    override fun getDetailReview(productId: Long): Observable<String> {
        TODO("Not yet implemented")
    }

    override fun deleteReview(): Observable<Boolean> {
        throw UnsupportedOperationException()
    }

    override fun getReviewId(): Long {
        TODO("Not yet implemented")
    }
}