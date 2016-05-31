/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import com.model.Banque;
import com.model.Caisse;
import com.model.Caissier;
import com.model.Client;
import com.model.Compte_Client;
import com.model.Contrat;
import com.model.Encaissement;
import com.model.Encaissement_sur_Facture;
import com.model.Facture;
import com.model.Mode_Reglement;
import com.model.Mouvement_Session_Caisse;
import com.model.Session_Caisse;
import com.model.Vocabulaire;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author mo3
 */
public class Test {
    
    public static void main(String[] args) {
        
        AnnotationConfiguration config = new AnnotationConfiguration();
        config.addAnnotatedClass(Facture.class);
        config.configure("hibernate.cfg.xml");
        
        new SchemaExport(config).create(true,true);
        
    }
    
}
