/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Client;
import com.model.Session_Caisse;
import java.util.List;

/**
 *
 * @author mo3
 */
public interface ISession_CaisseDAO extends IGeneriqueDAO{
    
    public List<Session_Caisse> findById(Long id);
}
