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
@Table(name = "Encaissement")
@AttributeOverrides({
@AttributeOverride(name = "id", column = @Column(name = "id_enc", length = 10)) })
public class Encaissement extends ObjetPersistant implements java.io.Serializable{
    
    private int id_enc_rejet;
    private Date date_enc;
    private Mouvement_Session_Caisse mvt_sess_enc;
    private Mode_Reglement mr_enc;
    private int id_bordereau;
    private Caissier caissier_enc;
    private Client client_enc;
    private float montant_enc;
    private int id_monnaie;
    private String num_carte_cheque;
    private Banque ban_enc;
    private Vocabulaire voc_enc;

    @Column(name="id_enc_rejet", length=10)
    public int getId_enc_rejet() {
        return id_enc_rejet;
    }

    public void setId_enc_rejet(int id_enc_rejet) {
        this.id_enc_rejet = id_enc_rejet;
    }

    @Column(name = "date_enc", nullable = false)
    public Date getDate_enc() {
        return date_enc;
    }

    public void setDate_enc(Date date_enc) {
        this.date_enc = date_enc;
    }

    @ManyToOne
    @JoinColumn(name = "mvt_enc_id")
    public Mouvement_Session_Caisse getMvt_sess_enc() {
        return mvt_sess_enc;
    }

    public void setMvt_sess_enc(Mouvement_Session_Caisse mvt_sess_enc) {
        this.mvt_sess_enc = mvt_sess_enc;
    }

    @ManyToOne
    @JoinColumn(name = "mr_enc_id")
    public Mode_Reglement getMr_enc() {
        return mr_enc;
    }

    public void setMr_enc(Mode_Reglement mr_enc) {
        this.mr_enc = mr_enc;
    }

    @Column(name="id_bor_enc", length=10)
    public int getId_bordereau() {
        return id_bordereau;
    }

    public void setId_bordereau(int id_bordereau) {
        this.id_bordereau = id_bordereau;
    }

    @ManyToOne
    @JoinColumn(name = "caissier_enc_id")
    public Caissier getCaissier_enc() {
        return caissier_enc;
    }

    public void setCaissier_enc(Caissier caissier_enc) {
        this.caissier_enc = caissier_enc;
    }

    @ManyToOne
    @JoinColumn(name = "cl_enc_id")
    public Client getClient_enc() {
        return client_enc;
    }

    public void setClient_enc(Client client_enc) {
        this.client_enc = client_enc;
    }

    @Column(name="montant_enc", nullable=false)
    public float getMontant_enc() {
        return montant_enc;
    }

    public void setMontant_enc(float montant_enc) {
        this.montant_enc = montant_enc;
    }

    @Column(name="id_monnaie_enc", length=10)
    public int getId_monnaie() {
        return id_monnaie;
    }

    public void setId_monnaie(int id_monnaie) {
        this.id_monnaie = id_monnaie;
    }

    @Column(name="num_carte_cheque_enc", length=20)
    public String getNum_carte_cheque() {
        return num_carte_cheque;
    }

    public void setNum_carte_cheque(String num_carte_cheque) {
        this.num_carte_cheque = num_carte_cheque;
    }

    @ManyToOne
    @JoinColumn(name = "ban_enc_id")
    public Banque getBan_enc() {
        return ban_enc;
    }

    public void setBan_enc(Banque ban_enc) {
        this.ban_enc = ban_enc;
    }

    @ManyToOne
    @JoinColumn(name = "voc_enc_id")
    public Vocabulaire getVoc_enc() {
        return voc_enc;
    }

    public void setVoc_enc(Vocabulaire voc_enc) {
        this.voc_enc = voc_enc;
    }
    
    
    
}
