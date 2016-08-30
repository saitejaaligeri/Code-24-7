package com.niit.ShoppingCart.Dao;

import java.util.List;

import javax.management.Query;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.hql.internal.QueryExecutionRequestException;
import org.springframework.stereotype.Repository;

import com.niit.ShoppingCart.Model.UserDetails;

@Repository("userdetailsDAO")
public class UserDetailsDAOImpl implements UserDetailsDAO{
	
    private SessionFactory sessionFactory;
    
    public UserDetailsDAOImpl(SessionFactory sessionFactory){
    	
    	this.sessionFactory = sessionFactory;
    	
    }

    public boolean save(UserDetails UserDetails){
    	try {
			sessionFactory.getCurrentSession().save(UserDetails);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
    }
    
    public boolean update(UserDetails UserDetails){
    	
    	try {
			sessionFactory.getCurrentSession().update(UserDetails);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
    }
    
    public boolean delete(UserDetails UserDetails){
    
            try {
				sessionFactory.getCurrentSession().delete(UserDetails);
				return true;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
    }
    public UserDetails get(String id){
    	
    	
    	String hql = "from UserDetails where id = "+"'"+id+"'";
    	Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
    	List<UserDetails> list = ((org.hibernate.Query) query).list();
    	
    	if(list == null)
    	{
    		return null;
    	}
    	else
    	{
    		return list.get(0);
    	}
    }
    
    public List<UserDetails> list(){
    	String hql = "from UserDetails";
    	Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
    	return ((org.hibernate.Query) query).list();
    	
    }
  
}
