package com.niit.ShoppingCart.Dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ShoppingCart.Model.Product;
import com.niit.ShoppingCart.Model.Login;

@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO {
	public List<Login> list1() {
		return null;
	}

	@Autowired
	private SessionFactory sessionFactory;

	public LoginDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void save(Login Login) {
		sessionFactory.getCurrentSession().save(Login);

	}

	@Transactional
	public void update(Login Login) {
		sessionFactory.getCurrentSession().update(Login);

	}

	@Transactional
	public void delete(int id) {
		Login LoginToDelete = new Login();
		LoginToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(LoginToDelete);
	}

	@Transactional
	public List getAllLogins() {
		Session session=sessionFactory.openSession();
		List listLogin=session.createQuery("from Login").list();
		session.close();
		return listLogin;
		}


	@Transactional
	public Login get(int id) {
		// sessionFactory.getCurrentSession().get(Login.class,id);
		String hql = "from Login where Id=" + "'" + id + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Login> listLogin = query.list();
		if (listLogin != null && !listLogin.isEmpty()) {
			return listLogin.get(0);
		}
		return null;
	}
	@Transactional
	public Login getSingleLogin(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Login Login=(Login)session.load(Login.class, id);
		return Login;
		}
	@Transactional
	public List<Login> list() {
		@SuppressWarnings("unchecked")
		List<Login> list = (List<Login>) sessionFactory.getCurrentSession()
				.createCriteria(Login.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return list;
	}
}
