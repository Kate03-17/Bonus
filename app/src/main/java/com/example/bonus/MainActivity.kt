package com.example.bonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout

    private lateinit var ViewPagerFragmentAdapter: ViewPagerFragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)

        ViewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)

        viewPager.adapter = ViewPagerFragmentAdapter

        TabLayoutMediator(tabLayout, viewPager) {tab, position ->
            tab.text = "Tab ${position}"
        }.attach()
    }


}