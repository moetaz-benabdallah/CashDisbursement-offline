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
@Table(name = "Session_Caisse")
@AttributeOverrides({
    @AttributeOverride(name = "id", column = @Column(name = "id_sess_caisse", length = 10))})
public class Session_Caisse extends ObjetPersistant implements java.io.Serializable {

    private Caisse caisse_session;
    private Caissier caissier_session;
    private Date date_ouv_session;
    private Date date_ferm_session;

    @ManyToOne
    @JoinColumn(name = "caisse_sess_id")
    public Caisse getCaisse_session() {
        return caisse_session;
    }

    public void setCaisse_session(Caisse caisse_session) {
        this.caisse_session = caisse_session;
    }

    @ManyToOne
    @JoinColumn(name = "caissier_sess_id")
    public Caissier getCaissier_session() {
        return caissier_session;
    }

    public void setCaissier_session(Caissier caissier_session) {
        this.caissier_session = caissier_session;
    }

    @Column(name = "date_ouv_sess", nullable = false)
    public Date getDate_ouv_session() {
        return date_ouv_session;
    }

    public void setDate_ouv_session(Date date_ouv_session) {
        this.date_ouv_session = date_ouv_session;
    }

    @Column(name = "date_ferm_sess", nullable = false)
    public Date getDate_ferm_session() {
        return date_ferm_session;
    }

    public void setDate_ferm_session(Date date_ferm_session) {
        this.date_ferm_session = date_ferm_session;
    }

}
