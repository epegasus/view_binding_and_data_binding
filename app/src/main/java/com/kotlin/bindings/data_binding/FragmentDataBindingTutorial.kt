package com.kotlin.bindings.data_binding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.kotlin.bindings.R
import com.kotlin.bindings.data_binding.model.Profile
import com.kotlin.bindings.databinding.FragmentDataBindingTutorialBinding

class FragmentDataBindingTutorial : Fragment() {

    private var _binding: FragmentDataBindingTutorialBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_data_binding_tutorial, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnTextDataBindingTutorial.setOnClickListener { onButtonClick() }
    }

    private fun onButtonClick() {
        binding.tvTextDataBindingTutorial.text = resources.getString(R.string.data_fragment)
        binding.profile = Profile(1, "https://images.pexels.com/photos/1767434/pexels-photo-1767434.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}