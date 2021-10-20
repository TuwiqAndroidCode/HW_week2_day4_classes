
public class college {

    fun fullName(firstName:String,lastName:String ) = "$firstName $lastName"
    fun course (  ): List<String>  {
        val listOFCourses = mutableListOf<String>("Biology")
        listOFCourses.addAll(listOf<String>("math","physics","Chemical"))
        return listOFCourses
    }
    var courseName = ""

}


fun main() {
    println(course())
}

