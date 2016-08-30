package com.niit.ShoppingCart.Dao;

import java.util.List;

import javax.management.Query;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.hql.internal.QueryExecutionRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ShoppingCart.Model.Supplier;

@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO
{
	@Autowired
    private SessionFactory sessionFactory;
    
    public SupplierDAOImpl(SessionFactory sessionFactory){
    	
    	this.sessionFactory = sessionFactory;
    	
    }
    @Transactional
    public boolean save(Supplier supplier){
    	try {
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
    }
    @Transactional
    public boolean update(Supplier Supplier){
    	
    	try {
			sessionFactory.getCurrentSession().update(Supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
    }
    @Transactional
    public boolean delete(Supplier Supplier){
    
            try {
				sessionFactory.getCurrentSession().delete(Supplier);
				return true;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
    }
    @Transactional
    public Supplier get(String id){
    	
    	
    	String hql = "from Supplier where id = "+"'"+id+"'";
    	Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
    	List<Supplier> list = ((org.hibernate.Query) query).list();
    	
    	if(list == null)
    	{
    		return null;
    	}
    	else
    	{
    		return list.get(0);
    	}
    }
    @Transactional 
    public List<Supplier> list(){
    	String hql = "from Supplier";
    	Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
    	return ((org.hibernate.Query) query).list();
    	
    }
  
}
