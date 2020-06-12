package com.wozu.blog.comment

import com.wozu.blog.user.Users
import com.wozu.blog.article.Article
import javax.persistence.*

@Entity
data class Comments(
        var body: String,
                   @ManyToOne(cascade = arrayOf(CascadeType.ALL))
                   var article: Article = Article(),
                   @ManyToOne(cascade = arrayOf(CascadeType.ALL))
                   var author: Users = Users(),
                   @Id @GeneratedValue(strategy = GenerationType.AUTO)
                   var id: Long = 0
)

