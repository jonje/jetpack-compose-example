package com.example.bottomnavcompose.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.bottomnavcompose.entity.Contact

@Database(
    entities = [Contact::class],
    version = 1
)
abstract class ContactDatabase : RoomDatabase() {
    abstract val contactDao: ContactDao
}