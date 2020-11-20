package com.cristinashuw.reviewapp.data.remote

import com.cristinashuw.reviewapp.data.base.DataMapper
import com.cristinashuw.reviewapp.domain.result.Review
import javax.inject.Inject

class ReviewResponseMapper @Inject internal constructor() :
    DataMapper<ReviewResponse, Review>{

    override fun fromData(data: Review): ReviewResponse {
        throw UnsupportedOperationException()
    }

    override fun toData(source: ReviewResponse): Review {
        throw UnsupportedOperationException()
    }


}
