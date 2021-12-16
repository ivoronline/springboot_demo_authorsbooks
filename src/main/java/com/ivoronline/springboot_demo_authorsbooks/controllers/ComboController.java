package com.ivoronline.springboot_demo_authorsbooks.controllers;

import com.ivoronline.springboot_demo_authorsbooks.entities.Author;
import com.ivoronline.springboot_demo_authorsbooks.entities.Book;
import com.ivoronline.springboot_demo_authorsbooks.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;
import java.util.Set;

@Controller
public class ComboController {

  //PROPERTIES
  @Autowired AuthorRepository authorRepository;

  //======================================================================
  // GET BOOKS FORM
  //======================================================================
  @RequestMapping("GetBooksForm")
  String getBooksForm() {
    return "GetBooksForm";
  }

  //======================================================================
  // GET BOOKS
  //======================================================================
  @ResponseBody
  @RequestMapping("GetBooks")
  String getBooks(@RequestParam Integer authorId) {

    //GET AUTHOR & BOOKS
    Optional<Author> authorOptional = authorRepository.findById(authorId);
    Author           author         = authorOptional.get();
    Set<Book>        books          = author.getBooks();

    //DISPLAY BOOKS
    String result = "<h2> Books by " + author.getName() + "</h2>";
    for(Book book : books) {
      result += book.getTitle() + "<br>";
    }

    //RETURN
    return result;

  }

}
