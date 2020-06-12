package com.wozu.blog.article

import com.wozu.blog.comment.Comment
import javax.persistence.*

@Entity
data class Article (
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0,
        var slug: String = "",
        var title: String = "",
        var description: String = "",
        var body: String = ""
        )


