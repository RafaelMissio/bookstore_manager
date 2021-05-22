package com.mtisi.bookstoremanager.repository;

import com.mtisi.bookstoremanager.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
