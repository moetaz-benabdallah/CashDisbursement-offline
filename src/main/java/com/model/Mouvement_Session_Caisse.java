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
@Table(name = "Mouvement_Session_Caisse")
@AttributeOverrides({
@AttributeOverride(name = "id", column = @Column(name = "id_mvt", length = 10)) })
public class Mouvement_Session_Caisse extends ObjetPersistant implements java.io.Serializable{
    
    private String ref_enc;
    private Session_Caisse sess_mvt;
    private Date date_mvt;
    private float montant_mvt;
    private Vocabulaire voc_mvt_sess;

    @Column(name="ref_enc", length=20)
    public String getRef_enc() {
        return ref_enc;
    }

    public void setRef_enc(String ref_enc) {
        this.ref_enc = ref_enc;
    }

    @ManyToOne
    @JoinColumn(name = "sess_mvt_id")
    public Session_Caisse getSess_mvt() {
        return sess_mvt;
    }

    public void setSess_mvt(Session_Caisse sess_mvt) {
        this.sess_mvt = sess_mvt;
    }

    @Column(name = "date_mvt", nullable = false)
    public Date getDate_mvt() {
        return date_mvt;
    }

    public void setDate_mvt(Date date_mvt) {
        this.date_mvt = date_mvt;
    }

    @Column(name="montant_mvt", nullable=false)
    public float getMontant_mvt() {
        return montant_mvt;
    }

    public void setMontant_mvt(float montant_mvt) {
        this.montant_mvt = montant_mvt;
    }

    @ManyToOne
    @JoinColumn(name = "voc_mvt_id")
    public Vocabulaire getVoc_mvt_sess() {
        return voc_mvt_sess;
    }

    public void setVoc_mvt_sess(Vocabulaire voc_mvt_sess) {
        this.voc_mvt_sess = voc_mvt_sess;
    }

    @Override
    public String toString() {
        return "Mouvement_Session_Caisse{" + "ref_enc=" + ref_enc + ", sess_mvt=" + sess_mvt + ", date_mvt=" + date_mvt + ", montant_mvt=" + montant_mvt + ", voc_mvt_sess=" + voc_mvt_sess + '}';
    }
    
    
}
