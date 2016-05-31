/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Client;
import com.model.Vocabulaire;
import java.util.List;

/**
 *
 * @author mo3
 */
public interface IVocabulaireDAO extends IGeneriqueDAO{
    
    public List<Vocabulaire> findById(Long id);
}
