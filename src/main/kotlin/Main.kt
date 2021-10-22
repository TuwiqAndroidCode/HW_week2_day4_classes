fun main() {

    fun main() {
        var course = Course()
        course.courseName="Arabic"
        course.numberOflectures=10
        course.students
        course.professor
        var listOfcourse= mutableListOf<String>("Arabic, Math, History")
        fun listOfcourse(courseName:String){
            listOfcourse.add(courseName)

        }
         println(listOfcourse)




        var professor=Professor()
        professor.firstName="Zamel "
        professor.lastName="Mohammed"
        professor.courses11
        println("the professor : ${professor.firstName} ${professor.lastName}")

        var student= Professor()

        student.firstName="Faisal"
        student.lastName="Nahi"
        student.courses11
        println("student name : ${student.firstName}${student.lastName}")

        println("course is ${course.courseName}")
        println("number Of lectures: ${course.numberOflectures}")
        println("the students: ${course.students}")
        println("the professor:${course.professor}")

    }



    }

    class Professor {
        var firstName: String = "Zamel"
        var lastName: String = "Mohammed"
        val courses11: String = " English , Math "

    }
        class Student {
            var firstName :String="Faisal"
            var lastName:String="Nahi "
            val courses1:String="English, Math"

        }

class Course {
    var courseName:String= "Arabic"
    var numberOflectures:Int=10
    val students:String = "Faisal,ALi,Sam"
    val professor:String = "Zamel"

    var listOfcourse= mutableListOf<String>("Arabic, Math, History")


}
