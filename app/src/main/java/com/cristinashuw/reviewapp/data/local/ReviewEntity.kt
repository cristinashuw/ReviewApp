package com.cristinashuw.reviewapp.data.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = ReviewEntity.TABLE_NAME)
class ReviewEntity (
        @ColumnInfo(name = C_ID)
        @PrimaryKey
        var id: Long,

) {
    companion object {
        const val TABLE_NAME = "r4fid2pO2yYYrlp20613xzrpPm15iaxs"
        const val C_ID = "zm5ZJ8z87aG6PMJyw09PXvnW15rOBfel"
    }

}
