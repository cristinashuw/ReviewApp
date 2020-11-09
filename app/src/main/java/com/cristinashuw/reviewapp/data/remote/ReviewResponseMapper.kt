package com.cristinashuw.reviewapp.data.remote

import com.cristinashuw.reviewapp.data.base.DataMapper
import com.cristinashuw.reviewapp.domain.result.ListReview
import javax.inject.Inject

class ReviewResponseMapper @Inject internal constructor() :
    DataMapper<ReviewResponse, ListReview>{

    override fun fromData(data: ListReview): ReviewResponse {
        throw UnsupportedOperationException()
    }

    override fun toData(source: ReviewResponse): ListReview {
        return ListReview(
                source.id
        )
    }


}
