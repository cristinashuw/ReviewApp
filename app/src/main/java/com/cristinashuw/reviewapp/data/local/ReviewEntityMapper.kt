package com.cristinashuw.reviewapp.data.local

import com.cristinashuw.reviewapp.data.base.DataMapper
import com.cristinashuw.reviewapp.domain.result.Review
import javax.inject.Inject

class ReviewEntityMapper @Inject internal constructor() :
    DataMapper<ReviewEntity, Review> {

    override fun fromData(data: Review): ReviewEntity {
        return ReviewEntity(
                data.id,
                data.productId,
                data.rating,
                data.title,
                data.description,
                data.date,
                data.username
                
        )
    }

    override fun toData(source: ReviewEntity): Review {
        return Review(
                source.id,
                source.productId,
                source.rating,
                source.title,
                source.description,
                source.date,
                source.username
        )
    }

}
