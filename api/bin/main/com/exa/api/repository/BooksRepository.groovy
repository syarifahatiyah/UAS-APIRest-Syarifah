package com.exa.api.repository
import com.exa.api.entity.Books
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BooksRepository extends JpaRepository<Books, Integer> {
 List<Books> findAll()
}