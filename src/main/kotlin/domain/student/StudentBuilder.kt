package domain.student

class StudentBuilder {
    private lateinit var student : Student

    fun buildStudent(name : String, documentNumber : String, mail : String): StudentBuilder {
        student = Student(name,documentNumber, Email(mail))
        return this
    }

    fun addPhone(areaCode : String, phoneNumber : String): StudentBuilder {
        student.addPhone(Phone(areaCode,phoneNumber))
        return this;
    }

    fun build(): Student {
        return student
    }
}