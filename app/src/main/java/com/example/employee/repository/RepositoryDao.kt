package com.example.employee.repository
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.employee.model.RepositoryDetailsResponse


@Dao
interface RepositoryDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(repository: RepositoryDetailsResponse)


    @Query("SELECT * from RepositoryDetailsResponse Where name Like:recipe||'%' ORDER BY name ASC")
    fun getList(recipe: String): LiveData<List<RepositoryDetailsResponse>>

}