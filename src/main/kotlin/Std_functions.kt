//mutable list of students to add multiple records of students and also perform
val students = mutableListOf<Student>()

fun addStudent() {
    print("Enter the name of the student: ")
    val name = readln()

    print("Enter the roll number of the student: ")
    val rollNumber = readln().toInt()

    print("Enter the marks of student: ")
    val marks = readln().toInt()

    students.add(Student(name, rollNumber, marks))
    println("Student added successfully.")
}

fun displayData() {
    println("|-------------------------------------|")
    println("|  Data of the Students in the list:  |")
    println("|-------------------------------------|")
    students.forEach { student ->
        println("Name: ${student.name}")
        println("Roll Number: ${student.rollNumber}")
        println("Marks: ${student.marks}")

        println()
    }
}


fun searchStudent() {
    print("Enter the roll number of the student you want to search for: ")
    val rollNumber = readln().toInt()

    // Find the student with the given roll number
    val student = students.find { it.rollNumber == rollNumber }

    if (student == null) {
        println("Student with roll number $rollNumber not found.")
    } else {
        println("Name: ${student.name}")
        println("Roll Number: ${student.rollNumber}")
        println("Marks: ${student.marks}")

    }
}

fun deleteStudent() {
    print("Enter the roll number of the student you want to delete: ")
    val rollNumber = readln().toInt()

    val student = students.find { it.rollNumber == rollNumber }
    if (student == null) {
        println("Student with roll number $rollNumber not found.")
    } else {
        students.remove(student)
        println("Student deleted successfully.")
    }
}

fun insertData() {
    print("Enter the roll number of the student you want to modify data for: ")
    val rollNumber = readLine()?.toInt() ?: return

    // Find the student with the given roll number
    val student = students.find { it.rollNumber == rollNumber }

    if (student == null) {
        println("Student with roll number $rollNumber not found.")
    } else {
        println("What data do you want to modify?")
        println("1. Name")
        println("2. Roll Number")
        println("3. Marks")

        print("Enter your choice: ")
        val choice = readLine()?.toIntOrNull() ?: return

        when (choice) {
            1 -> {
                print("Enter the new name: ")
                val newName = readLine() ?: return
                student.name = newName
                println("Name updated successfully.")
            }
            2 -> {
                print("Enter the new roll number: ")
                val newRollNumber = readLine()?.toInt() ?: return
                student.rollNumber = newRollNumber
                println("Roll number updated successfully.")
            }
            3 -> {

                print("Enter the new marks : ")
                val newMarks = readlnOrNull()?.toInt() ?: return
                student.marks = newMarks
                println("Marks updated successfully.")
            }
            else -> println("Invalid choice.")
        }
    }
}


fun sortData(){

  students.sortBy{it.marks}
  
}


