package com.example.fragmentpractice.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.graphics.drawable.DrawableCompat.inflate
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentResultListener
import androidx.fragment.app.FragmentTransaction
import com.example.fragmentpractice.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_two.*
import java.util.zip.Inflater

class FirstFragment : Fragment()  {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        btnChangeText.setOnClickListener {
            tvContent.text = "안녕하세요"
        }
        btnSecondFrag.setOnClickListener {
            val f: SecondFragment = SecondFragment()
            val bundle = bundleOf("secondD" to tvContent.text.toString())

            f.arguments = bundle

            activity?.supportFragmentManager!!.beginTransaction()
                .replace(R.id.secondFrag, SecondFragment()).commit()

        }
    }


}