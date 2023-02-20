import domain.student.StudentBuilder

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")



    var studentFactory = StudentBuilder()
    studentFactory.buildStudent("vitor","17","mail@mail.com")
}