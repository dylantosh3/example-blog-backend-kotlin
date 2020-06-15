package com.wozu.blog.article

import org.springframework.data.jpa.repository.JpaRepository

interface ArticleRepository : JpaRepository<Articles, Long>
