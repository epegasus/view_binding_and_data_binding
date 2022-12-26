package com.kotlin.bindings.data_binding.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.bindings.R
import com.kotlin.bindings.data_binding.model.Student
import com.kotlin.bindings.databinding.ListItemStudentBinding

class AdapterStudent(private val studentList: ArrayList<Student>) : RecyclerView.Adapter<AdapterStudent.ViewHolderStudent>() {

    class ViewHolderStudent(val binding: ListItemStudentBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderStudent {
        val binding: ListItemStudentBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.list_item_student, parent, false)
        return ViewHolderStudent(binding)
    }

    override fun onBindViewHolder(holder: ViewHolderStudent, position: Int) {
        val student = studentList[position]
        holder.binding.student = student
    }

    override fun getItemCount(): Int {
        return studentList.size
    }
}