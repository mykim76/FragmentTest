package com.example.fragmenttest.datas

class Student(val name : String, val birth:Int, val isMale: Boolean) {
    fun getAge(thisYear:Int):String
    {
        return (thisYear - birth).toString()
    }
}