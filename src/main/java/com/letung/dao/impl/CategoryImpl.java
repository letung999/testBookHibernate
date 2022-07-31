package com.letung.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.letung.dao.CategoryDAO;
import com.letung.hibernateUtils.HibernateUtil;
import com.letung.model.Book;
import com.letung.model.Category;
import com.mysql.cj.Query;

public class CategoryImpl implements CategoryDAO{

	@Override
	public int saveCategory(Category category) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the product object
			session.save(category);
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
	public int getCategoryById() {
		Transaction transaction = null;
		List<String> nameBooks;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the product object
			//Category category = session.get(Category.class, id);
			
			String hql = "select b.nameBook from book as b inner join  book_author as ba on ba.id_book = b.id and b.id = 5 inner join author as a on a.id = ba.id_author";
			nameBooks = session.createSQLQuery(hql).getResultList();
			
			// commit transaction
			transaction.commit();

			return nameBooks.size();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		return 0;
	}

}
