package com.wozu.blog.comment

import com.wozu.blog.article.Articles
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface CommentRepository : JpaRepository<Comments, Long> {
}
