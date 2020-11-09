package com.cristinashuw.reviewapp.data.repository

import com.cristinashuw.reviewapp.common.LocalData
import com.cristinashuw.reviewapp.common.RemoteData
import com.cristinashuw.reviewapp.data.base.BaseRepository
import com.cristinashuw.reviewapp.domain.repository.ReviewRepository
import com.cristinashuw.reviewapp.domain.repository.ReviewRepository.DataSource
import com.cristinashuw.reviewapp.domain.result.ListReview
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject

class ReviewRepoFactory @Inject constructor(
        @LocalData localData: DataSource,
        @RemoteData remoteData: DataSource
) :
        BaseRepository<DataSource>(localData, remoteData),
        ReviewRepository {

    override fun getAllReview(productId: Long): Single<ListReview> {
        checkRemoteData()
        return remoteData!!.getAllReview(productId)
    }

    override fun getDetailReview(productId: Long): Observable<String> {
        checkRemoteData()
        return remoteData!!.getDetailReview(productId)
    }

    override fun deleteReview(): Observable<Boolean> {
        return localData.deleteReview()
    }

    override fun getReviewId(): Long {
        checkRemoteData()
        return remoteData!!.getReviewId()
    }
}