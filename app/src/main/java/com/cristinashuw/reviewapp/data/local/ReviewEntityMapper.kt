package com.cristinashuw.reviewapp.data.local

import com.cristinashuw.reviewapp.data.base.DataMapper
import com.cristinashuw.reviewapp.domain.result.ListReview
import javax.inject.Inject

class ReviewEntityMapper @Inject internal constructor() :
    DataMapper<ReviewEntity, ListReview> {

    override fun fromData(data: ListReview): ReviewEntity {
        return ReviewEntity(
                data.id
        )
    }

    override fun toData(source: ReviewEntity): ListReview {
        return ListReview(
                source.id
        )
    }

}
