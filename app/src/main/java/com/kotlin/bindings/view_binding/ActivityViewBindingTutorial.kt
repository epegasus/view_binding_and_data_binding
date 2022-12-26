package com.kotlin.bindings.view_binding

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.kotlin.bindings.R
import com.kotlin.bindings.databinding.ActivityViewBindingTutorialBinding

class ActivityViewBindingTutorial : AppCompatActivity() {

    private val binding by lazy {
        ActivityViewBindingTutorialBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Root View means the most parent view, here it is Constraint Layout in xml
        setContentView(binding.root)


        binding.btnTextViewBindingTutorial.setOnClickListener { onButtonClick() }
    }

    private fun onButtonClick() {
        binding.tvTextViewBindingTutorial.text = resources.getString(R.string.view_activity)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, EnlistEmployee::class.java))
        }, 2000)
    }
}