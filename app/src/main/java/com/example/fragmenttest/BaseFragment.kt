package com.example.fragmenttest

import androidx.fragment.app.Fragment

abstract class BaseFragment: Fragment() {
    abstract fun setValues()
    abstract fun setupEvents()

}