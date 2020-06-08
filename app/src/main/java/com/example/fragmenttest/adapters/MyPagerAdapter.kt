package com.example.fragmenttest.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.fragmenttest.fragments.MyProfileFragment
import com.example.fragmenttest.fragments.StudentListFragment

class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {

        return when(position){
            0->MyProfileFragment()
            else->StudentListFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "프로필 화면"
            else -> "수강생 목록"
        }
    }

}