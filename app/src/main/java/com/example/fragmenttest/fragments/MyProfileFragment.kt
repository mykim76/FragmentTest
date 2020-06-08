package com.example.fragmenttest.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmenttest.BaseFragment
import com.example.fragmenttest.MainActivity
import com.example.fragmenttest.NickNameActivity
import com.example.fragmenttest.R
import kotlinx.android.synthetic.main.fragment_my_profile.*

class MyProfileFragment : BaseFragment(){

    val REQ_MESSAGE_CODE  = 1000

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile, container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setValues()
        setupEvents()
    }

    override fun setValues() {
    }

    override fun setupEvents() {

        dialBtn.setOnClickListener {
            //String 가공시 text 변수들은 자동으로 String변환됨 => toString() 호출할 필요가 없음
            val myUri = Uri.parse("tel:${phoneNumEdt.text}")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)

            startActivity(myIntent)
        }

        getNickBtn.setOnClickListener {
            val name = nickTxt.text.toString()
            val myIntent = Intent(mContext, NickNameActivity::class.java)
            myIntent.putExtra("nowNick",name)
            startActivityForResult(myIntent,REQ_MESSAGE_CODE)
        }
    }



}