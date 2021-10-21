//I know is my answer is not completed as you asked, but i really try to do it, my complex was in the 2 boolean conditions, for assignProfessor and enroll Student S
fun main() {

    var college = Course("IT101", 2, mutableListOf("Afrah","Sara","Nourah"), "Eng.Hussain")
    var college1 =Professor("Ahmed","Muhammad","098765", mutableListOf("IT100","IT101"))
    var college2 =Student("Ali","AlAli", mutableListOf("IT100,IT101"))
    println(college.numberOfStudent())
    println(college.courseInfo())
    println(college1.fullName())
    println(college2.fullName())
}
class Course(var courseName:String, var number_of_lecture:Int, var students:List<String>,var professor:String) {

    fun numberOfStudent():String="${students.size}"
    //var assign= true
    fun assignProfessor() {
        return assignProfessor()
    }
    //I know this is incorrect but I will but my answer
    fun professorName():String="$professor"
    fun enroll(studentS: Boolean) {
        var s=true
        if(studentS==s)
            println("you can rollin")
        return enroll(studentS)
    }
    fun courseInfo():String =
        "$courseName, $number_of_lecture, $students, $professor"
}
class Professor(var firstName:String, var lastName:String, var telephon:String,var course: List<String>){

    fun fullName() :String ="$firstName $lastName"

}
class Student(var firstName: String, var lastName: String, var course:List<String>){
    fun fullName():String= "$firstName $lastName"
}
