package com.example.fragmenttest

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class BaseFragment: Fragment() {

    // 화면을 Intent 생성을 위해 선언 시작
    lateinit var mContext : Context 
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mContext = activity as Context
    }
    // 화면을 Intent 생성을 위해 선언 끝=> BaseFragment를 상속받은 fragment에서 Intent(Activity)시 에러 없어짐
    abstract fun setValues()
    abstract fun setupEvents()

}