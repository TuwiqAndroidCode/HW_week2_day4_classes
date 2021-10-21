class Courses constructor(var CourseName: String, var number_of_lectures: String,
              var students: List<String>,var professor: String) {


    fun numberOfStudents(): Int{

        return students.size
    }

    fun assignProfessor(prof: Professors): Boolean{
        prof.courses.forEach{
            return it == CourseName
        }

        return false
    }

    fun professorName(): String{

        return professor
    }

    fun enroll(student: Students): Boolean{
        student.courses.forEach{
            return it == CourseName
        }

        return false
    }

    fun courseInfo(): String{
        return "\ncourse name: $CourseName\nNumber of lectures: $number_of_lectures\n" +
                "Professor: $professor\nStudents: $students"
    }

}