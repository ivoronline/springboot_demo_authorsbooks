package com.ivoronline.springboot_demo_authorsbooks.repositories;

import com.ivoronline.springboot_demo_authorsbooks.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Integer> {
}

