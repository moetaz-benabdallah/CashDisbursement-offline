/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.businessImp;

import com.business.GeneriqueBusiness;
import com.dao.imp.ClientDaoImp;
import com.dao.imp.GeneriqueDaoImp;
import com.model.Client;
import java.util.List;

/**
 *
 * @author mo3
 */
public class GeneriqueBusinessImp implements GeneriqueBusiness{
    
    GeneriqueDaoImp generiqueDAO = new GeneriqueDaoImp();

    @Override
    public void ajouter(Object obj) {

        generiqueDAO.add(obj);
    }

    @Override
    public void modifier(Object obj) {

        generiqueDAO.update(obj);
    }

    @Override
    public List<Object> RecupererList(Class clazz) {

        List result = generiqueDAO.getAll(clazz);

        return result;
    }

    @Override
    public void supprimer(Object obj) {

        generiqueDAO.delete(obj);

    }

    @Override
    public Object recherche(Class clazz, Long id) {
        
        Object obj;
        obj = generiqueDAO.get(clazz, id);
        return obj;
    }
    
}
