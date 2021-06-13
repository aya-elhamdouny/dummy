package com.example.dummy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dummy.databinding.ActivityMainBinding

class ViewModel : ViewModel() {
    val movieName = MutableLiveData<String>()
}