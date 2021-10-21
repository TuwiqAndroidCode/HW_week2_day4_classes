class Professors (var firstName: String, var lastName: String,
                  var courses: List<String>, var telephone: String){


    fun fullName(): String{

        return "$firstName $lastName"
    }

}