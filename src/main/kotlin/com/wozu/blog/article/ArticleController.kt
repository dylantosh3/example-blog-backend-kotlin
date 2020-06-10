package com.wozu.blog.article

import org.springframework.web.bind.annotation.*

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("api/articles")
class ArticleController(val articleRepository: ArticleRepository) {

    @GetMapping
    fun getArticles() = articleRepository.findAll()

    @GetMapping("/{id}")
    fun getArticle(@PathVariable id: Long)
            = articleRepository.findById(id)

    @PostMapping
    fun addArticle(@RequestBody article: Article)
            = articleRepository.save(article)

    @PutMapping("/{id}")
    fun editArticle(@PathVariable id: Long, @RequestBody article: Article) {
        assert(article.id == id)
        articleRepository.save(article)
    }

    @DeleteMapping("/{id}")
    fun deleteArticle(@PathVariable id: Long)
            =  articleRepository.deleteById(id)

}