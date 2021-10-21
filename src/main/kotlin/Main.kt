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
class Course(var courseName: String) {
    var number_of_lectures: Int = 0
    var students = mutableListOf<Student>()
    var professor: Professor = Professor()
    var isTaken = false

    fun numberOfStudents(): Int {
        return students.size
    }

    fun assignProfessor(p: Professor): Boolean {
        return if (!isTaken && p.firstName != professor.firstName) {
            this.professor = p
            this.professor.courses.add(this.courseName)
            this.isTaken = true
            true
        } else {
            println("Can't assign the professor ${p.fullName()}, there is anthor Professor ${this.professor.fullName()}!")
            false        }
    }

    fun professorName(): String {
        return this.professor.fullName()
    }

    fun enroll(s: Student): Boolean {
        return if (this.students.size <= 20 && !this.students.contains(s)) {
            this.students.add(s)
            s.courses.add(this.courseName)
            true
        } else {
            println("Student can't be enrolled")
            false
        }
    }

    fun courseInfo(): String {
        return "Name of course: ${this.courseName}, Number of lectures: ${this.number_of_lectures}, Name of professor: " +
                "${professor.fullName()} \n,Number of the students: ${numberOfStudents()},Name of students:${printStudentList()}"
    }

    fun printStudentList(): String {
        var studentName = ""
        for (i in 0 until students.size - 1) {
            studentName += "${i + 1}-${students[i].fullName()} ,"
        }
        studentName += "${students.size}-${students[students.size - 1].fullName()}"
        return studentName
    }
}
class Student() {
    var firstName =""
    var lastName =""
    var courses = mutableListOf<String>()
    constructor( firstName: String,  lastName: String):this(){
        this.firstName=firstName
        this.lastName=lastName

    }
    fun fullName(): String {
        return "${firstName} \t ${lastName}"
    }
    fun addcourses (coursesName:String){
        courses.add(coursesName)
    }
    fun deleteSubject (coursesName:String){
        courses.remove(coursesName)
    }
}
class Professor( ) {

    var firstName =""
    var lastName =""
    var telephone = ""
        set(value) {
            if (value.length == 10) field = value else println("Enter a valid number")
        }
    var courses = mutableListOf<String>()
    constructor(firstName: String, lastName: String, telephone: String): this() {
        this.firstName = firstName
        this.lastName = lastName
        this.telephone = telephone
    }
    fun fullName(): String {
        return "${firstName} \t ${lastName}"
    }

}
