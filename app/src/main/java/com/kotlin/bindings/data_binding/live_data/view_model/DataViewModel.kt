package com.kotlin.bindings.data_binding.live_data.view_model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataViewModel : ViewModel() {

    val textMutableLiveData = MutableLiveData("Hello World")

    fun updateModel() {
        textMutableLiveData.value = "Hello Programmers!"
    }

}