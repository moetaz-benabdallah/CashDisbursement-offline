/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.model.mappedClass.Personne;
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
@Table(name = "Caissier")
@AttributeOverrides({
		@AttributeOverride(name = "id", column = @Column(name = "id_caissier", length = 10)),
		@AttributeOverride(name = "nom", column = @Column(name = "nom_caissier", length = 20)),
		@AttributeOverride(name = "prenom", column = @Column(name = "prenom_caissier", length = 20)),
		@AttributeOverride(name = "adresse", column = @Column(name = "adresse_caissier", length = 100)),
		@AttributeOverride(name = "tel", column = @Column(name = "tel_caissier", length = 20)),
		@AttributeOverride(name = "mail", column = @Column(name = "mail_caissier", length = 80))})
public class Caissier extends Personne implements java.io.Serializable{
    
    private String ref_caissier;
    private String login_caissier;
    private String pwd_caissier;

    @Column(name="ref_caissier", length=20)
    public String getRef_caissier() {
        return ref_caissier;
    }

    public void setRef_caissier(String ref_caissier) {
        this.ref_caissier = ref_caissier;
    }

    @Column(name="login_caissier", length=20)
    public String getLogin_caissier() {
        return login_caissier;
    }

    public void setLogin_caissier(String login_caissier) {
        this.login_caissier = login_caissier;
    }

    @Column(name="pwd_caissier", length=20)
    public String getPwd_caissier() {
        return pwd_caissier;
    }

    public void setPwd_caissier(String pwd_caissier) {
        this.pwd_caissier = pwd_caissier;
    }
    
    
    
}
