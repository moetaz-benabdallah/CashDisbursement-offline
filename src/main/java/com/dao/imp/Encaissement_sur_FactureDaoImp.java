/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.imp;

import com.dao.IEncaissement_sur_FactureDAO;
import com.model.Client;
import com.model.Encaissement_sur_Facture;
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
public class Encaissement_sur_FactureDaoImp extends GeneriqueDaoImp implements IEncaissement_sur_FactureDAO{
    
    
    private Session hibernateSession;
    private Transaction tx;
    
    protected void startOperation() throws HibernateException{
        hibernateSession = NewHibernateUtil.getSessionFactory().openSession();
        tx = hibernateSession.beginTransaction();
    }
    

    @Override
    public List<Encaissement_sur_Facture> findById(Long id) {
        List objects = null;
        try {
            startOperation();
            Query query = hibernateSession.createQuery("from com.model.Encaissement_sur_Facture where id_enc_fact = :id");
            query.setParameter("id", id);
            objects = query.list();
            
        } catch (HibernateException e) {
        }finally{
            hibernateSession.close();
        }
        return objects;
    }
}
