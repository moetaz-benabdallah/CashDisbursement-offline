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
@Table(name = "Facture")
@AttributeOverrides({
@AttributeOverride(name = "id", column = @Column(name = "id_fact", length = 10)) })
public class Facture extends ObjetPersistant implements java.io.Serializable{
   
    private String ref_fact;
    private int id_organisation;
    private Client client_fact;
    private String adresse_fact;
    private Date date_offic_fact;
    private Date date_exig_fact;
    private Date date_edit_fact;
    private float montant_fact;
    private Compte_Client compte_c_fact;
    private int dette_exoneree_fact;
    private float montant_enc_fact;
    private Contrat contrat_fact;
    private Vocabulaire voc_fact;
    private int dette_remboursable_fact;
    private String nom_train_fact;
    private String etape_actu_relance_fact;

    @Column(name="ref_fact", length=20)
    public String getRef_fact() {
        return ref_fact;
    }

    public void setRef_fact(String ref_fact) {
        this.ref_fact = ref_fact;
    }

    @Column(name="id_org", length=10)
    public int getId_organisation() {
        return id_organisation;
    }

    public void setId_organisation(int id_organisation) {
        this.id_organisation = id_organisation;
    }

    @ManyToOne
    @JoinColumn(name = "cl_fact_id")
    public Client getClient_fact() {
        return client_fact;
    }

    public void setClient_fact(Client client_fact) {
        this.client_fact = client_fact;
    }

    @Column(name="adr_fact", length=20)
    public String getAdresse_fact() {
        return adresse_fact;
    }

    public void setAdresse_fact(String adresse_fact) {
        this.adresse_fact = adresse_fact;
    }

    @Column(name = "date_offic_fact")
    public Date getDate_offic_fact() {
        return date_offic_fact;
    }

    public void setDate_offic_fact(Date date_offic_fact) {
        this.date_offic_fact = date_offic_fact;
    }

    @Column(name = "date_exig_fact")
    public Date getDate_exig_fact() {
        return date_exig_fact;
    }

    public void setDate_exig_fact(Date date_exig_fact) {
        this.date_exig_fact = date_exig_fact;
    }

    @Column(name = "date_edit_fact")
    public Date getDate_edit_fact() {
        return date_edit_fact;
    }

    public void setDate_edit_fact(Date date_edit_fact) {
        this.date_edit_fact = date_edit_fact;
    }

    @Column(name="montant_fact")
    public float getMontant_fact() {
        return montant_fact;
    }

    public void setMontant_fact(float montant_fact) {
        this.montant_fact = montant_fact;
    }

    @ManyToOne
    @JoinColumn(name = "cpt_cl_id")
    public Compte_Client getCompte_c_fact() {
        return compte_c_fact;
    }

    public void setCompte_c_fact(Compte_Client compte_c_fact) {
        this.compte_c_fact = compte_c_fact;
    }

    @Column(name="dette_exo_fact", length=10)
    public int getDette_exoneree_fact() {
        return dette_exoneree_fact;
    }

    public void setDette_exoneree_fact(int dette_exoneree_fact) {
        this.dette_exoneree_fact = dette_exoneree_fact;
    }

    @Column(name="montant_enc_fact", nullable=false)
    public float getMontant_enc_fact() {
        return montant_enc_fact;
    }

    public void setMontant_enc_fact(float montant_enc_fact) {
        this.montant_enc_fact = montant_enc_fact;
    }

    @ManyToOne
    @JoinColumn(name = "contrat_fact_id")
    public Contrat getContrat_fact() {
        return contrat_fact;
    }

    public void setContrat_fact(Contrat contrat_fact) {
        this.contrat_fact = contrat_fact;
    }

    @ManyToOne
    @JoinColumn(name = "voc_fact_id")
    public Vocabulaire getVoc_fact() {
        return voc_fact;
    }

    public void setVoc_fact(Vocabulaire voc_fact) {
        this.voc_fact = voc_fact;
    }

    @Column(name="dette_remb_fact", length=10)
    public int getDette_remboursable_fact() {
        return dette_remboursable_fact;
    }

    public void setDette_remboursable_fact(int dette_remboursable_fact) {
        this.dette_remboursable_fact = dette_remboursable_fact;
    }

    @Column(name="nom_train_fact", length=20)
    public String getNom_train_fact() {
        return nom_train_fact;
    }

    public void setNom_train_fact(String nom_train_fact) {
        this.nom_train_fact = nom_train_fact;
    }

    @Column(name="etape_actu_relance_fact", length=20)
    public String getEtape_actu_relance_fact() {
        return etape_actu_relance_fact;
    }

    public void setEtape_actu_relance_fact(String etape_actu_relance_fact) {
        this.etape_actu_relance_fact = etape_actu_relance_fact;
    }

    @Override
    public String toString() {
        return super.toString()+"Facture{" + "ref_fact=" + ref_fact + ", id_organisation=" + id_organisation + ", client_fact=" + client_fact + ", adresse_fact=" + adresse_fact + ", date_offic_fact=" + date_offic_fact + ", date_exig_fact=" + date_exig_fact + ", date_edit_fact=" + date_edit_fact + ", montant_fact=" + montant_fact + ", compte_c_fact=" + compte_c_fact + ", dette_exoneree_fact=" + dette_exoneree_fact + ", montant_enc_fact=" + montant_enc_fact + ", contrat_fact=" + contrat_fact + ", voc_fact=" + voc_fact + ", dette_remboursable_fact=" + dette_remboursable_fact + ", nom_train_fact=" + nom_train_fact + ", etape_actu_relance_fact=" + etape_actu_relance_fact +'}'+"\n";
    }

    


    
    
}
