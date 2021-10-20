import college

fun main() {

   var firstName = "Rakan"
    var lastName = "Mohammed"
   var  student1 =  studentNam(firstName,lastName)
   var student2 = studentNam("Abod","Ahmed")
    listOf<String>("math","physics","Chemical")
    var courses = college().course()
    var coursesAndStudent = mutableMapOf(student1[0]to courses[0], student1[1] to courses[1], student1[2] to courses[2], student1[3] to courses[3] )

    println(studentCourses())

}
public class Students {

    var firstName = "Rakan"
    var lastName = "Mohammed"
    var  student1 =  studentNam(firstName,lastName)
    var student2 = studentNam("Abod","Ahmed")
    var courses = college().course()
    var coursesAndStudent = mutableMapOf(student1[0]to courses[0], student1[1] to courses[1], student1[2] to courses[2], student1[3] to courses[3] )

    fun studentName (firstName: String, lastName: String, ){

        college().fullName(firstName,lastName)
        return
    }
}

fun studentName (firstName:String, lastName:String, ){

    college().fullName(firstName,lastName)
    return
}


fun studentCourses (): List <String> {

    return college().course()

}

fun studentNam(firstName:String,lastName:String):List<String>{
    var  studentFullName = "$firstName $lastName"
    var students0 = mutableListOf("$studentFullName","$lastName $firstName", "$firstName $firstName", "$lastName $lastName")
    return students0 }





