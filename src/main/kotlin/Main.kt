fun main(args: Array<String>) {


    //12 students
    var Renad=student("Renad","Ali")
    var Roa=student("Roa","Ali")
    var Ali=student("Ali","khalid")
    var Khalid=student("Khalid","mohamed")
    var maha=student("maha","Abdullah")
    var joury=student("joury","mohamed")
    var asma=student("asma","Alharbi")
    var nawal=student("nawal","abdullah")
    var lolo=student("lolo","alharbi")
    var lama=student("lama","saud")
    var Abdullah=student("Abdullah","alharbi")





    var Arabic=course("Arabic",20)
    Arabic.enroll(Roa)
    Arabic.enroll(Renad)
    Arabic.enroll(Abdullah)

    var english=course("english",10)
    english.enroll(lolo)
    english.enroll(Renad)
    english.enroll(joury)

    var Ahmed=professor("Ahmed","Ali",56)
    english.assignProfessor(Ahmed)
    Arabic.assignProfessor(Ahmed)

    println(english.courseInfo())
    println(Ahmed.fullName())
    println(Renad.fullName())




}

class professor(var firsName:String,var lastName:String,var telephone:Int){


    //To avoid repeating the courses, I chose set
    var courses=mutableSetOf<String>()


    //fun to add courses to the professor
    fun setCourses(value:String){
        courses.add(value)
    }

    fun fullName():String{
        return "Professor name:$firsName $lastName  The courses $firsName is teaching $courses"
    }

}
class student(var firsName:String,var lastName:String){



    //To avoid repeating the courses, I chose set
    var courses=mutableSetOf<String>()


    //fun to add courses to the student,
//First, I check whether the student is enrolled.
// If the student is enrolled, the course will be added, if not the course will not be added.
    fun setCourses(value:String, x:Boolean ){
        if(x.equals(true)){
            courses.add(value)}

    }

    fun fullName():String{
        return "student name:$firsName $lastName ,Course $courses"
    }

}












class course(var _courseName:String, var _number_of_lectures:Int){
    var professor=mutableMapOf<String, String>()
    var students =mutableListOf<String>()


    fun enroll(s:student):Boolean{
        if(students.size!=20){
            students.add(s.firsName)
            s.setCourses(_courseName,true)
        }else println("The course is filled")
        return students.contains(s.firsName)
    }


    fun numberOfStudents():Int{
        return students.size
    }
    fun assignProfessor( p:professor):Boolean{
        professor=mutableMapOf(_courseName to p.firsName)
        p.setCourses(_courseName)
        return professor[_courseName]==p.firsName
    }

    fun professorName():String{
        return "professor name $professor "
    }


    fun courseInfo():String{
        return "course name:$_courseName, NO. of lecture:$_number_of_lectures students:$students professor of course:${professor[_courseName]}"
    }



}