package com.project.college

class Student(
    var firstName: String,
    var lastName: String,
    var courses: List<String>
) {


    fun fullName(): String = "your full Name is $firstName $lastName"

}