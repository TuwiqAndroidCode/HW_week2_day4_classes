fun main(args: Array<String>) {



} // end main

class Course {
    var CourseName = ""
    var number_of_lectures = 0
    var students = mutableListOf<Student>()
    var professor = Professor()


    fun numberOfStudents() {
        var NumberOfSTU = students.size
    } // end Number of stu

    fun assignProfessor(p: Professor) {
        var P_C = mutableMapOf( professor to CourseName)
        P_C.putIfAbsent(professor, CourseName)
    }

    fun professorName(){
        println("Professor name is : ${professor.toString()}")

    }

    fun enroll(s: Student) {
        var addSTUforCou = mutableListOf<String>()
        var s = Student()

        if (addSTUforCou.size < 20)
            addSTUforCou.add(s.firstName)
        else
            println("Can't add new stu, the cours is fully !!")
    }

    fun courseInfo(): String {

        return "The Course Name is :$CourseName " +
                "and number of lec :$number_of_lectures" +
                "Students names are: $students " +
                "Professor is : $professor"
    }
} // end class Course


class Professor {
    var firstName = ""
        get() = field.toString()
    var lastName = "TE"
        get() = field.toString()
    var telephone = ""
    var courses = ""


    fun PtintNameOfProfessor() {
        println("Professor Name is : $firstName $lastName")
    } // end  fun PtintName of Professor
} // end class Professor

class Student {
    var firstName = ""
    var lastName = ""
    var courses = ""


    fun PtintNameOfStudent() {
        println("Student Name is : $firstName $lastName")
    } // end  fun PtintName of Student

} // end class Student

//    var STU = mutableListOf<String>()
//    var addSTU =  STU.add(firstName)