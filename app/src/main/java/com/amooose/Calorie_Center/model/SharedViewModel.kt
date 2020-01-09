package com.amooose.Calorie_Center.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    val selected = MutableLiveData<Int>()

    fun selectedItem(item: Int) {
        selected.value = item
    }
}