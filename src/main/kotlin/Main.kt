fun main() {
    println("=======================================================================================")
    val sub = Course("Arabic")
    sub.number_of_lectures = 5
    val professor1 = Professor("Umar", "Alblawi", "0555555555")
    if (sub.assignProfessor(professor1))
    println("professor added successfully")
    professor1.courses.add("Arabic")
    if (sub.students.add(Student("Shoug", "Saleh")))
    println("added the student successfully")
    println("size ${sub.students.size}")
    println("About the course:${sub.courseInfo()}")
    println("=======================================================================================")
    val sub1 = Course("English")
    sub1.number_of_lectures = 15
    val professor2 = Professor("Mohammed", "Hussain", "0546464646")
    if (sub1.assignProfessor(professor2))
        println("professor added successfully")
    if (sub1.assignProfessor(professor2))
        println("professor added successfully")
    if (sub1.students.add(Student("Nujud", "Saleh")))
        println("added the student successfully")
    if (sub1.students.add(Student("Nora", "Albqmi")))
        println("added the student successfully")
    println("Professor name: ${sub1.professorName()}")
    println("About the course:${sub1.courseInfo()}")
}

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
            println("Student can’t be enrolled")
            false
        }
    }

    fun courseInfo(): String {
 return "Name of course: ${this.courseName}, Number of lectures: ${this.number_of_lectures}, Name of professor: " +
"${professor.fullName()} \n,Number of the students: ${numberOfStudents()},Name of students:${printStudentList()}"
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

class Student(var firstName: String, var lastName: String) {
    var courses = mutableListOf<String>()

    fun fullName(): String {
        return "${this.firstName} ${this.lastName}"
    }
}