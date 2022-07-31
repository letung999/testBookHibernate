package com.letung.dao.impl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.letung.dao.AuthorDAO;
import com.letung.hibernateUtils.HibernateUtil;
import com.letung.model.Author;

public class AuthorImpl implements AuthorDAO{

	@Override
	public int saveAuthor(Author author) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the author object
			session.save(author);
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
	public Author getAuthorById(int id) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// get Author By ID
			Author author = session.get(Author.class, id);
			// commit transaction
			transaction.commit();
			return author;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		return null;
	}

}
