/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import com.bean.Facture_b;
import com.dao.imp.ClientDaoImp;
import com.dao.imp.Compte_ClientDaoImp;
import com.dao.imp.FactureDaoImp;
import com.dao.imp.Mouvement_Session_CaisseDaoImp;
import com.dao.imp.VocabulaireDaoImp;

import com.model.Client;
import com.model.Compte_Client;
import com.model.Facture;
import com.model.Mouvement_Session_Caisse;
import com.model.Vocabulaire;
import com.parsing.GetXmlFactures;
import java.text.ParseException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author mo3
 */
public class main {
    
    public static void main(String[] args) throws ParseException {
        

        int x = 4;
        Long y;
        y = new Long(x);
//        
//        Client c = new Client(); 
//        c.setId(y);
//        c.setRef_client("fff");
//        c.setRef2_client("mmm");
     
//        Compte_Client cc = new Compte_Client();
//        //cc.setSolde_compte((float) 11.5);
//        cc.setClient_compte(c);
        

//        Session session = NewHibernateUtil.getSessionFactory().openSession();
//        Transaction trx = session.beginTransaction();
//        
//        session.save(r);
//        trx.commit(); 
        
//        ClientDaoImp dao = new ClientDaoImp();
//        
//        //System.out.println(dao.getAll(Client.class));
//        dao.add(c);
//        //dao.delete(1002);
//        //System.out.println(dao.findByNom("moetaz"));
//
//        Compte_ClientDaoImp dao2 = new Compte_ClientDaoImp();
//        dao2.add(cc);
//        
        
//        Client client = new Client();
//        client.setRef_client("ref1");
//        client.setAdresse("ariana");
//        client.setNom("moetaz");
//        
//        ClientDaoImp clientDao = new ClientDaoImp();
////        clientDao.add(client);
//        System.out.println(clientDao.findById(y));
        
//        Vocabulaire voc = new Vocabulaire();
//        voc.setCode_voc("voc0135");
//        voc.setCode_type_voc("type1");
//        voc.setNom_voc("vocabulaire");
//        
//        VocabulaireDaoImp vocDao = new VocabulaireDaoImp();
//        System.out.println(vocDao.getAll(Vocabulaire.class));
//        vocDao.add(voc);
        
        //Date d = new Date(12, 12, 3, 11, 11, 11);
        
//        Facture f = new Facture();
//        f.setAdresse_fact("adr");
//        f.setRef_fact("ref4");
//        f.setClient_fact(c);
        
//        FactureDaoImp fact = new FactureDaoImp();
//        System.out.println(fact.ListeFactureClient("ref1"));
        
        //fact.add(f);
        //System.out.println(fact.getAll(Facture.class));
        
//        Facture_b f = new Facture_b();
//       
//        System.out.println(f.getListFactures());
        
//        GetXmlFactures parseFact = new GetXmlFactures();
//        
//        System.out.println(parseFact.ParseFacture("C:/FacturesXML/","Facture.xml"));
        
        FactureDaoImp fact = new FactureDaoImp();
        System.out.println(fact.get(Facture.class, y));
        
    }
    
}
