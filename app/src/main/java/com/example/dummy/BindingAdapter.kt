package com.example.dummy


import android.widget.ImageView
import androidx.core.content.ContextCompat.startActivity
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso


@BindingAdapter("imageUrl")
fun loadImage(view: ImageView, url: String) {
    Picasso.get().load(url).into(view)
}

