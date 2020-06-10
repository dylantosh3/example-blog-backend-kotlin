package com.wozu.blog.comment

import javax.persistence.*

@Entity
class Comment(     //var createdAt: OffsetDateTime = OffsetDateTime.now(),
                   //var updatedAt: OffsetDateTime = OffsetDateTime.now(),
                   var body: String,
                   var article: Long,
                   var author: String,
//                   @ManyToOne
//                   var article: Article = Article(),
//                   @ManyToOne
//                   var author: User = User(),
                   @Id @GeneratedValue(strategy = GenerationType.AUTO)
                   var id: Long = 0)
