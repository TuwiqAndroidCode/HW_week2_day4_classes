import java.lang.reflect.Constructor
fun main(args: Array<String>) {

    var P1 = Professor("Ahmed","AA","12345",)
    var S1 = Student("Raghad", "Mohammed","CS100")


}
class Course(){

    var professorOfCourse = Professor()
    var studentInCourse = Student()

    var CourseName : String =  "CS100"
    var number_of_lectures : Int = 2
    var students : Student = studentInCourse
    var professor : Professor = professorOfCourse

    constructor (CourseName : String,number_of_lectures : Int,studentInCourse : Student,professorOfCourse : Professor) :this()



    fun numberOfStudents (studentInCourse : Student ,CourseName : String){

        println(studentInCourse,CourseName)
    }

    //int numberOfStudents()

    //boolean assignProfessor(Professor p) // assign professor to course. Course can have only one professor.
    fun professorName(){

        println("firstName:${firstName} lastName")

    } // return professor full name


    fun enroll() {


        if (studentInCourse >= 20) {


        } // assign student to this course. Student can’t be enrolled to a course if the course has 20 studens
    }

    string courseInfo() // return the course name number of lectures professor and students

}

class Professor(){

    var Course1 = Course()

    // var firstName : String = "Ahmed"
    //var lastName: String = "AA"
    //var telephone:String = "12345"
    var courses: Course = Course1

    constructor (firstName: String,  lastName: String,  telephone:String) : this()
    constructor (firstName: String,  lastName: String,  telephone:String ,Course1 : Course  ) : this()

    fun fullName(firstName : String , lastName: String ){
        println("firstName:${firstName} lastName")

    }
}


class Student(){

    var Course1 = Course()

    //var firstName : String = "Raghad"
    //var lastName: String = "Mohammed"
    var courses: Course = Course1

    constructor (firstName: String , lastName: String) : this()
    constructor (firstName: String , lastName: String ,Course1: Course) : this()

    fun fullName(firstName : String , lastName: String ){

        println("firstName:${firstName} lastName")
    }
}