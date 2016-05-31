/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author mo3
 */
public interface IGeneriqueDAO {
    
    void add(Object obj);

    void delete(Object Obj);

    void update(Object obj);

    List<Object> getAll(Class clazz);
    
    public Object get(Class clazz ,Long id);
    
}
