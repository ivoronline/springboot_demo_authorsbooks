package com.ivoronline.springboot_demo_authorsbooks.controllers;

import com.ivoronline.springboot_demo_authorsbooks.entities.Author;
import com.ivoronline.springboot_demo_authorsbooks.services.AuthorServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;

@Controller
public class AuthorController {

  //PROPERTIES
  @Autowired AuthorServiceInterface authorService;

  //======================================================================
  // ADD AUTHOR FORM
  //======================================================================
  @RequestMapping("AddAuthorForm")
  String addAuthorForm() {
    return "AddAuthorForm";
  }

  //======================================================================
  // ADD AUTHOR
  //======================================================================
  @ResponseBody
  @RequestMapping("AddAuthor")
  String addAuthor(
      @RequestParam String name,
      @RequestParam Integer age,
      @RequestParam Date birthday
  ) {

    //CREATE AUTHOR
    Author author = new Author();
           author.setName    (name);
           author.setAge     (age);
           author.setBirthday(birthday);

    //CALL SERVICE (BUSINESS LOGIC)
    String result = authorService.addAuthor(author);

    //RETURN
    return result;

  }

}
