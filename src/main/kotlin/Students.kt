class Students(var firstName: String, var lastName: String, var courses: List<String>) {

    fun fullName(): String{

        return "$firstName $lastName"
    }


}