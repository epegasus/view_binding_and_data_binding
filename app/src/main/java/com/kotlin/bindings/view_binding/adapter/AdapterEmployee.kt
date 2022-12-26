package com.kotlin.bindings.view_binding.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kotlin.bindings.R
import com.kotlin.bindings.databinding.ListItemEmployeeBinding
import com.kotlin.bindings.view_binding.model.Employee

class AdapterEmployee(private val employeeList: ArrayList<Employee>) : RecyclerView.Adapter<AdapterEmployee.ViewHolderEmployee>() {

    class ViewHolderEmployee(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ListItemEmployeeBinding.bind(itemView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderEmployee {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_employee, parent, false)
        return ViewHolderEmployee(view)
    }

    override fun onBindViewHolder(holder: ViewHolderEmployee, position: Int) {
        val employee = employeeList[position]
        holder.binding.tvIdListItemEmployee.text = employee.id.toString()
        holder.binding.tvNameListItemEmployee.text = employee.name
    }

    override fun getItemCount(): Int {
        return employeeList.size
    }

}