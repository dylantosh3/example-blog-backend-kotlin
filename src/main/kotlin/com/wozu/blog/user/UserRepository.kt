package com.wozu.blog.user

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<Users, Long>