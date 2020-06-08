package com.example.fragmenttest.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 3
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
            0->FirstFragment()
            1->SecondFragment()
            else->ThirdFragment()
        }
    }

}