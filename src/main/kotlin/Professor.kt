class Professor( ) {

   var firstName =""
   var lastName =""
   var telephone=""
    var courses = mutableListOf<String>()
    constructor(firstName: String, lastName: String, telephone: String): this() {
        this.firstName = firstName
        this.lastName = lastName
        this.telephone = telephone
    }
    fun fullName(firstName : String ,lastName :String): String {
        return "${firstName} \t ${lastName}"
    }

}