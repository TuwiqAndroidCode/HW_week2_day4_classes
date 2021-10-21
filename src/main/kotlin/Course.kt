import professor
class Course {

    var coursesNames= college().course()
    var numberofLectures = professor().professorName.size
    var numberOfStudents = 2
}
fun main() {
    var coursesNames= college().course()
    var numberofLectures = professor().professorName.size
    var numberOfStudents = 2
    println(profLecture())
    professor().coursesAndProf
    profLecture() // professors to lecs boolean
    profStudents() // students to lec boolean
    courseInfo()
}

fun profLecture ():String {
    var try1 = professor().professorNamFull("Hatem","Azhary").toString()
    var try2 = professor().coursesAndProf.keys.toString()
    return if( try1 == try2){
        "go to our lectures"
    }else " check our class"

}

fun profStudents ():String{
    var try1 = Students().student1.toString()
    var try2= Students().coursesAndStudent.keys.toString()
    return if (try1 == try2 ){
        "go to class kids"
    }else " check our class"
}
fun courseInfo (){
    var numOfLectures=  Course().numberofLectures
    var numOfStudents= Students().student1.size
    var numOfProfessors = professor().professorName.size
    var coursesNames= college().course()
    println("lecs num:$numOfLectures, Students num: $numOfStudents, Profs nun: $numOfProfessors, name of courses: $coursesNames  ")
}