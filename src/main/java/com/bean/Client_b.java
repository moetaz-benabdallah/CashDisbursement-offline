/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import com.business.ClientBusiness;
import com.businessImp.ClientBusinessimpl;
import com.dao.imp.ClientDaoImp;
import com.model.Client;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author mo3
 */
@ManagedBean
@ViewScoped
public class Client_b implements Serializable {

    private String parName;
    private String adresse;
    private String parRefe;
    private String parRefRxt;
    
    public static Client selectedClient;
    public List<Client> listClients = new ArrayList<Client>();
    Client client = new Client();
    ClientBusinessimpl clientBusiness = new ClientBusinessimpl();

    public Client_b() {
        listClients = getList();
    }

    public static Client getSelectedClient() {
        return selectedClient;
    }

    public static void setSelectedClient(Client selectedClient) {
        Client_b.selectedClient = selectedClient;
    }

    public List<Client> getListClients() {
        return listClients;
    }

    public void setListClients(List<Client> listClients) {
        this.listClients = listClients;
    }
    
    

    public String getParName() {
        return parName;
    }

    public void setParName(String parName) {
        this.parName = parName;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getParRefe() {
        return parRefe;
    }

    public void setParRefe(String parRefe) {
        this.parRefe = parRefe;
    }

    public String getParRefRxt() {
        return parRefRxt;
    }

    public void setParRefRxt(String parRefRxt) {
        this.parRefRxt = parRefRxt;
    }

    public void ajout_client() {

        

//        client.setAdresse(adresse);
//        client.setParName(parName);
//        client.setParRefRxt(parRefRxt);
//        client.setParRefe(parRefe);

        clientBusiness.ajouter(client);

        FacesContext facesContext = FacesContext.getCurrentInstance();
        FacesMessage facesMessage = new FacesMessage("Info", "Client ajoutée avec succès !");
        facesMessage.setSeverity(FacesMessage.SEVERITY_INFO);
        facesContext.addMessage(null, facesMessage);
    }
    
    public void supprimer_client() {

        clientBusiness.supprimer(selectedClient);
        listClients.remove(selectedClient);
    }
    
    public void OnEdit_client(RowEditEvent event) {

        clientBusiness.modifier((Client) event.getObject());

        FacesContext facesContext = FacesContext.getCurrentInstance();
        FacesMessage facesMessage = new FacesMessage("Info", "Client modifiée avec succès !");
        facesMessage.setSeverity(FacesMessage.SEVERITY_INFO);
        facesContext.addMessage(null, facesMessage);
    }
    
    public void On_Cancel_theme() {

        FacesContext facesContext = FacesContext.getCurrentInstance();
        FacesMessage facesMessage = new FacesMessage("Info", "Modifications annulées !");
        facesMessage.setSeverity(FacesMessage.SEVERITY_INFO);
        facesContext.addMessage(null, facesMessage);
    }
    
    private List<Client> getList() {

        List list = clientBusiness.RecupererList(Client.class);

        return list;
    }

}
