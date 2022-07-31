package com.letung.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.letung.dao.AuthorDAO;
import com.letung.dao.BookDAO;
import com.letung.dao.CategoryDAO;
import com.letung.dao.impl.AuthorImpl;
import com.letung.dao.impl.BookImpl;
import com.letung.dao.impl.CategoryImpl;
import com.letung.model.Author;
import com.letung.model.Book;
import com.letung.model.Category;

public class App {
	public static void main(String[] args) {
		Date date = new Date();
		BookDAO bookDAO = new BookImpl();
		CategoryDAO categoryDAO = new CategoryImpl();
		AuthorDAO authorDAO = new AuthorImpl();
		
		/* add Category */
		
//		Category category = new Category();
//		category.setNameCategory("Chinh Tri-Xa Hoi");
//		categoryDAO.saveCategory(category);
		

		
		
//		Category category = new Category();
//		Category category1 = new Category("");
//		Category category2 = new Category("Ngon Tinh");
//		Category category3 = new Category("Xa Hoi");
		
		/*add Book*/
		
//		Book book = new Book();
//		book.setNameBook("Neu Ta Ton Tai Giua Khoang Khong");
//		book.setPrice(new BigDecimal(230000));
//		book.setPublisher("Adam khoo");
//		book.setPublishingYear(date);
//		//get category from db
//		Category category = categoryDAO.getCategoryById(4);
//		book.setCategory(category);
//		bookDAO.saveBook(book);
		
		
		/*get name Product with Category = 4*/
//		for (Book resultBook : categoryDAO.getCategoryById(4).getBooks()) {
//			System.out.println(resultBook.getNameBook());
//		}
		
		
		/*add Author*/
//		Author author = new Author();
//		author.setGender(0);
//		author.setNameAuthor("Nguyen Ngoc Phuc");
//		authorDAO.saveAuthor(author);
		
		
		/*add book with author*/
		
//		Book book = new Book();
//		book.setNameBook("Spring framework");
//		book.setPrice(new BigDecimal(120000));
//		book.setPublisher("Jonas");
//		book.setPublishingYear(date);
//		//get category from db
//		Category category = categoryDAO.getCategoryById(4);
//		book.setCategory(category);
//		
//		
//		//get list Author
//		Set<Author> authors = new HashSet<Author>();
//		authors.add(authorDAO.getAuthorById(2));
//		book.setAuthor(authors);
//		
//		bookDAO.saveBook(book);
		
		
		/*get name book write by author*/
//		for (Book resultBook : authorDAO.getAuthorById(2).getBooks()) {
//			System.out.println(resultBook.getNameBook());
//		}
		
		//System.out.println(bookDAO.getBookbyID(2).getNameBook());
		
		System.out.println(categoryDAO.getCategoryById());
		
	}

	
}
