package com.ivoronline.springboot_demo_authorsbooks.DTO;

import lombok.Data;
import org.springframework.stereotype.Component;
import java.sql.Date;

@Data
@Component
public class AuthorBookDTO {

  //AUTHOR PROPERTIES
  private Integer authorId;
  private String  name;
  private Integer age;
  private Date    birthday;

  //BOOK PROPERTIES
  private Integer bookId;
  private String  title;

}
