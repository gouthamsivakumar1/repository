package com.example.employee.injection
import androidx.room.Room
import com.example.employee.api.RestAPIEntity
import com.example.employee.api.RestApiService
import com.example.employee.repository.AppDatabase
import com.example.employee.repository.DetailsRepository
import com.example.employee.viewmodel.RepositoryViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

fun appModule() = module {
    single {
        Room.databaseBuilder(
            androidApplication(),
            AppDatabase::class.java, "appDataBase"
        ).build()
    }

    single { RestApiService(get()).getRetrofitInstance() }
    single { RestApiService(get()).create(get(), RestAPIEntity::class.java) }
    single { DetailsRepository(get())}
    viewModel {RepositoryViewModel(get())}

}
