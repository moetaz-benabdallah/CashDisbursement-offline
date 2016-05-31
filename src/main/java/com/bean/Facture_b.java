/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import com.businessImp.FactureBusinessImp;
import com.dao.imp.FactureDaoImp;
import com.model.Client;
import com.model.Compte_Client;
import com.model.Contrat;
import com.model.Facture;
import com.model.Vocabulaire;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mo3
 */
@ManagedBean
@SessionScoped
public class Facture_b extends HttpServlet implements Serializable{
    
    
    
    public List<Object> listFactures = new ArrayList<Object>();
    Facture facture = new Facture();
    FactureBusinessImp FactureBusiness = new FactureBusinessImp();
    

    private String search;
    


    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public List<Object> getListFactures() {
        return listFactures;
    }

    public void setListFactures(List<Object> listFactures) {
        this.listFactures = listFactures;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }

    public FactureBusinessImp getFactureBusiness() {
        return FactureBusiness;
    }

    public void setFactureBusiness(FactureBusinessImp FactureBusiness) {
        this.FactureBusiness = FactureBusiness;
    }
    
        private List<Facture> getList() {
        
        List  list = FactureBusiness.RecupererList(Facture.class);

        return list;
    }
        
//        public void searchresult() throws IOException{
//            
//            try {
//                listFactures = FactureBusiness.RechercheFacture(search);
//            } catch (NullPointerException e) {
//                listFactures.clear();
//                ExternalContext context = FacesContext.getCurrentInstance().getExternalContext(); 
//                context.redirect("factures.xhtml");
//            }
// 
//        }
        
        public void rechercher() throws IOException{
            
            try{
                
                search = FacesContext.getCurrentInstance().
		getExternalContext().getRequestParameterMap().get("recherche");
                
                if(search.equals(" ") || search.equals("%") || search.equals("%%") || search.equals("%%%") || 
                        search.equals("%%%%") || search.equals("%%%%%")){
                    listFactures = FactureBusiness.RecupererList(Facture.class);
                    ExternalContext context = FacesContext.getCurrentInstance().getExternalContext(); 
                    context.redirect("ListeFactures.xhtml");
                }else{
                    listFactures = FactureBusiness.RechercheFacture(search);
                    ExternalContext context = FacesContext.getCurrentInstance().getExternalContext(); 
                    context.redirect("ListeFactures.xhtml");
                }
            } catch(NullPointerException e){
                listFactures.clear();
                ExternalContext context = FacesContext.getCurrentInstance().getExternalContext(); 
                context.redirect("ListeFactures.xhtml");
            }
        }
        
        
    @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse rep)
        throws ServletException, IOException{
            search = req.getParameter("search");
            //rep.getWriter().println(search);
            
            
            
            rep.sendRedirect("ListeFactures.xhtml?search="+search);
            
        }
}
