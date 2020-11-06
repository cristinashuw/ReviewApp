package com.cristinashuw.reviewapp.usecase

import com.cristinashuw.reviewapp.domain.ListReview
import com.cristinashuw.reviewapp.domain.ReviewRepository
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