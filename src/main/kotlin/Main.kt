fun main() {
/*


In professorName you don’t need to add a parameter
You need to create a List of student
In enroll function you will add a student to the list
In numberOfStudents fun you will take the size of the list
 */

    var co = Course()



    co.CourseName="Kotlin"
    co.students
    co.professor= "Zemal"

var s = Student ()
    s.firstName =  "reem"
    s.lastName = "Alanazi"
   co.enroll(s)

    //input
    println( co.professorName("Reem", " Fawaz"))
    co.courseInfo("math",50,"zemal",19)
    co.enroll()

    // Test
    println(co.CourseName)
    println(co.CourseName)



}

    class Course {

        var listOfStudent =  mutableListOf<String>("reem","Ali","Ahmad")

        var CourseName: String = ""
        var number_of_lectures: Int = 0
        var students: Int = 0
        var professor: String = ""

        var list = mutableListOf("")

        fun numberOfStudents(Num: Int) {
            println(students)
        }

        fun assignProfessor(Professor: Boolean) {

        }

        fun professorName(firstName: String, lastName: String): String {
            return firstName + lastName
        }


        fun courseInfo(
            courseName: String, number_of_lectures: Int,
            professor: String, students: Int
        ) {

            println(
                "The course name is $courseName ," +
                        "Number of lectures is $number_of_lectures ," +
                        "Professor name is $professor," +
                        "Students $students "
            )

        }

        private var Student : Int = 20
        fun enroll(s: Student) {
            var Student : Int = 20

            if (Student <= 20)


            else
                println("CAN NOT")}

        fun enroll():Int {

            return Student
        }

    }

    class Professor {

        var firstName : String = ""
        var lastName : String = ""
        var courses : String = ""
        var telephone : Int = 0

        fun professorName () : String{


        }


    }

    class Student {


        var firstName : String = ""
        var lastName : String = ""
        var courses : String = ""


        fun studentName (firstName : String,lastName : String): String {

            return firstName + lastName
        }


          }





