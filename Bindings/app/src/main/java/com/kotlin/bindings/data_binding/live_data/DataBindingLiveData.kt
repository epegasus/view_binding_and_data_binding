package com.kotlin.bindings.data_binding.live_data

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.kotlin.bindings.R
import com.kotlin.bindings.data_binding.live_data.view_model.DataViewModel
import com.kotlin.bindings.databinding.ActivityDataBindingLiveDataBinding

class DataBindingLiveData : AppCompatActivity() {

    private lateinit var binding: ActivityDataBindingLiveDataBinding
    private val viewModel: DataViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_live_data)

        binding.lifecycleOwner = this
        binding.viewModel = viewModel
    }
}