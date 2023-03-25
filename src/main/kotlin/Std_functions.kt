val students = mutableListOf<Student>()
val subjects = listOf("Maths", "Science", "English")

fun addStudent() {
    print("Enter the name of the student: ")
    val name = readLine() ?: return

    print("Enter the roll number of the student: ")
    val rollNumber = readLine()?.toInt() ?: return

    val marks = mutableMapOf<String, Int>()
    for (subject in subjects) {
        print("Enter the marks for $subject: ")
        val marksForSubject = readLine()?.toInt() ?: return
        marks[subject] = marksForSubject
    }

    students.add(Student(name, rollNumber, marks))
    println("Student added successfully.")
}

