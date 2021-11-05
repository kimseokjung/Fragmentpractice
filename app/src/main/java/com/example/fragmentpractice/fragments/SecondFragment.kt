package com.example.fragmentpractice.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentResultListener
import androidx.fragment.app.FragmentResultOwner
import com.example.fragmentpractice.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_two.*
import kotlinx.android.synthetic.main.fragment_two.*

class SecondFragment : Fragment(),FragmentResultListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_two, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        FragmentResultListener { requestKey, result ->
            val bundle = result.getString("secondD")
            if (bundle != null) {
                tvContentSecond.text = bundle
                Log.d("TAG", "$bundle")
            }

        }
//        val bundle = arguments?.getString("secondD")
//        if (bundle != null) {
//            tvContentSecond.text = bundle
//            Log.d("TAG", "$bundle")
//        }

    }

    override fun onFragmentResult(requestKey: String, result: Bundle) {
        TODO("Not yet implemented")
    }
}