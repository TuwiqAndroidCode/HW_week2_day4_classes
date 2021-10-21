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

    fun assignProfessor(prof: Professor): Boolean {
        return if (!flag && prof.firstName != professor.firstName) {
            this.professor = prof
            this.professor.courses.add(this.courseName)
            this.flag = true
            true
        } else {
            println("Can't assign the professor ${prof.fullName()}, there is anthor Professor ${this.professor.fullName()}!")
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
