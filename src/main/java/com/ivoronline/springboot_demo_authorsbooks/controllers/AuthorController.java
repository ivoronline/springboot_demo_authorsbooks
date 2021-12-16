package com.ivoronline.springboot_demo_authorsbooks.controllers;

import com.ivoronline.springboot_demo_authorsbooks.entities.Author;
import com.ivoronline.springboot_demo_authorsbooks.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;

@Controller
public class AuthorController {

  //PROPERTIES
  @Autowired AuthorRepository authorRepository;

  //======================================================================
  // METHOD: ADD AUTHOR FORM
  //======================================================================
  @RequestMapping("AddAuthorForm")
  String addAuthorForm() {
    return "AddAuthorForm";
  }

  //======================================================================
  // METHOD: ADD AUTHOR
  //======================================================================
  @ResponseBody
  @RequestMapping("AddAuthor")
  String addAuthor(
      @RequestParam String  name,
      @RequestParam Integer age,
      @RequestParam Date    birthday
  ) {

    //CREATE AUTHOR
    Author author = new Author();
           author.setName    (name);
           author.setAge     (age);
           author.setBirthday(birthday);

    //STORE AUTHOR
    authorRepository.save(author);

    //RETURN
    return "Author added under ID: " + author.getId();

  }

}
