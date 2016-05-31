/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.imp;

import com.dao.IFactureDAO;
import com.model.Client;
import com.model.Facture;
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
public class FactureDaoImp extends GeneriqueDaoImp implements IFactureDAO{
    
    private Session hibernateSession;
    private Transaction tx;
    
    protected void startOperation() throws HibernateException{
        hibernateSession = NewHibernateUtil.getSessionFactory().openSession();
        tx = hibernateSession.beginTransaction();
    }
    

    @Override
    public List<Facture> findById(Long id) {
        List objects = null;
        try {
            startOperation();
            Query query = hibernateSession.createQuery("from com.model.Facture where id = :id");
            query.setParameter("id", id);
            objects = query.list();
            
        } catch (HibernateException e) {
        }finally{
            hibernateSession.close();
        }
        return objects;
    }

    @Override
    public List<Object> ListeFactureClient(String ref) {
        
        //List objects = null;
        Client resultClient;
        List resultFacture = null;
        Long idCl = null;
        try {
            startOperation();
            Query query = hibernateSession.createQuery("select client_fact from com.model.Facture "
                    + "where ref_fact = :ref");
            query.setParameter("ref", ref);
            resultClient = (Client)query.uniqueResult();
            
            idCl = resultClient.getId();
//objects = query.list();
            
        } catch (HibernateException e) {
        }finally{
            hibernateSession.close();
        }
    
        try {
            startOperation();
            Query query = hibernateSession.createQuery("from com.model.Facture as fact where fact.client_fact.id = :client "
                    + "and fact.date_offic_fact = null");
            query.setParameter("client", idCl);
            resultFacture = query.list();
        } catch (Exception e) {
        }finally{
            hibernateSession.close();
        }
        return resultFacture;
    }
    
    
}
