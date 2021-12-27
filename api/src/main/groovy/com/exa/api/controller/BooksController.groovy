package com.exa.api.controller
import com.exa.api.entity.Books
import com.exa.api.service.BooksService
import org.springframework.web.bind.annotation.*
import org.springframework.beans.factory.annotation.Autowired

@RestController
@RequestMapping('/books')
class BooksController {
 @Autowired
 private final BooksService booksService
 @GetMapping('')
 List<Books> findAll() {
 booksService.findAll()
 }
}