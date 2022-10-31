package com.example.koin_framework.second_fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.koin_framework.data.Repository

class SecondFragmentViewModel(
    private val repository: Repository
) : ViewModel() {

    val dataText: LiveData<String>
        get() = _dataText
    private val _dataText = MutableLiveData("Initial text")

    fun getDataFromNetwork() {
        _dataText.value = repository.getDataFromNetwork()
    }
}