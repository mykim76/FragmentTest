package com.example.fragmenttest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmenttest.adapters.MyPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_my_profile.*

class MainActivity : BaseActivity() {
    lateinit var myPagerAdapter : MyPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()
    }

    override fun setValues() {

        myPagerAdapter = MyPagerAdapter(supportFragmentManager)
        myViewPager.adapter = myPagerAdapter

        myTabLayout.setupWithViewPager(myViewPager)

    }

    override fun setupEvents() {
//        getNickBtn.setOnClickListener {
//            val name = nickTxt.text.toString()
//            val myIntent = Intent(this, NickNameActivity::class.java)
//            myIntent.putExtra("nowNick",name)
//            startActivityForResult(myIntent,REQ_MESSAGE_CODE)
//        }
    }
}
