

fun main() {
    while (true) {
        println("Menu:")
        println("1. Add Student")
        println("2. Delete Student")
        println("3. Search")
        println("4. Sort")
        println("5. Display Data")
        println("6. Insert Data")
        print("Enter your choice: ")
        val choice = readLine()?.toIntOrNull() ?: continue
        
        when (choice) {
            1 -> addStudent()
            2 -> deleteStudent()
            3 -> searchStudent()
            4 -> sortData()
            5 -> displayData()
            6 -> insertData()
            else -> println("Invalid choice.")
        }
    }
}

