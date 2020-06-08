package com.example.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmenttest.adapters.MyPagerAdapter

class MainActivity : BaseActivity() {
    lateinit var myPagerAdapter : MyPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setValues() {


    }

    override fun setupEvents() {
        TODO("Not yet implemented")
    }
}
