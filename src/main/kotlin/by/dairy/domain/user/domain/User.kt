package by.dairy.domain.user.domain

import by.dairy.domain.user.domain.enum.Gender
import jakarta.persistence.*
import java.util.UUID

@Entity(name = "user_tbl")
class User (

    @Id
    @Column(columnDefinition = "BINARY(16)", nullable = false, unique = true)
    val userId: UUID = UUID.randomUUID(),

    @Column(columnDefinition = "VACHAR(20)", nullable = false)
    val userName: String,

    @Column(columnDefinition = "VACHAR(50)", nullable = false, unique = true)
    val userEmail: String,

    @Column(columnDefinition = "VACHAR(30)", nullable = false)
    val userBirth: String,

    @Column(nullable = false)
    val userAge: Int,

    @Column(columnDefinition = "VACHAR(10)", nullable = false)
    @Enumerated(EnumType.STRING)
    val userGender: Gender,

    @Column(columnDefinition = "CHAR(300)", nullable = false)
    val userIntroduce: String,
)