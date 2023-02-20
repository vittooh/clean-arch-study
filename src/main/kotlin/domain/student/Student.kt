package domain.student

class Student(
    var name: String,
    var documentNumber: String,
    var email: Email
){

    private var phones : MutableList<Phone> = mutableListOf()

    fun addPhone(phone: Phone){
        phones.add(phone)
    }

    fun getPhones() : MutableList<Phone>{
        return phones
    }
}