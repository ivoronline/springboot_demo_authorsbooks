package com.ivoronline.springboot_demo_authorsbooks.services;

import com.ivoronline.springboot_demo_authorsbooks.entities.Author;

public interface ComboServiceInterface {
  String getBooks(Author author);
}
