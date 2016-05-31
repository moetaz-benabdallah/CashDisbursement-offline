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
@Table(name = "Compte_Client")
@AttributeOverrides({
@AttributeOverride(name = "id", column = @Column(name = "id_cpte_cl", length = 10)) })
public class Compte_Client extends ObjetPersistant implements java.io.Serializable{
    
    private float solde_compte;
    private Client client_compte;

    @Column(name="slde_cpte", nullable=false)
    public float getSolde_compte() {
        return solde_compte;
    }

    public void setSolde_compte(float solde_compte) {
        this.solde_compte = solde_compte;
    }

    @ManyToOne
    @JoinColumn(name = "cl_cpte_id")
    public Client getClient_compte() {
        return client_compte;
    }

    public void setClient_compte(Client client_compte) {
        this.client_compte = client_compte;
    }
    
    
}
