package com.example.dummy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.dummy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: ViewModel
    private val movie : Movie = Movie("Beaty and the beast" ,
        "Belle, a village girl, embarks on a journey to save her father " +
                "from a creature that has locked him in his dungeon. Eventually," +
                " she learns that the creature is an enchanted prince who has been cursed.",
        "https://upload.wikimedia.org/wikipedia/en/d/d6/Beauty_and_the_Beast_2017_poster.jpg")




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(viewModel::class.java)
        binding.lifecycleOwner = this
        binding.movie = movie
    }
}