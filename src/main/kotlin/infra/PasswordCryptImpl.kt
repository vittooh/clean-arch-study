package infra

import domain.student.PasswordCrypt

class PasswordCryptImpl : PasswordCrypt {
    override fun crypt(password: String): String {
        return password.reversed()
    }

    override fun matchPassword(password: String, passwordCrypt: String): Boolean {
        return crypt(password).equals(passwordCrypt)
    }
}