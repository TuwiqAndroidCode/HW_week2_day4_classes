package com.project.college

class Professor(
    var firstName: String,
    var lastName: String,
    var telephone: String,
    var courses: List<String>
) {


    fun fullName():String=" Professor Name is $firstName $lastName"
    fun fullName2():String=" Assisnt Professor Name is $firstName $lastName"

}