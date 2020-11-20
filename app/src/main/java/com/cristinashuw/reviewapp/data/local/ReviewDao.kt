package com.cristinashuw.reviewapp.data.local

import androidx.room.Dao
import androidx.room.Query
import com.cristinashuw.reviewapp.domain.result.Review
import io.reactivex.Observable
import io.reactivex.Single

@Dao
interface ReviewDao : BaseDao<ReviewEntity> {
    @Query("select * from  ${ReviewEntity.TABLE_NAME} where ${ReviewEntity.C_PRODUCT_ID} = :productId")
    fun getAllReview(productId: Long): Single<List<ReviewEntity>>

    @Query("select * from  ${ReviewEntity.TABLE_NAME} where ${ReviewEntity.C_ID} = :reviewId")
    fun getReviewById(reviewId: Long): Observable<ReviewEntity>

    @Query("delete from  ${ReviewEntity.TABLE_NAME}")
    fun clearTable(): Observable<Int>
}