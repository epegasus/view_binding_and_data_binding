package com.kotlin.bindings.data_binding.live_data.binding_adapter

import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.google.android.material.imageview.ShapeableImageView

@BindingAdapter("imageFromUrl")
fun ShapeableImageView.imageFromUrl(imageUrl: String) {
    if (imageUrl.isNotEmpty())
        Glide.with(this).load(imageUrl).into(this)
}