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
@Table(name = "Vocabulaire")
@AttributeOverrides({
@AttributeOverride(name = "id", column = @Column(name = "id_voc", length = 10)) })
public class Vocabulaire extends ObjetPersistant implements java.io.Serializable{
    
    private String code_type_voc;
    private String code_voc;
    private String nom_voc;

    @Column(name="code_type_voc", length=20)
    public String getCode_type_voc() {
        return code_type_voc;
    }

    public void setCode_type_voc(String code_type_voc) {
        this.code_type_voc = code_type_voc;
    }

    @Column(name="code_voc", length=20)
    public String getCode_voc() {
        return code_voc;
    }

    public void setCode_voc(String code_voc) {
        this.code_voc = code_voc;
    }

    @Column(name="nom_voc", length=20)
    public String getNom_voc() {
        return nom_voc;
    }

    public void setNom_voc(String nom_voc) {
        this.nom_voc = nom_voc;
    }

    @Override
    public String toString() {
        return super.toString()+"Vocabulaire{" + "code_type_voc=" + code_type_voc + ", code_voc=" + code_voc + ", nom_voc=" + nom_voc + '}';
    }
    
    
    
}
