package com.wozu.blog.comment

import org.springframework.web.bind.annotation.*


@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("api/comment")
class CommentController(val commentRepository: CommentRepository) {

    @GetMapping
    fun getComments() = commentRepository.findAll()

    @GetMapping("/{id}")
    fun getComments(@PathVariable id: Long)
            = commentRepository.findById(id)

    @PostMapping
    fun addComments(@RequestBody comments: Comments)
            = commentRepository.save(comments)

    @PutMapping("/{id}")
    fun editComments(@PathVariable id: Long, @RequestBody comments: Comments) {
        assert(comments.id == id)
        commentRepository.save(comments)
    }

    @DeleteMapping("/{id}")
    fun deleteComments(@PathVariable id: Long)
            =  commentRepository.deleteById(id)

}
