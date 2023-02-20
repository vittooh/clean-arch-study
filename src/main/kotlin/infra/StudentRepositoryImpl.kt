package infra

import domain.student.Student
import domain.student.StudentRepository
//doing this way to not bother to add a jdbc and stuff, just to speed the study.
class StudentRepositoryImpl : StudentRepository {

    val students = mutableListOf<Student>()

    override fun save(student: Student) {
        students.add(student)
    }

    override fun lookup(documentNumber: String): Student? {
        return students.firstOrNull { it.documentNumber == documentNumber }
    }
}