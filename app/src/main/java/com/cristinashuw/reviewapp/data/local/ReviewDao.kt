package com.cristinashuw.reviewapp.data.local

import androidx.room.Dao
import androidx.room.Query
import io.reactivex.Single

@Dao
interface ReviewDao : BaseDao<ReviewEntity> {
    @Query("select * from  ${ReviewEntity.TABLE_NAME} where ${ReviewEntity.C_ID} = :uid")
    fun getAllReview(uid: Long): Single<ReviewEntity>

    @Query("delete from  ${ReviewEntity.TABLE_NAME}")
    fun deleteReview(): Int
}