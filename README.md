INFO
Next we will add Book Entity and HTML Page to add new Book.
We want to have OneToMany Relationship between Authors and Books, where one Author can have multiple Books.
Therefore Entity Book needs additional Property authorId that points to specific Author Entity. 
Therefore Table BOOK needs additional Column AUTHOR_ID that points to specific Record in AUTHOR Table. 
Just adding Foreign Key to Book Entity will not make Hibernate aware of intended OneToMany Relationship.
We will make it aware of it in the next step by using @OneToMany Annotation.
