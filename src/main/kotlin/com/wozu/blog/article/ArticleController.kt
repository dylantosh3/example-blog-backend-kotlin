package com.wozu.blog.article

import org.springframework.web.bind.annotation.*

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("api/articles")
class ArticleController(val articleRepository: ArticleRepository) {

    //READ ALL ARTICLES ---- ADMIN + PAID MEMBER
    @GetMapping
    fun getArticles() = articleRepository.findAll()

    //READ ARTICLE BY ID ---- ADMIN + PAID MEMBER + MEMBER + VISITOR (some hidden behind login wall)
    @GetMapping("/{id}")
    fun getArticle(@PathVariable id: Long) = articleRepository.findById(id)

    //CREATE ARTICLE ---- ADMIN + PAID MEMBER + MEMBER
    @PostMapping
    fun addArticle(@RequestBody articles: Articles) = articleRepository.save(articles)

    //UPDATE ARTICLE BY ID ---- ADMIN + PAID MEMBER + MEMBER
    @PutMapping("/{id}")
    fun editArticle(@PathVariable id: Long, @RequestBody articles: Articles) {
        if(articles.articlesid == id)
            articleRepository.save(articles)
    }

    //DELETE ARTICLE BY ID ---- ADMIN + PAID MEMBER + MEMBER
    @DeleteMapping("/{id}")
    fun deleteArticle(@PathVariable id: Long, @RequestBody articles: Articles){
        if(articles.articlesid == id)
            articleRepository.deleteById(id)
    }
}
