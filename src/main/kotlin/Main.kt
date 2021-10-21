fun main(args: Array<String>) {

    var p = Professor ()
    p.firstName = "Hussain"
    p.PtintNameOfProfessor()

} // end main

class Course {
    var CourseName = ""
    var number_of_lectures = 0
    var students = mutableListOf<Student>()
    var professor = Professor()

    fun numberOfStudents() {

    } // end Number of stu

   fun assignProfessor(p:Professor) {


   }
    fun professorName() {


    }
   fun enroll(s:Student) {


   }
    fun courseInfo(): String {

            return "The Course Name is :$CourseName " +
                    "and number of lec :$number_of_lectures" +
                    "Students names are: $students " +
                    "Professor is : $professor"
    }
    /*
    override fun toString(): String {
        return "The Course Name is :$CourseName " +
                "and number of lec :$number_of_lectures" +
                "Students names are: $students " +
                "Professor is : $professor"
    }*/


} // end class Course

class Professor {
    var firstName =""
    var lastName = ""
    var telephone = ""
    var courses = ""

    fun PtintNameOfProfessor () {
        println("Professor Name is : $firstName $lastName")
    } // end  fun PtintName of Professor
} // end class Professor

class Student {
    var firstName = ""
    var lastName = ""
    var courses= ""
      //  get() = field.toString()

    fun PtintNameOfStudent () {
        println("Student Name is : $firstName $lastName")
    } // end  fun PtintName of Student

} // end class Student