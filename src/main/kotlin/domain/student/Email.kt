package domain.student

import java.lang.Exception

class Email(
    var email: String
) {

    init {
       if(!validateEmail(email)) throw Exception("invalid mail")
    }

    fun validateEmail(email: String): Boolean {
        return email.isNotEmpty() && email.contains("@")
    }
}
