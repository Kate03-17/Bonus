package com.example.bonus

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerFragmentAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 2


    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> ProfileFragment()
            1 -> EditProfileFragment()
            else -> ProfileFragment()
        }

    }


}