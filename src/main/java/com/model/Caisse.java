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
@Table(name = "Caisse")
@AttributeOverrides({
@AttributeOverride(name = "id", column = @Column(name = "id_caisse", length = 10)) })
public class Caisse extends ObjetPersistant implements java.io.Serializable{
    
    private String code_caisse;
    private String nom_caisse;
    private String max_trans_caisse;
    private int internal_caisse;

    @Column(name="code_caisse", length=20)
    public String getCode_caisse() {
        return code_caisse;
    }

    public void setCode_caisse(String code_caisse) {
        this.code_caisse = code_caisse;
    }

    @Column(name="nom_caisse", length=20)
    public String getNom_caisse() {
        return nom_caisse;
    }

    public void setNom_caisse(String nom_caisse) {
        this.nom_caisse = nom_caisse;
    }

    @Column(name="max_tans_caisse", length=20)
    public String getMax_trans_caisse() {
        return max_trans_caisse;
    }

    public void setMax_trans_caisse(String max_trans_caisse) {
        this.max_trans_caisse = max_trans_caisse;
    }

    @Column(name="internal_caisse", length=10)
    public int getInternal_caisse() {
        return internal_caisse;
    }

    public void setInternal_caisse(int internal_caisse) {
        this.internal_caisse = internal_caisse;
    }
    
    
    
}
