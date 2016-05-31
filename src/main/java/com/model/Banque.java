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
@Table(name = "Banque")
@AttributeOverrides({
@AttributeOverride(name = "id", column = @Column(name = "id_ban", length = 10)) })
public class Banque extends ObjetPersistant implements java.io.Serializable
{
    private String code_agence;
    private String nom_ban;
    private String code_ban;

    @Column(name="code_ag", length=20)
    public String getCode_agence() {
        return code_agence;
    }

    public void setCode_agence(String code_agence) {
        this.code_agence = code_agence;
    }

    @Column(name="nom_ban", length=20)
    public String getNom_ban() {
        return nom_ban;
    }

    public void setNom_ban(String nom_ban) {
        this.nom_ban = nom_ban;
    }

    @Column(name="code_ban", length=20)
    public String getCode_ban() {
        return code_ban;
    }

    public void setCode_ban(String code_ban) {
        this.code_ban = code_ban;
    }
    
    
    
    
}
