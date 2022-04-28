package com.kotlin.bindings.view_binding

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kotlin.bindings.R
import com.kotlin.bindings.databinding.FragmentViewBindingTutorialBinding

class FragmentViewBindingTutorial : Fragment() {

    private var _binding: FragmentViewBindingTutorialBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentViewBindingTutorialBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setHandler()

        binding.btnTextViewBindingTutorial.setOnClickListener { onButtonClick() }
    }

    private fun setHandler() {
        Handler(Looper.getMainLooper()).postDelayed({
            //Snackbar.make(binding.root, "Hello", Snackbar.LENGTH_SHORT).show()
        }, 5000)
    }

    private fun onButtonClick() {
        binding.tvTextViewBindingTutorial.text = resources.getString(R.string.view_fragment)
        //onDestroyView()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    /*
    *   Let's explain it, assume you have Fragment A and B (both A and B in BackStack) same container view and same FragmentManager.
    *   When you replace fragment A by B. All view elements of A will be destroyed but the instance of Fragment A still alive in fragment BackStack.
    *   It means if you keep value of _binding it can be leaks because it still keep view reference but Android System wants to clear it.
    *   So Google recommends you assign null to _binding to release view reference.
    *
    *   You shouldn't handle any network response after onDestroyView if it update your UI because your fragment views not present to User.
    * */
}