package com.kotlin.bindings.view_binding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kotlin.bindings.databinding.ActivityEnlistEmployeeBinding
import com.kotlin.bindings.view_binding.adapter.AdapterEmployee
import com.kotlin.bindings.view_binding.model.Employee

class EnlistEmployee : AppCompatActivity() {

    private val binding by lazy { ActivityEnlistEmployeeBinding.inflate(layoutInflater) }
    private val employeeList = ArrayList<Employee>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        fillList()
    }

    private fun fillList() {
        employeeList.add(Employee(1605, "Nabeel"))
        employeeList.add(Employee(1606, "Shahzain"))
        employeeList.add(Employee(1607, "Abdul Moiz"))
        employeeList.add(Employee(1608, "Umair"))
        employeeList.add(Employee(1609, "Adnan"))

        val adapterEmployee = AdapterEmployee(employeeList)
        binding.rvEmployeesEnlistEmployee.adapter = adapterEmployee
    }
}