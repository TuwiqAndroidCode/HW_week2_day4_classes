fun main(args: Array<String>) {

    }
    class Course(){
        var courseName=""
        var courseNameList= mutableSetOf<String>()
        var studentName=""
        var courceInfoMap= mutableMapOf<String,String>()
        var numberOfLectures= mutableListOf<String>("First","Second","Third")
        var students= mutableListOf<String>()
        var professorName=""
        var professorList= mutableListOf<String>()
        fun addStudent(studentName:String) {
            students.add(studentName)
        }
        fun numberOfStudent(): Int {
            return students.size
        }
        fun assignProfessor(){
            if(professorName !in courceInfoMap)
                courceInfoMap.put(professorName,courseName)
            else
                "this professor has course"

        }
        fun addCourse(){
            courseNameList.add(courseName)
        }
        fun professorName(){
            professorList.add(professorName)
        }
        fun enroll(){
            if(students.size>=20) {
                courseNameList.remove(studentName)
            }else{
                "you cant,number of Student less than 20"
            }
        }
        fun addCourseInfo(){
            courceInfoMap.put(professorName, courseName.toString())
        }

    }
    class Professor() {
        var firstName =""
        var lastName = ""
        var fullName=""
            get(){
                field="$firstName $lastName"
                return field
            }
        var telephone = ""
        var courses = mutableSetOf<String>()
        var professorlist= mutableListOf<String>()

        fun professorFullName (full:String) {
            professorlist.add(full)
        }
    }

    class Student() {
        var studentList= mutableListOf<String>()
        var firstName = ""
        var lastName = ""
        var fullName=""
            get() {
                field="$firstName $lastName"
                return field
            }
        var courses = ""
        fun studentFullName(fullName: String) {
            studentList.add(fullName)
        }
    }


}