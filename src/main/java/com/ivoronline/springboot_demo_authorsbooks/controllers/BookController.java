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

  //PROPERTIES
  @Autowired BookRepository bookRepository;

  //======================================================================
  // ADD BOOK FORM
  //======================================================================
  @RequestMapping("AddBookForm")
  String addBookForm() {
    return "AddBookForm";
  }

  //======================================================================
  // ADD BOOK
  //======================================================================
  @ResponseBody
  @RequestMapping("AddBook")
  String addBook(
      @RequestParam String title,
      @RequestParam Integer authorId

  ) {

    //CREATE BOOK
    Book book = new Book();
         book.setTitle(title);
         book.setAuthorId(authorId);

    //STORE BOOK
    bookRepository.save(book);

    //RETURN
    return "Book added to DB";

  }

}
