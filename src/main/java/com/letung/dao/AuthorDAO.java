package com.letung.dao;

import com.letung.model.Author;

public interface AuthorDAO {
	public int saveAuthor(Author author);
	
	public Author getAuthorById(int id);
}
