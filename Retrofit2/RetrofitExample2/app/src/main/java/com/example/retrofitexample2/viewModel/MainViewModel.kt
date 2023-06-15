package com.example.retrofitexample2.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofitexample2.api.Myapi
import com.example.retrofitexample2.api.RetrofitInstance
import com.example.retrofitexample2.model.Post
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private var All_data_mutable = MutableLiveData<List<Post>>()
    val All_data_livedata : LiveData<List<Post>>
        get() = All_data_mutable

    val api = RetrofitInstance.getInstance().create(Myapi::class.java)

    fun getPostAll() = viewModelScope.launch {
        val postAll = api.getPostAll()

        Log.d("Test",postAll.toString())

        All_data_mutable.value = postAll
    }
}