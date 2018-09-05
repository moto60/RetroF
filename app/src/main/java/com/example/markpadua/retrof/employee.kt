package com.example.markpadua.retrof

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class employee {
    @SerializedName("employee_id")
    @Expose
    val employeeID : Long? = null
    @SerializedName("name")
    @Expose
    val name : String? = null
    @SerializedName("birthday")
    @Expose
    val dob : String? = null
    @SerializedName("job")
    @Expose
    val job : String? = null
    @SerializedName("contact")
    @Expose
    val contactNumber : String? = null
    @SerializedName("email")
    @Expose
    val email : String? = null
    @SerializedName("salary")
    @Expose
    val salary : String? = null
}