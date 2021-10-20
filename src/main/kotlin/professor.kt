import college
import Students
class professor {

    var professorName= professorNam("p.Husain","Zamle")

    var courses = college().course()
    var coursesN= college().course()

    var coursesAndProf = mutableMapOf(professorName[0]to courses[0], professorName[1] to courses[1], professorName[2] to courses[2], professorName[3] to courses[3] )

    var phoneNumber = " 0545xxxxxxxx"
    fun professorNamFull(firstName:String,lastName:String){
        var  professorFullName = "$firstName $lastName"}
}

fun main() {

   var professorName= professorNam("p.Husain","Zamle")
    var courses = college().course()


    var coursesAndProf = mutableMapOf(professorName[0]to courses[0], professorName[1] to courses[1], professorName[2] to courses[2], professorName[3] to courses[3] )

    println(coursesAndProf)
    var phoneNumber = " 0545xxxxxxxx"
}


fun professorNam(firstName:String,lastName:String):List<String>{
  var  professorFullName = "$firstName $lastName"
    var professors = mutableListOf("$professorFullName","$lastName $firstName", "$firstName $firstName", "$lastName $lastName")
    return professors
}
fun professorNamFull(firstName:String,lastName:String){
    var  professorFullName = "$firstName $lastName"}