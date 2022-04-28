package com.kotlin.bindings.data_binding

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.kotlin.bindings.R
import com.kotlin.bindings.data_binding.live_data.DataBindingLiveData
import com.kotlin.bindings.databinding.ActivityDataBindingTutorialBinding
import com.kotlin.bindings.view_binding.EnlistEmployee

class ActivityDataBindingTutorial : AppCompatActivity() {

    private lateinit var binding: ActivityDataBindingTutorialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_tutorial)

        binding.btnTextDataBindingTutorial.setOnClickListener { onButtonClick() }
        binding.btnViewModelDataBindingTutorial.setOnClickListener { onLiveDataClick() }
    }

    private fun onButtonClick() {
        binding.tvTextDataBindingTutorial.text = resources.getString(R.string.data_activity)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, EnlistStudent::class.java))
        }, 2000)
    }

    private fun onLiveDataClick() {
        startActivity(Intent(this, DataBindingLiveData::class.java))
    }
}