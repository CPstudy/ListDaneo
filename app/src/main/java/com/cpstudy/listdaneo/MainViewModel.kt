package com.cpstudy.listdaneo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var daneoList = MutableLiveData(getList())

    private fun getList(): ArrayList<Daneo>{
        return arrayListOf(
                Daneo("apple", "사과"),
                Daneo("banana", "바나나"),
                Daneo("cat", "고양이"),
                Daneo("dog", "개"),
                Daneo("elephant", "코끼리")
        )
    }

    fun addDaneo(daneo: Daneo) {
        daneoList.value?.add(daneo)
        Log.d("ViewModel", daneoList.value.toString())
    }
}