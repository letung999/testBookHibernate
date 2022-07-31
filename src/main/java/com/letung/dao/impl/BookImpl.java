package com.letung.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.letung.dao.BookDAO;
import com.letung.model.Book;
import com.letung.hibernateUtils.*;

public class BookImpl implements BookDAO {

	public int saveBook(Book book) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the product object
			session.save(book);
			// commit transaction
			transaction.commit();

			return 1;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		return 0;

	}

	@Override
	public int updateBook(Book book, int id) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the product object
			Book bookdb = session.get(Book.class, id);
			
			// commit transaction
			transaction.commit();

			return 1;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public Book getBookbyID(int id) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the product object
			Book book = session.get(Book.class, id);
			// commit transaction
			transaction.commit();

			return book;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return null;

	}

}
