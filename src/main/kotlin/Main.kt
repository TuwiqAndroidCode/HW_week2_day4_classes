import kotlin.random.Random

fun main(args: Array<String>) {

    // initialize the students, professors and courses

    val professor = Professors("Mohammed","Ahmed", listOf("Algorithms"),"055555555")        // add professor
    val student1 = Students("Ibrahim", "Alfaifi", listOf("Algorithms"))                             // add student
    val course = Courses( "Algorithms", "12", listOf("Ibrahim Alfaifi","Ahmed Alfaifi"), "Mohammed Ahmed")  // add professor
    val student2 = Students("Ahmed", "Alfaifi", listOf("Data Structure"))          // add another student





//---------------------------------------------------------------------------------//
                                            // using the course class //

    //check if this course has a teacher
    if (!course.assignProfessor(professor)){
        println("This professor is not teacher to this course")
        course.professor = professor.fullName()
    }else{
        println("This course has already a professor")
    }



    //check if this student has enrolled in this course
    if (!course.enroll(student1)){
        println("This student has not enrolled in this course")
        course.students = listOf(student1.fullName())
    }else{
        println("This student has already enrolled in this course")
    }




    //check if this student has enrolled in this course
    if (!course.enroll(student2)){
        println("This student has not enrolled in this course")
        course.students = listOf(student2.fullName())
    }else{
        println("This student has already enrolled in this course")
    }




    // print the number of students in a course
    println("Number of students in this course: ${course.numberOfStudents()}")

    // print the professor name for a course
    println("the professor for this course: ${course.professorName()}")

    // print the course info
    println("the course information: ${course.courseInfo()}")

    println("-------------------------------------------------------------")




//-----------------------------------------------------------------------------------//
                         // using student class //


    // print all students in this collage
    println("All students in this collage:\n 1- ${student1.fullName()} \n 2- ${student2.fullName()}")

    println("-------------------------------------------------------------")





//-----------------------------------------------------------------------------------//
                            // using professor class //


    // print all professors in this collage
    println("All professors in this collage:\n 1- ${professor.fullName()}")




}