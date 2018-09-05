package com.example.markpadua.retrof

import android.widget.TextView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.retrofit_list.view.*


class EmployeesAdapter(private val employees: List<employee>) : RecyclerView.Adapter<EmployeeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.retrofit_list, parent, false)

        return EmployeeViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        holder.BindData(employees,position)
    }

    override fun getItemCount(): Int {
            return employees.size
    }

}