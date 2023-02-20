package domain.student

interface PasswordCrypt {

    fun crypt(password : String): String

    fun matchPassword(password : String, passwordCrypt: String): Boolean
}