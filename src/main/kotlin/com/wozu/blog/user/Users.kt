package com.wozu.blog.user

import com.wozu.blog.comment.Comment
import javax.persistence.*

@Entity
data class Users(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0,
        @OneToMany(mappedBy = "author", cascade= [CascadeType.ALL], fetch = FetchType.EAGER)
        var comment: List<Comment> = emptyList(),
        var firstName: String = "",
        var lastName: String = "",
        var userName: String = "",
        var email: String = ""
        )
