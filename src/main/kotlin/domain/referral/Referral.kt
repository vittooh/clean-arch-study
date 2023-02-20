package domain.referral

import domain.student.Student
import java.time.LocalDateTime

class Referral (
    var indicated: Student,
    var referenced : Student,
    var referralDate: LocalDateTime = LocalDateTime.now()
)