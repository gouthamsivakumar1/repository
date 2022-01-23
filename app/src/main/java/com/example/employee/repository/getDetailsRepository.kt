    package com.example.employee.repository
    import androidx.lifecycle.LiveData
    import androidx.room.Dao
    import com.example.employee.api.ApiResponse
    import com.example.employee.api.RestAPIEntity
    import com.example.employee.model.RepositoryDetailsResponse
    import com.example.employee.utils.NetworkOnlyResource


    @Dao
    class DetailsRepository (
        private val mRestAPIEntity: RestAPIEntity){
         fun getList(keyword :String?) =
            object : NetworkOnlyResource<Array<RepositoryDetailsResponse>>() {
                override fun createCall(): LiveData<ApiResponse<Array<RepositoryDetailsResponse>>> {
                    return mRestAPIEntity.getRepository(keyword);
                }
                override fun saveCallResult(item: Array<RepositoryDetailsResponse>?) {
               //     item?.forEach { it ->mAppDatabase.RepositoryDao().insert(it) }
                }
            }.asLiveData

      //  fun getLocalList(keyword :String) = mAppDatabase.RepositoryDao().getList(keyword)
    }