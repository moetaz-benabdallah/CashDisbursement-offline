/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Client;
import com.model.Mode_Reglement;
import java.util.List;

/**
 *
 * @author mo3
 */
public interface IMode_ReglementDAO extends IGeneriqueDAO{
    
    public List<Mode_Reglement> findById(Long id);
}
