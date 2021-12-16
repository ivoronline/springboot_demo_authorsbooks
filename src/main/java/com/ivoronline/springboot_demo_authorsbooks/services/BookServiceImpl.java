package com.ivoronline.springboot_demo_authorsbooks.services;

import com.ivoronline.springboot_demo_authorsbooks.entities.Book;
import com.ivoronline.springboot_demo_authorsbooks.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookServiceInterface {

  //PROPERTIES
  @Autowired BookRepository bookRepository;

  //======================================================================
  // ADD BOOK
  //======================================================================
  public String addBook(Book book) {

    //STORE AUTHOR (BUSINESS LOGIC)
    bookRepository.save(book);

    //RETURN
    return "Book added to DB";

  }

}
