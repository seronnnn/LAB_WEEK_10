package com.example.lab_week_10.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TotalViewModel : ViewModel() {
    private val _total = MutableLiveData(0)
    val total: LiveData<Int> get() = _total

    init {
        _total.postValue(0)
    }

    fun incrementTotal() {
        _total.postValue(_total.value?.plus(1))
    }
}
