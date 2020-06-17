package com.wozu.blog.comment

import javax.persistence.*

@Entity
@Table(name="comments")
data class Comments(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long = 0,
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var articlesid: Long = 0,
        var commenter: String = "",
        var body: String = ""
)
