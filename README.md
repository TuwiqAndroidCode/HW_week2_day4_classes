# HW week2 day4 classes

The Home Work has one part to be delievered before 9AM: 

----
## Part I
Create a simple system for College. Create classes for Course, Professor and Student. Course can have only one professor and students

### Course
Attributes: CourseName, number_of_lectures, students, professor.<br />
Methods:<br />
int numberOfStudents()<br />
boolean assignProfessor(Professor p) // assign professor to course. Course can have only one professor.<br />
string professorName() // return professor full name<br />
boolean enroll(Student s) // assign student to this course. Student can’t be enrolled to a course if the course has 20 studens <br />
string courseInfo() // return the course name number of lectures professor and students<br />
<br />
### Professor <br />
Attributes: firstName, lastName, telephone,  courses. <br />
Methods: String fullName() // return “firstName lastName”<br />
<br />
### Student<br />
Attributes: firstName, lastName, courses.<br />
Methods: String fullName() // return “firstName lastName”<br />

