package com.howto.demouser.repository;

import com.howto.demouser.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// JpaRepository<EntityType, PrimaryKeyType>
public interface BookRepository extends JpaRepository<Book, Long> {
    // Spring Data JPA automatically provides CRUD methods (save, findById, findAll, etc.)
    // No code implementation is needed here.
}