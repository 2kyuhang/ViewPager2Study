package com.example.viewpager2study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager2study.adapters.MainPagerAdapter
import com.example.viewpager2study.databinding.ActivityMainBinding
import com.example.viewpager2study.fragments.BaseFragment

class MainActivity : BaseActivity() {
    lateinit var binding : ActivityMainBinding
    //뷰페이저2 를 사용하기 위한 어답터 생성
    lateinit var mPagerAdapter : MainPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {
        //확인용이다
        Log.d("","")
    }

    override fun setValues() {
        mPagerAdapter = MainPagerAdapter(this)
        binding.mainViewPager.adapter = mPagerAdapter
        Log.d("","되돌아옴")
        Log.d("","다시 저장 가능?")
        binding.mainViewPager.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback(){
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    when (position) {
                        0 -> binding.bottomNav.selectedItemId = R.id.f_item
                        1 -> binding.bottomNav.selectedItemId = R.id.s_item
                        2 -> binding.bottomNav.selectedItemId = R.id.t_item
                    }
                }
            }
        )
        binding.bottomNav.setOnItemSelectedListener {
            //메뉴 아이템에 따라서 화면을 바꿔주겠다!
            when (it.itemId) {
                R.id.f_item -> binding.mainViewPager.currentItem = 0
                R.id.s_item -> binding.mainViewPager.currentItem = 1
                R.id.t_item -> binding.mainViewPager.currentItem = 2
            }
            return@setOnItemSelectedListener true
        }

    }
}