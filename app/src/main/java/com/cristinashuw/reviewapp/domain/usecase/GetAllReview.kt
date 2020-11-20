package com.cristinashuw.reviewapp.domain.usecase

import com.cristinashuw.reviewapp.domain.repository.ReviewRepository
import com.cristinashuw.reviewapp.domain.result.Review
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject

class GetAllReview @Inject internal constructor(
    private val reviewRepository: ReviewRepository
):
    UseCase<Single<List<Review>>, Long> {

    override fun execute(param: Long): Single<List<Review>> {
        return reviewRepository.getAllReview(productId = param)
    }
}