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

fun display() {
    println("|-------------------------------------|")
    println("|  Data of the Students in the list:  |")
    println("|-------------------------------------|")
    students.forEach { student ->
        println("Name: ${student.name}")
        println("Roll Number: ${student.rollNumber}")
        println("Marks:")
        student.marks.forEach { (subject, marks) ->
            println("$subject: $marks")
        }
        println()
    }
}