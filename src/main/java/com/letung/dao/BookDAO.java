package com.letung.dao;

import com.letung.model.Book;

public interface BookDAO {
	public int saveBook(Book book);
	
	public int updateBook(Book book, int id);
	
	public Book getBookbyID(int id);
}
