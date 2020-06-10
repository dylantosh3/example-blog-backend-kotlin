package com.wozu.blog.user

import javax.persistence.*

@Entity
class Users(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0,
        var firstName: String,
        var lastName: String,
        var userName: String,
        var email: String
)