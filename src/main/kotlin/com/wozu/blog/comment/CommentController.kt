package com.wozu.blog.comment

import org.springframework.web.bind.annotation.*

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("api/comments")
class CommentController(val commentRepository: CommentRepository) {

    //READ ALL COMMENTS ON ARTICLE ---- EVERYONE
    @GetMapping
    fun getComments() = commentRepository.findAll()

    //READ 1 COMMENT IN ARTICLE ---- EVERYONE
    @GetMapping("/{id}")
    fun getComment(@PathVariable id: Long) = commentRepository.findById(id)

    //CREATE 1 COMMENT ---- EVERYONE
    @PostMapping
    fun addCommentToArticle(@RequestBody comment: Comments) = commentRepository.save(comment)

    //UPDATE 1 COMMENT ---- EVERYONE EXCEPT VISITOR
    @PutMapping("/{id}")
    fun editArticleComment(@PathVariable id: Long, @RequestBody comments: Comments){
        if(comments.id == id)
            commentRepository.save(comments)
    }

    //DELETE 1 COMMENT ---- EVERYONE EXCEPT VISITOR
    @DeleteMapping("/{id}")
    fun deleteComment(@PathVariable id: Long) = commentRepository.deleteById(id)

}
