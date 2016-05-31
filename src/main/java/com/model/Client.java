package com.model;
// Generated 25 juin 2015 18:06:51 by Hibernate Tools 4.3.1

import com.model.mappedClass.Personne;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "Client")
@AttributeOverrides({
		@AttributeOverride(name = "id", column = @Column(name = "id_cl", length = 10)),
		@AttributeOverride(name = "nom", column = @Column(name = "nom_cl", length = 20)),
		@AttributeOverride(name = "prenom", column = @Column(name = "prenom_cl", length = 20)),
		@AttributeOverride(name = "adresse", column = @Column(name = "adresse_cl", length = 100)),
		@AttributeOverride(name = "tel", column = @Column(name = "tel_cl", length = 20)),
		@AttributeOverride(name = "mail", column = @Column(name = "mail_cl", length = 80))})
public class Client extends Personne implements java.io.Serializable {

    private String ref_client;
    private String ref2_client;

    @Column(name="ref_cl", length=20)
    public String getRef_client() {
        return ref_client;
    }

    public void setRef_client(String ref_client) {
        this.ref_client = ref_client;
    }

    @Column(name="ref2_cl", length=20)
    public String getRef2_client() {
        return ref2_client;
    }

    public void setRef2_client(String ref_deux_client) {
        this.ref2_client = ref_deux_client;
    }

    @Override
    public String toString() {
        return super.toString()+"Client{" + "ref_client=" + ref_client + ", ref2_client=" + ref2_client + '}';
    }
    
    

}
