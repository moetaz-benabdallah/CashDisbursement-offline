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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author mo3
 */
@Entity
@Table(name = "Mode_Reglement")
@AttributeOverrides({
    @AttributeOverride(name = "id", column = @Column(name = "id_mr", length = 10))})
public class Mode_Reglement extends ObjetPersistant implements java.io.Serializable{
    
    private Caisse caisse_mr;
    private String code_mr;
    private String nom_mr;

    @ManyToOne
    @JoinColumn(name = "caisse_mr_id")
    public Caisse getCaisse_mr() {
        return caisse_mr;
    }

    public void setCaisse_mr(Caisse caisse_mr) {
        this.caisse_mr = caisse_mr;
    }

    @Column(name="code_mr", length=10)
    public String getCode_mr() {
        return code_mr;
    }

    public void setCode_mr(String code_mr) {
        this.code_mr = code_mr;
    }

    @Column(name="nom_mr", length=10)
    public String getNom_mr() {
        return nom_mr;
    }

    public void setNom_mr(String nom_mr) {
        this.nom_mr = nom_mr;
    }
    
    
    
}
