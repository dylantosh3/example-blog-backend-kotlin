package com.wozu.blog.user

import javax.persistence.*

@Entity
@Table(name="users")
data class Users(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0,
        var firstname: String = "",
        var lastname: String = "",
        var username: String = "",
        var email: String = ""
)
