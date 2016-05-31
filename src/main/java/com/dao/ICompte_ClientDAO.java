/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Client;
import com.model.Compte_Client;
import java.util.List;

/**
 *
 * @author mo3
 */
public interface ICompte_ClientDAO extends IGeneriqueDAO{
    
    public List<Compte_Client> findById(Long id);
}
