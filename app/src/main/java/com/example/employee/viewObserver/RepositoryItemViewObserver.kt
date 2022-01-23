package  com.example.employee.viewObserver
import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.employee.model.RepositoryDetailsResponse

class RepositoryItemViewObserver() : BaseObservable() {
    private  var mModel : RepositoryDetailsResponse? = null

    @Bindable
    fun getTitle()=mModel?.name?:""

    @Bindable
    fun getDescription()=mModel?.description?:""



    @Bindable
    fun getLanguage()= mModel?.language?:""

    @Bindable
    fun getStarCount()= mModel?.stargazers_count?:"0"


    fun setData(data :RepositoryDetailsResponse)
    {
        mModel =data
        Log.i("Tag","mModel :$mModel")
        notifyChange()
    }
}