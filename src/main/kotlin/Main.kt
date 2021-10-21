fun main(args: Array<String>) {

    // write your code here

    val course1 = Course("Korean language")
    course1.number_of_lectures = 5
    val prof = Professor("kim", "heechul", "1234567890")
    if (course1.assignProfessor(prof))
        println("professor added successfully")
    prof.courses.add("Korean language")
    if (course1.students.add(Student("jun", "ki")))
        println("the student added successfully")
    println("size ${course1.students.size}")
    println("course information:${course1.courseInfo()}")



}
