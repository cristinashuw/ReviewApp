package com.cristinashuw.reviewapp.data.repository

import com.cristinashuw.reviewapp.common.LocalData
import com.cristinashuw.reviewapp.common.RemoteData
import com.cristinashuw.reviewapp.data.base.BaseRepository
import com.cristinashuw.reviewapp.domain.repository.ReviewRepository
import com.cristinashuw.reviewapp.domain.repository.ReviewRepository.DataSource
import com.cristinashuw.reviewapp.domain.result.Review
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject

class ReviewRepoFactory @Inject constructor(
        @LocalData localData: DataSource,
        @RemoteData remoteData: DataSource
) :
        BaseRepository<DataSource>(localData, remoteData),
        ReviewRepository {

    override fun getAllReview(productId: Long): Single<List<Review>> {
        return localData.getAllReview(productId)
    }

    override fun getDetailReview(productId: Long): Observable<Review> {
        return localData.getDetailReview(productId)
    }

    override fun deleteReview(review: Review): Observable<Boolean> {
        return localData.deleteReview(review)
    }

    override fun saveReview(review: Review): Observable<Boolean> {
        return localData.saveReview(review)
    }

    override fun updateReview(review: Review): Observable<Boolean> {
        return localData.updateReview(review)
    }

}