/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.imp;

import com.dao.IGeneriqueDAO;
import com.model.Facture;
import com.util.NewHibernateUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author mo3
 */
public class GeneriqueDaoImp implements IGeneriqueDAO {

    @Override
    public void add(Object obj) {

        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();

        try {
            trns = session.beginTransaction();
            session.save(obj);
            trns.commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
        } finally {
            session.flush();
            session.close();
        }
    }

    @Override
    public void delete(Object obj) {

        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();

        try {
            trns = session.beginTransaction();
            session.delete(obj);
            trns.commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
        } finally {
            session.flush();
            session.close();
        }
    }

    @Override
    public void update(Object obj) {

        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();

        try {
            trns = session.beginTransaction();
            session.update(obj);
            trns.commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
        } finally {
            session.flush();
            session.close();
        }
    }

    @Override
    public List<Object> getAll(Class clazz) {

        List<Object> objects = new ArrayList<Object>();

        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();

        try {
            trns = session.beginTransaction();
            Query query = session.createQuery("from " + clazz.getName());
            objects = query.list();
        } catch (RuntimeException e) {
        } finally {
            session.flush();
            session.close();
        }
        return objects;
    }

    @Override
    public Object get(Class clazz ,Long id) {
        System.out.println("+++++++++++++++++++++"+clazz.getName());
        Object obj = null;
        
        Transaction trns = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            Query query = session.createQuery("from "+clazz.getName()+" where id = :id");
            query.setParameter("id", id);
            obj = query.uniqueResult();
            
            
        } catch (HibernateException e) {
        }finally{
            session.close();
        }
        return obj;
        
    }

}
