package com.wozu.blog.comment

import com.wozu.blog.user.Users
import com.wozu.blog.article.Article
import javax.persistence.*

@Entity
data class Comment(     var body: String,
                   @ManyToOne(fetch = FetchType.EAGER)
                   @JoinColumn(name = "article_id")
                   var article: Article = Article(),
                   @ManyToOne(fetch = FetchType.EAGER)
                   @JoinColumn(name = "users_id")
                   var author: Users = Users(),
                   @Id @GeneratedValue(strategy = GenerationType.AUTO)
                   var id: Long = 0
)

