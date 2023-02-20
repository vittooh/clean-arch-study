package domain.student

interface StudentRepository {

    fun save(student: Student)

    fun lookup(documentNumber : String): Student?
}