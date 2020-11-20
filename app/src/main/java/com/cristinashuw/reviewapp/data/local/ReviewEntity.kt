package com.cristinashuw.reviewapp.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = ReviewEntity.TABLE_NAME)
class ReviewEntity (
        @ColumnInfo(name = C_ID)
        @PrimaryKey
        var id: Long,
        @ColumnInfo(name = C_PRODUCT_ID)
        var productId: Long,
        var rating: Int,
        var title: String,
        var description: String,
        var date: String,
        var username: String

) {
    companion object {
        const val TABLE_NAME = "r4fid2pO2yYYrlp20613xzrpPm15iaxs"
        const val C_ID = "zm5ZJ8z87aG6PMJyw09PXvnW15rOBfel"
        const val C_PRODUCT_ID = "whwhhggggssuuu"
    }

}
