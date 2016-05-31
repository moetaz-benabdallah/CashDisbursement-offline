/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.model.mappedClass.ObjetPersistant;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author mo3
 */
@Entity
@Table(name = "Contrat")
@AttributeOverrides({
@AttributeOverride(name = "id", column = @Column(name = "id_contrat", length = 10)) })
public class Contrat extends ObjetPersistant implements java.io.Serializable{
    
    private String ref_contrat;

    @Column(name="ref_contrat", length=20)
    public String getRef_contrat() {
        return ref_contrat;
    }

    public void setRef_contrat(String ref_contrat) {
        this.ref_contrat = ref_contrat;
    }
    
    
    
}
