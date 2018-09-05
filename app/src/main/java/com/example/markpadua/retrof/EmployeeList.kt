package com.example.markpadua.retrof

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class EmployeeList {

    @SerializedName("employee")
    @Expose
    var employee : ArrayList<employee>? = null
}