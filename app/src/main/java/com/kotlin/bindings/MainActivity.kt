package com.kotlin.bindings

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.kotlin.bindings.data_binding.ActivityDataBindingTutorial
import com.kotlin.bindings.view_binding.ActivityViewBindingTutorial

class MainActivity : AppCompatActivity() {

    private lateinit var btnViewBinding: MaterialButton
    private lateinit var btnDataBinding: MaterialButton

    private fun initializations() {
        btnViewBinding = findViewById(R.id.btn_view_binding_Main)
        btnDataBinding = findViewById(R.id.btn_data_binding_Main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initializations()

        btnViewBinding.setOnClickListener { startActivity(Intent(this, ActivityViewBindingTutorial::class.java)) }
        btnDataBinding.setOnClickListener { startActivity(Intent(this, ActivityDataBindingTutorial::class.java)) }
    }
}