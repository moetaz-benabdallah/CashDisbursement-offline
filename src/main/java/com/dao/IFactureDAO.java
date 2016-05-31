/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Client;
import com.model.Facture;
import java.util.List;

/**
 *
 * @author mo3
 */
public interface IFactureDAO extends IGeneriqueDAO{
    
    public List<Facture> findById(Long id);
    
    public List<Object> ListeFactureClient(String ref);
    
}
