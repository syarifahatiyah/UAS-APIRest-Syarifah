package com.exa.api.service
import com.exa.api.entity.Books

interface BooksService {
 List<Books> findAll()
}