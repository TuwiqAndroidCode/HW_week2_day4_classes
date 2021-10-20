fun main(args: Array<String>) {

    // write your code here
var student1 = student()
    student1.firstName ="khalid"
    student1.lastName ="gh"
    student1.courses ="java"
    println(student1.fullName())

    var professor1 = professor()
    professor1.firstName ="zamel"
    professor1.lastName = "ss"
    professor1.telephone ="054445422"
    professor1.courses = "kotlin"
    println(professor1.fullname())



    var course1 = course("IT" , 20 , "zamel")
    println(course1.number_of_lecture)
    course1.assignProfessor("")
}
class course (var coursename:String , var number_of_lecture:Int , var professorName:String){
    var students  = 0
    var listofstudent = mutableListOf<String>()
    var Professor:Int = 0
    var listOfProfessor = mutableListOf<String>()
    var fullname:String = ""


fun numberofstudent():Int{
   return listofstudent.size

}
    fun  assignProfessor(professorName: String){
        if (listOfProfessor.size==1){ println("The course already have a professor")}
        else   listOfProfessor.add(professorName) }

}
    fun professorname(): String {
        return professorname()
    }
fun enroll (studentName :String ){
    if (listOf<student>().size>=21){ println("Sorry the course have the maximum num of student ")}
    else  listOf<professor>() }



class professor(){
    var firstName:String=""
    var lastName:String=""
    var telephone:String=""
    var  courses:String=""

    fun fullname():String{
        return "$firstName $lastName"
    }
}
class student(){
    var firstName:String=""
    var lastName:String=""
    var  courses:String=""
    fun fullName():String{
        return "$firstName $lastName"
    }
}

