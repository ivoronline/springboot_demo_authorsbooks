package com.ivoronline.springboot_demo_authorsbooks.services;

import com.ivoronline.springboot_demo_authorsbooks.DTO.AuthorBookDTO;
import com.ivoronline.springboot_demo_authorsbooks.entities.Author;
import com.ivoronline.springboot_demo_authorsbooks.entities.Book;
import com.ivoronline.springboot_demo_authorsbooks.repositories.AuthorRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class AuthorBookServiceImpl implements AuthorBookServiceInterface {

  //PROPERTIES
  @Autowired AuthorRepository authorRepository;

  //======================================================================
  // ADD AUTHOR BOOK
  //======================================================================
  @Override
  public AuthorBookDTO addAuthorBook(AuthorBookDTO authorBookDTO) {

    //INSTANTIATE MODEL MAPPER
    ModelMapper modelMapper = new ModelMapper();
                modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

    //CONVERT DTO TO ENTITIES
    Book   book   = modelMapper.map(authorBookDTO, Book  .class);
    Author author = modelMapper.map(authorBookDTO, Author.class);

    //ADD BOOK TO AUTHOR
    author.setBooks(new HashSet<>());
    author.getBooks().add(book);

    //SAVE AUTHOR & BOOK
    authorRepository.save(author);

    //UPDATE DTO
    authorBookDTO.setAuthorId(author.getId());
    authorBookDTO.setBookId  (book  .getId());

    //RETURN
    return authorBookDTO;

  }

}
