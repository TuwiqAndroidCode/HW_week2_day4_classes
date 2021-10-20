fun main(args: Array<String>) {

    println("--------------Student--------------")
    var FStudent = Student()
    FStudent.firstName="Lamia"
    FStudent.lastName="Omar"
    FStudent.courses="Kotlin"
    println(FStudent.fullName())

    println("-------------Professor---------------")

    var FProfessor = Professor()
    FProfessor.firstName="Hussain"
    FProfessor.lastName="Mohamed"
    FProfessor.courses="Kotlin"
    FProfessor.telephone="055555555"
    println(FProfessor.fullName())

    println("-------------Course---------------")

    var FCourse = Course("Husaain Mohammed","Kotlin")
    FCourse.number_of_lectures=25

//print the number of student
    FCourse.students=14
    FCourse.numberOfStudents()

// assign professor to course. Course can have only one professor
    FCourse.assignProfessor("Omar")
    println(FCourse.listOfProfessor)
    FCourse.assignProfessor("Hussain")

// return the course name number of lectures professor and students
    FCourse.courseInfo()
   println(FCourse.ProfessorFullName)

// assign student to this course. Student can’t be enrolled to a course if the course has 20 studens
    FCourse.enroll("Reem")
}



class Course(var ProfessorFullName :String ,  var CourseName :String){

    var number_of_lectures : Int = 0
    var students : Int= 0
    var listOfProfessor = mutableListOf<String>()
    var listOfStudent= mutableListOf<String>()

    fun numberOfStudents(){ println(students) }

// assign professor to course. Course can have only one professor.
    fun  assignProfessor(professorName: String){
       if (listOfProfessor.size==1){ println("The course already have a professor")}
        else   listOfProfessor.add(professorName) }

// return professor full name
    fun professorName(): String {
     return ProfessorFullName
    }

// assign student to this course. Student can’t be enrolled to a course if the course has 20 studens
    fun enroll (studentName :String ){
        if (listOfStudent.size>=21){ println("Sorry the course have the maximum num of student ")}
        else  listOfProfessor.add(studentName) }

// return the course name number of lectures professor and students
    fun courseInfo(){
        println("The course name is $CourseName - the number of lectures $number_of_lectures" +
                "- the professor is $listOfProfessor - number of student is $students")
    }

}


class Professor(){
   var firstName:String=""
    var lastName:String=""
    var telephone:String=""
    var  courses:String=""

    fun  fullName(){
        println("$firstName   $lastName") }

}

class Student(){
    var firstName:String=""
    var lastName:String=""
    var  courses:String=""

    fun  fullName(){
        println("$firstName   $lastName"  ) }

 }

