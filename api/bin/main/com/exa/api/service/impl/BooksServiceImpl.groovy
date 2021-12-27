package com.exa.api.service.impl
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import com.exa.api.entity.Books
import com.exa.api.repository.BooksRepository
import com.exa.api.service.BooksService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BooksServiceImpl implements BooksService {
 @Autowired
 private final BooksRepository BooksRepository
 @Override
 List<Books> findAll() {
 BooksRepository.findAll()
 }
}