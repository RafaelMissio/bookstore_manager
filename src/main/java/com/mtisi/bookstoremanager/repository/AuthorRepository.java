package com.mtisi.bookstoremanager.repository;

import com.mtisi.bookstoremanager.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
