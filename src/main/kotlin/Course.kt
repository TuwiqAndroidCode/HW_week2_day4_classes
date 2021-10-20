package com.project.college

class Course(
    var courseName: String?,
    var numberOfLectures: Int,
    var students: List<String>?,
    var professor: String?
) {

    //calculate number of students
    fun numberOfStudents(): Int = students!!.size


    //return professor fullName
    fun professorName(): String? = professor


    //return information of course
    fun courseInfo(): String =
        "Course Name Is: $courseName , number of lectures is: $numberOfLectures , number of students is: $students and the professor Name is: $professor"
}