package com.example.employee.repository
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.employee.model.RepositoryDetailsResponse

@Database(entities =[RepositoryDetailsResponse::class], version = 2,exportSchema = false)
abstract class AppDatabase :RoomDatabase() {
 abstract  fun RepositoryDao() :RepositoryDao
}