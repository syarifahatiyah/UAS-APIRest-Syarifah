package com.exa.api.entity

import java.util.HashSet
import java.util.Set
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.CascadeType
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table
import javax.validation.constraints.NotNull
import javax.persistence.Column

@Entity
@Table(name = "categories")
class Category {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 Integer id
 
 @NotNull8
 @Column(nullable = false)
 String name

 @OneToMany(mappedBy = "books", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public List<Books> getListBooks() {
        return listBooks
    }

}