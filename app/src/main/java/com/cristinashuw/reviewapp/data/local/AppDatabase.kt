package com.cristinashuw.reviewapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    version = AppDatabase.DB_VERSION,
    exportSchema = false,
    entities = [
        ReviewEntity::class
    ]
)

abstract class AppDatabase : RoomDatabase() {
    abstract fun review(): ReviewDao

    companion object {
        const val DB_NAME =
                "WpIknXUQHQNkn5RxdF0IQLIf6GyrxmVgPEnBkH7e32qZn0MvQKV3vNZaFFizJiQu"
        const val DB_VERSION = 1
    }
}