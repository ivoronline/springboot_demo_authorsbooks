package com.ivoronline.springboot_demo_authorsbooks.controllers;

import com.ivoronline.springboot_demo_authorsbooks.entities.Author;
import com.ivoronline.springboot_demo_authorsbooks.services.ComboServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ComboController {

  //PROPERTIES
  @Autowired ComboServiceInterface comboService;

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

    //CREATE AUTHOR
    Author author = new Author();
           author.setId(authorId);

    //CALL SERVICE (BUSINESS LOGIC)
    String result = comboService.getBooks(author);

    //RETURN
    return result;

  }

}
