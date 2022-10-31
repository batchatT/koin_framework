package com.example.koin_framework.first_fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.koin_framework.data.Repository

class FirstFragmentViewModel(
    private val repo: Repository
) : ViewModel() {

    val dataText: LiveData<String>
        get() = _dataText
    private val _dataText = MutableLiveData("Initial data")

    fun getDataFromDB() {
        _dataText.value = repo.getDataFromDB()
    }

    fun getDataFromNetwork() {
        _dataText.value = repo.getDataFromNetwork()
    }
}