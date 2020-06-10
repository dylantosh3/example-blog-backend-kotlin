package com.wozu.blog.comment

import org.springframework.web.bind.annotation.*


@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("api/comment")
class CommentController(val commentRepository: CommentRepository) {

    @GetMapping
    fun getComment() = commentRepository.findAll()

    @GetMapping("/{id}")
    fun getComment(@PathVariable id: Long)
            = commentRepository.findById(id)

    @PostMapping
    fun addComment(@RequestBody comment: Comment)
            = commentRepository.save(comment)

    @PutMapping("/{id}")
    fun editComment(@PathVariable id: Long, @RequestBody comment: Comment) {
        assert(comment.id == id)
        commentRepository.save(comment)
    }

    @DeleteMapping("/{id}")
    fun deleteComment(@PathVariable id: Long)
            =  commentRepository.deleteById(id)

}
