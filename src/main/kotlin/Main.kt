fun main(args: Array<String>) {
    println("-------------Case1--------------")
    var math = Course("Math")
    math.number_of_lectures = 7
    var professorMohamed = Professor("Mohamed", "Zamel", "0599999999")
    if (math.assignProfessor(professorMohamed))
        println("added the professor successfully")
    professorMohamed.courses.add("Math")
    if (math.students.add(Student("Rahaf", "Nasser")))
        println("added the student successfully")
    //println("Professor name: ${math.professorName()}")
    println("About the course:\n${math.courseInfo()}")

    println("-------------Case2--------------")

    var kotlin = Course("Kotlin")
    kotlin.number_of_lectures = 10
    var professorHussain = Professor("Hussain", "Alsadun", "0599999999")
    if (kotlin.assignProfessor(professorHussain))
        println("added the professor successfully")
    if (kotlin.assignProfessor(professorMohamed))
        println("added the professor successfully")
    if (kotlin.students.add(Student("Rahaf", "Nasser")))
        println("added the student successfully")
    if (kotlin.students.add(Student("Foton", "Nasser")))
        println("added the student successfully")
    println("Professor name: ${kotlin.professorName()}")
    println("About the course:\n${kotlin.courseInfo()}")
}

/*Attributes: CourseName, number_of_lectures, students, professor.
Methods:
int numberOfStudents()
boolean assignProfessor(Professor p) // assign professor to course. Course can have only one professor.
string professorName() // return professor full name
boolean enroll(Student s) // assign student to this course. Student can’t be enrolled to a course if the course has 20 studens
string courseInfo() // return the course name number of lectures professor and students*/
class Course(var courseName: String) {
    var number_of_lectures: Int = 0
        set(value) {
            if (value > 0) field = value else println("Enter a valid number")
        }
    var students = mutableListOf<Student>()
    var professor: Professor = Professor()
    var flag = false

    fun numberOfStudents(): Int {
        return students.size
    }

    fun assignProfessor(p: Professor): Boolean {
        return if (!flag && p.firstName != professor.firstName) {
            this.professor = p
            this.professor.courses.add(this.courseName)
            this.flag = true
            true
        } else {
            println("Can't assign the professor ${p.fullName()}, there is Professor ${this.professor.fullName()}!")
            false
        }
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
            println("Student can’t be enrolled")
            false
        }
    }

    fun courseInfo(): String {
        return "Name of course: ${this.courseName} \nNumber of lectures: ${this.number_of_lectures}\nName of professor: ${professor.fullName()}\nNumber of the students: ${numberOfStudents()}\nName of students:  ${printStudentList()}"
    }

    fun printStudentList(): String {
        var nameOfStu = ""
        for (i in 0 until students.size - 1) {
            nameOfStu += "${i + 1}-${students[i].fullName()} ,"
        }
        nameOfStu += "${students.size}-${students[students.size - 1].fullName()}"
        return nameOfStu
    }
}

/*Attributes: firstName, lastName, telephone, courses.
Methods: String fullName() // return “firstName lastName”*/
class Professor() {
    var firstName: String = ""
    var lastName: String = ""
    var telephone = ""
        set(value) {
            if (value.length == 10) field = value else println("Enter a valid number")
        }
    var courses = mutableListOf<String>()

    constructor(firstName: String, lastName: String, telephone: String) : this() {
        this.firstName = firstName
        this.lastName = lastName
        this.telephone = telephone
    }

    fun fullName(): String {
        return "${this.firstName} ${this.lastName}"
    }

}

/*Attributes: firstName, lastName, courses.
Methods: String fullName() // return “firstName lastName”*/
class Student(var firstName: String, var lastName: String) {
    var courses = mutableListOf<String>()

    fun fullName(): String {
        return "${this.firstName} ${this.lastName}"
    }
}