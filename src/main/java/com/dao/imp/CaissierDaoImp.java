/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.imp;

import com.dao.ICaissierDAO;
import com.model.Caisse;
import com.model.Caissier;
import com.util.NewHibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author mo3
 */
public class CaissierDaoImp extends GeneriqueDaoImp implements ICaissierDAO{
    
    private Session hibernateSession;
    private Transaction tx;
    
    protected void startOperation() throws HibernateException{
        hibernateSession = NewHibernateUtil.getSessionFactory().openSession();
        tx = hibernateSession.beginTransaction();
    }
    
    
    @Override
    public List<Caissier> findById(Long id) {
        List objects = null;
        try {
            startOperation();
            Query query = hibernateSession.createQuery("from com.model.Caissier where id_caissier = :id");
            query.setParameter("id", id);
            objects = query.list();
            
        } catch (HibernateException e) {
        }finally{
            hibernateSession.close();
        }
        return objects;
}
}