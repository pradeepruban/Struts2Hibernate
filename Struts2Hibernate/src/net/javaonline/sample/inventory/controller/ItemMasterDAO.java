package net.javaonline.sample.inventory.controller;


import java.util.List;



import net.javaonline.sample.inventory.dto.ItemMaster;
import net.javaonline.util.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;


public class ItemMasterDAO extends HibernateUtil {

	public ItemMaster add(ItemMaster item) {
		Session session = HibernateUtil.createSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(item);
		session.getTransaction().commit();
		return item;
	}
	public ItemMaster delete(Long id) {
		Session session = HibernateUtil.createSessionFactory().getCurrentSession();
		session.beginTransaction();
		ItemMaster item = (ItemMaster) session.load(ItemMaster.class, id);
		if(null != item) {
			session.delete(item);
		}
		session.getTransaction().commit();
		return item;
	}

	public List<ItemMaster> list() {
		
		Session session = HibernateUtil.createSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<ItemMaster> items = null;
		try {
			
			//items = (List<ItemMaster>)session.createQuery("from ItemMaster").list();
			items = (List<ItemMaster>)session.createQuery("from ItemMaster").list();
			
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		session.getTransaction().commit();
		return items;
	}
}
