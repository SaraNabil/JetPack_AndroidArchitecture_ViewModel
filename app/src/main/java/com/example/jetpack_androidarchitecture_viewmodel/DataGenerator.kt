package com.example.jetpack_androidarchitecture_viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

class DataGenerator : ViewModel() {
    private val TAG: String = "MyApp"
    var randomNum: MutableLiveData<String> = createNumber()
    private fun createNumber(): MutableLiveData<String> {
        val myRandomNumber = MutableLiveData<String>()
        Log.d(TAG, "Create new number")
        val random = Random()
        myRandomNumber.value = "${random.nextInt(10 - 1) + 1}"
        return myRandomNumber
    }

    override fun onCleared() {
        super.onCleared()
        Log.d(TAG, "ViewModel Cleared")
    }
}