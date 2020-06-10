package com.wozu.blog.article

import javax.persistence.*

@Entity
class Article(
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = 0,
        var slug: String = "",
        var title: String = "",
        var description: String = "",
        var body: String = ""
        )
        /*@ManyToMany
        val tagList: MutableList<Tag> = mutableListOf(),
        var createdAt: OffsetDateTime = OffsetDateTime.now(),
        var updatedAt: OffsetDateTime = OffsetDateTime.now(),
        @ManyToMany
        var favorited: MutableList<Users> = mutableListOf(),
        @ManyToOne
        var author: User = Users,
        {fun favoritesCount() = favorited.size}
         */