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
//        if(position==0)
//        {
//            return FirstFragment();
//        }
//        else if(position==1)
//        {return SecondFragment();}
//        else {return ThirdFragment();}

        return when(position){
            0->MyProfileFragment()
            else->StudentListFragment()
        }
    }

}