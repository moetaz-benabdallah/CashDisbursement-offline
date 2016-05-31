/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;

import com.model.Client;
import java.util.List;

/**
 *
 * @author mo3
 */
public interface GeneriqueBusiness {
    
    void ajouter(Object obj);

    List<Object> RecupererList(Class clazz);

    void modifier(Object obj);

    void supprimer(Object obj);
    
    Object recherche(Class clazz, Long id);

    
}
