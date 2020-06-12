package com.wozu.blog.user

import com.wozu.blog.comment.Comments
import javax.persistence.*

@Entity
data class Users(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0,
        var firstName: String = "",
        var lastName: String = "",
        var userName: String = "",
        var email: String = ""
        )
