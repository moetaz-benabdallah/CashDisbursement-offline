/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Caisse;
import com.model.Client;
import java.util.List;

/**
 *
 * @author mo3
 */
public interface ICaisseDAO extends IGeneriqueDAO{
    
    public List<Caisse> findById(Long id);
}
