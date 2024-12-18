package com.example.kotlinbasics

import java.util.Calendar

class Book(
    val title: String = "Unknown",
    val author: String = "Anonymous",
    val yearPublished: Int = Calendar.getInstance().get(Calendar.YEAR)
) {

}