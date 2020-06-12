package com.wozu.blog.user

import org.springframework.web.bind.annotation.*


@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("api/users")
class UserController(val userRepository: UserRepository) {

    @GetMapping
    fun getUsers() = userRepository.findAll()

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Long)
            = userRepository.findById(id)

    @PostMapping
    fun addUser(@RequestBody user: Users)
            = userRepository.save(user)

    @PutMapping("/{id}")
    fun editUser(@PathVariable id: Long, @RequestBody user: Users) {
        assert(user.id == id)
        userRepository.save(user)
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: Long)
            =  userRepository.deleteById(id)

}
