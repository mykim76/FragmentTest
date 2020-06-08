package com.example.fragmenttest.adapters

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.fragmenttest.R
import com.example.fragmenttest.datas.Student

//class StudentAdapter(context:Context,resId:Int,list:List<Student>):ArrayAdapter<Student>(context,resId,list)
class StudentAdapter(context: Context, resId:Int, list:List<Student>):ArrayAdapter<Student>(context,resId,list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) { // 재사용할 XML(List Item) 이 없는 경우(처음 몇개를 그릴때는 아직 없겠지?)
            tempRow = inf.inflate(R.layout.list_student, null)
        }
        val row = tempRow!!
        
        tempRow?.let { 
            //널이 아닐 땐 그냥 지나감 =>재활용 할 뷰가 있음
        }.let {
            
            //널인 경우
            tempRow = inf.inflate(R.layout.list_student, null)
        }

        val nameAndAgeTxt = row.findViewById<TextView>(R.id.nameAndAgeTxt)
        val genderTxt = row.findViewById<TextView>(R.id.genderTxt)

        val data = mList.get(position)
        nameAndAgeTxt.text="${data.name}(${data.getAge(2020)}세)"
        if(data.isMale) {
            genderTxt.text = "남자"
        }
        else{
            genderTxt.text = "여자"
        }

        return row

    }
}