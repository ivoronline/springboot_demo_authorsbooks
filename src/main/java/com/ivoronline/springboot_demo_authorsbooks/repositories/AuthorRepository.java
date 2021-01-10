package com.ivoronline.springboot_demo_authorsbooks.repositories;

import com.ivoronline.springboot_demo_authorsbooks.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> {
}
