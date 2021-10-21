class Student() {
    var firstName =""
    var lastName =""
    var courses = mutableListOf<String>()
    constructor( firstName: String,  lastName: String):this(){
        this.firstName=firstName
        this.lastName=lastName

    }
    fun fullName(firstName : String ,lastName :String): String {
        return "${firstName} \t ${lastName}"
    }
    fun addcourses (coursesName:String){
        courses.add(coursesName)
    }
    fun deleteSubject (coursesName:String){
        courses.remove(coursesName)
    }
}