package com.example.viewpager2study.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager2study.fragments.FFragment
import com.example.viewpager2study.fragments.SFragment
import com.example.viewpager2study.fragments.TFragment

class MainPagerAdapter(fa:FragmentActivity) : FragmentStateAdapter(fa){

    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> FFragment()
            1 -> SFragment()
            else -> TFragment()
        }
    }
}