package com.wozu.blog.article

import javax.persistence.*

@Entity
@Table(name="articles")
data class Articles (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var articlesid: Long = 0,
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var usersid: Long = 0,
        var title: String = "",
        var author: String = "",
        var description: String = "",
        var body: String = ""
        //var createdAt: OffsetDateTime = OffsetDateTime.now(),
)


