package com.example.fragmenttest.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmenttest.BaseFragment
import com.example.fragmenttest.R
import com.example.fragmenttest.adapters.StudentAdapter
import com.example.fragmenttest.datas.Student
import kotlinx.android.synthetic.main.fragment_student_list.*

class StudentListFragment : BaseFragment() {

    val students = ArrayList<Student>()
    lateinit var studentAdapter : StudentAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_student_list, container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setValues()
        setupEvents()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        addStudents()

        studentAdapter = StudentAdapter(mContext,R.layout.list_student,students)
        stduentListView.adapter = studentAdapter
    }

    fun addStudents()
    {
        //alt + [students] 블럭을 선택후 아래로 내리면 블럭 일괄 수정 가능
        students.add(Student("조경진",1988,false))
        students.add(Student("김미영",2010,false))
        students.add(Student("김성우",1982,true))
        students.add(Student("김형근",1998,true))
    }
}