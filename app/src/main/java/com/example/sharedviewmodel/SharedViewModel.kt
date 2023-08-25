package com.example.sharedviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel:ViewModel() {
    private var _text = MutableLiveData("")
    val text:LiveData<String> = _text

    fun saveText(newText:String)
    {
        _text.value = newText
    }
}