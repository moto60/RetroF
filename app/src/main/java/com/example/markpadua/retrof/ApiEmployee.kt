package com.example.markpadua.retrof

import retrofit2.Call
import retrofit2.http.GET

interface ApiEmployee {

    @GET("http://sampleapi.us.openode.io/") //for get
    fun myJSON(): Call<EmployeeList>
//to return the list of employees

    }