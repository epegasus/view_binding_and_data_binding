package com.kotlin.bindings.data_binding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.kotlin.bindings.R
import com.kotlin.bindings.data_binding.adapters.AdapterStudent
import com.kotlin.bindings.data_binding.model.Student
import com.kotlin.bindings.databinding.ActivityEnlistStudentBinding

class EnlistStudent : AppCompatActivity() {

    private lateinit var binding: ActivityEnlistStudentBinding
    private val studentList = ArrayList<Student>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_enlist_student)

        fillList()
    }

    private fun fillList() {
        studentList.add(Student(1605, "Nabeel"))
        studentList.add(Student(1606, "Shahzain"))
        studentList.add(Student(1607, "Abdul Moiz"))
        studentList.add(Student(1608, "Umair"))
        studentList.add(Student(1609, "Adnan"))

        val adapterStudent = AdapterStudent(studentList)
        binding.rvEmployeesEnlistStudent.adapter = adapterStudent
    }
}