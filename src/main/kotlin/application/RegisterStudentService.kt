package application

import domain.student.StudentBuilder
import domain.student.StudentRepository

class RegisterStudentService(
    private val studentRepository: StudentRepository,
    private val studentBuilder: StudentBuilder
) {

    fun registerStudent(name: String, documentNumber: String, email: String, areaCode: String, phoneNumber: String) {
        println("start process to save student")
        val student = studentBuilder.buildStudent(
            name, documentNumber, email
        ).addPhone(areaCode, phoneNumber).build()

        studentRepository.save(student)

        println("student was saved")
    }
}