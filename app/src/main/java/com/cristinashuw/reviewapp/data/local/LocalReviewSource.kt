package com.cristinashuw.reviewapp.data.local

import com.cristinashuw.reviewapp.domain.repository.ReviewRepository.DataSource
import com.cristinashuw.reviewapp.domain.result.Review
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject

class LocalReviewSource @Inject internal constructor(
    private val db: AppDatabase,
    private val reviewEntityMapper: ReviewEntityMapper
) : DataSource {
    override fun getAllReview(productId: Long): Single<List<Review>> {
        return db.review().getAllReview(productId)
                .map { reviews -> reviews.map { reviewEntityMapper.toData(it) } }
    }

    override fun getDetailReview(reviewId: Long): Observable<Review> {
        return db.review().getReviewById(reviewId)
                .map {  reviewEntityMapper.toData(it) }
    }

    override fun deleteReview(review: Review): Observable<Boolean> {
        return db.review().delete(reviewEntityMapper.fromData(review))
                .map { it > 0 }
                .toObservable()
    }

    override fun saveReview(review: Review): Observable<Boolean> {
        return db.review().insertReplace(reviewEntityMapper.fromData(review))
                .map { it > 0 }
                .toObservable()

    }

    override fun updateReview(review: Review): Observable<Boolean> {
        return db.review().update(reviewEntityMapper.fromData(review))
                .map { it > 0 }
                .toObservable()
    }


}