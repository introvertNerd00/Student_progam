val students = mutableListOf<Student>()
val subjects = listOf("Calculus", "DSA", "COAL")

fun addStudent() {
    print("Enter the name of the student: ")
    val name = readln()

    print("Enter the roll number of the student: ")
    val rollNumber = readln().toInt()

    val marks = mutableMapOf<String, Int>()
    for (subject in subjects) {
        print("Enter the marks for $subject: ")
        val marksForSubject = readln().toInt()
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



