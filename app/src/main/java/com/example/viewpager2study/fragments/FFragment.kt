package com.example.viewpager2study.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.viewpager2study.R
import com.example.viewpager2study.databinding.FragmentFBinding

class FFragment : BaseFragment() {

    lateinit var binding : FragmentFBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_f, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupEvent()
        setValues()
    }


    override fun setupEvent() {

    }

    override fun setValues() {

    }

}