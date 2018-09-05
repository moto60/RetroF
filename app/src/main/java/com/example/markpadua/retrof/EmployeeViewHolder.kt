package com.example.markpadua.retrof

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

    class EmployeeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var employeeName: TextView
    var designation: TextView
    var email: TextView
    var salary: TextView
    var dob: TextView
    var contactNumber: TextView


    init {
        employeeName = view.findViewById(R.id.employeeName)
        email = view.findViewById(R.id.email)
        designation = view.findViewById(R.id.job)
        salary = view.findViewById(R.id.salary)
        dob = view.findViewById(R.id.birthday)
        contactNumber = view.findViewById(R.id.contact)
    }

    fun BindData(employees: List<employee>,employeeposition: Int){
        val employee = employees[employeeposition]
        employeeName?.setText(employee.name)
        email?.setText(employee.email)
        designation?.setText(employee.job)
        salary?.setText(employee.salary)
        dob?.setText(employee.dob)
        contactNumber?.setText(employee.contactNumber)


    }


}