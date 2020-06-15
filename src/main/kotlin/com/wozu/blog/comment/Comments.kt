package com.wozu.blog.comment

import com.wozu.blog.article.Articles
import com.wozu.blog.user.Users
import javax.persistence.*
import java.time.OffsetDateTime

@Entity
@Table(name="comments")
data class Comments(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var commentsid: Long = 0,
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var articlesid: Long = 0,
        var commenter: String = "",
        var body: String = "",
        //var createdAt: OffsetDateTime = OffsetDateTime.now(),
        var updatedAt: OffsetDateTime = OffsetDateTime.now()
)
