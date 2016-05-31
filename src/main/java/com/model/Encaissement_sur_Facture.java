/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.model.mappedClass.ObjetPersistant;
import java.util.Date;
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
@Table(name = "Encaissement_sur_Facture")
@AttributeOverrides({
@AttributeOverride(name = "id", column = @Column(name = "id_enc_fact", length = 10)) })
public class Encaissement_sur_Facture extends ObjetPersistant implements java.io.Serializable{
    
    private Facture facture_enc_fact;
    private Date date_enc;
    private float montant_reglement_fact;
    private Mouvement_Session_Caisse mvt_sess_enc_fact;

    @ManyToOne
    @JoinColumn(name = "fact_enc_fact_id")
    public Facture getFacture_enc_fact() {
        return facture_enc_fact;
    }

    public void setFacture_enc_fact(Facture facture_enc_fact) {
        this.facture_enc_fact = facture_enc_fact;
    }

    @Column(name = "date_enc", nullable = false)
    public Date getDate_enc() {
        return date_enc;
    }

    public void setDate_enc(Date date_enc) {
        this.date_enc = date_enc;
    }
    
    @Column(name = "montant_regl_fact", nullable = false)
    public float getMontant_reglement_fact() {
        return montant_reglement_fact;
    }

    public void setMontant_reglement_fact(float montant_reglement_fact) {
        this.montant_reglement_fact = montant_reglement_fact;
    }

    @ManyToOne
    @JoinColumn(name = "mvt_sess_enc_fact_id")
    public Mouvement_Session_Caisse getMvt_sess_enc_fact() {
        return mvt_sess_enc_fact;
    }

    public void setMvt_sess_enc_fact(Mouvement_Session_Caisse mvt_sess_enc_fact) {
        this.mvt_sess_enc_fact = mvt_sess_enc_fact;
    }
    
    
    
}
