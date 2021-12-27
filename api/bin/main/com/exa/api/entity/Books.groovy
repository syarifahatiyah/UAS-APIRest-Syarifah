package com.exa.api.entity


import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Table
// import javax.persistence.JoinTable
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.validation.constraints.NotNull
import javax.persistence.Column

@Entity
@Table(name = "books")
class Books {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 Integer Id

 @NotNull
 @Column(nullable = false)
 Integer id_category
 
 @ManyToOne 
//  @JoinColumn(name="id_category")
//  private final Category categories
    @JoinColumn(name = "id_category", referencedColumnName = "id")
    public Category getCategories() {
        return categories
    }
 
 @NotNull
 @Column(nullable = false)
 String name_books

 @NotNull
 @Column(nullable = false)
 String isbn


}