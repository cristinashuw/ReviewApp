package com.cristinashuw.reviewapp.domain.usecase

import com.cristinashuw.reviewapp.domain.repository.ReviewRepository
import com.cristinashuw.reviewapp.domain.result.ListReview
import io.reactivex.Observable
import javax.inject.Inject

class GetAllReview @Inject internal constructor(
    private val reviewRepository: ReviewRepository
):
    UseCase<Observable<ListReview>, Void?> {

    override fun execute(param: Void?): Observable<ListReview> {
        return reviewRepository.getAllReview(reviewRepository.getReviewId()).toObservable()
    }
}