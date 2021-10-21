public class college {

    fun fullName(firstName:String,lastName:String ) = "$firstName $lastName"
    fun course (  ): List<String>  {
        val listOFCourses = mutableListOf<String>("ComputerScience")
        listOFCourses.addAll(listOf<String>("dataBases","softwareEngineering","Networks"))
        return listOFCourses
    }
         var courseName = ""

}
         fun main() {
             println(course())
}