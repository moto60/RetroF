package com.example.markpadua.retrof

import android.app.ProgressDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
class MainActivity : AppCompatActivity() {

    private var employeeList: ArrayList<employee>?   = null
    private var loading: ProgressDialog? = null
    private var recyclerView: RecyclerView? = null
    private var eAdapter: EmployeesAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Creating an object of our api interface
        var api = RetroInstantiate.retroInstantiate

        //json call
         api.myJSON().enqueue(object : Callback<EmployeeList> {
            override fun onResponse(call: Call<EmployeeList>, response: Response<EmployeeList>) {
                //bye dialog
                //loading!!.dismiss()

                employeeList = response?.body()!!.employee
                recyclerView = findViewById(R.id.recyclerView)
                eAdapter = EmployeesAdapter(employeeList!!)
                val eLayoutManager = LinearLayoutManager(applicationContext)
                recyclerView?.layoutManager = eLayoutManager
                recyclerView?.itemAnimator = DefaultItemAnimator() as RecyclerView.ItemAnimator?
                recyclerView?.adapter = eAdapter
                eAdapter!!.notifyDataSetChanged()

            }

            override fun onFailure(call: Call<EmployeeList>, t: Throwable) {
                loading?.dismiss()
            }
        })

        //enqueue callback


    }
}
