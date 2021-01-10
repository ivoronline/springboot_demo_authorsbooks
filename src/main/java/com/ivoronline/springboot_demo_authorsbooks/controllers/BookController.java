package com.ivoronline.springboot_demo_authorsbooks.controllers;

import com.ivoronline.springboot_demo_authorsbooks.entities.Book;
import com.ivoronline.springboot_demo_authorsbooks.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {

  //======================================================================
  // REPOSITORIES
  //======================================================================
  @Autowired BookRepository bookRepository;

  //======================================================================
  // METHOD: ADD BOOK FORM
  //======================================================================
  @RequestMapping("/AddBookForm")
  public String addBookForm() {
    return "AddBookForm";
  }

  //======================================================================
  // METHOD: ADD BOOK
  //======================================================================
  @ResponseBody
  @RequestMapping("/AddBook")
  public String addBook(@RequestParam String title) {

    //CREATE BOOK
    Book book = new Book();
    book.setTitle(title);

    //STORE BOOK
    bookRepository.save(book);

    //RETURN
    return "Book added to DB";

  }

}
