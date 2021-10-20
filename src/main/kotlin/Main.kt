package com.project.college

fun main() {
    var course=Course("Kotlin",1, mutableListOf("Nora","khloud","Rakan"),"Zamel")
    var professor=Professor("Mohammed","Zamel","+25448445454", mutableListOf("Programming","kotlin"))
    var professor2=Professor("Hussin","Sadun","+254483333", mutableListOf("Programming","kotlin"))
    var student=Student("Abdullah","alsmari",mutableListOf("Programming","kotlin"))


    println(course.courseInfo())
    println(professor.fullName())
    println(professor2.fullName())
    println(student.fullName())
}