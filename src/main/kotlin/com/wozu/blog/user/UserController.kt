package com.wozu.blog.user

import org.springframework.web.bind.annotation.*

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("api/users")
class UserController(val userRepository: UserRepository) {

    //READ ALL USERS ---- ADMIN + PAID MEMBER + MEMBER
    @GetMapping
    fun getUsers() = userRepository.findAll()

    //READ USER BY ID ---- ADMIN + PAID MEMBER + MEMBER + VISITOR (some hidden behind login wall)
    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Long) = userRepository.findById(id)

    //CREATE USER ---- VISITOR
    @PostMapping
    fun addUser(@RequestBody user: Users) = userRepository.save(user)

    //UPDATE USER ---- ADMIN + PAID MEMBER + MEMBER
    @PutMapping("/{id}")
    fun editUser(@PathVariable id: Long, @RequestBody user: Users) {
        if(user.usersid == id)
            userRepository.save(user)
    }

    //DELETE USER ---- ADMIN + PAID MEMBER + MEMBER
    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: Long, @RequestBody user: Users){
        if(user.usersid == id)
            userRepository.deleteById(id)
    }
}
