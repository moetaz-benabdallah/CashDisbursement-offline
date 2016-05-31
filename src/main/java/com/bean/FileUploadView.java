/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import com.model.Facture;
import com.parsing.GetXmlFactures;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

@ManagedBean
public class FileUploadView {

    private UploadedFile file;
    private final String destination="C:/FacturesXML/import/";
    
    public List<Facture> listFactures = new ArrayList<Facture>();
    GetXmlFactures parsing = new GetXmlFactures();

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public List<Facture> getListFactures() {
        return listFactures;
    }

    public void setListFactures(List<Facture> listFactures) {
        this.listFactures = listFactures;
    }

    public GetXmlFactures getParsing() {
        return parsing;
    }

    public void setParsing(GetXmlFactures parsing) {
        this.parsing = parsing;
    }
    
    

    public void upload() throws ParseException {

        System.out.println("uploading");
        if (file != null) {
            System.out.println("the file is" + file);
            FacesMessage msg = new FacesMessage("Succesful" + file.getFileName() + " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, msg);

            try {
                copyFile(file.getFileName(), file.getInputstream());
                listFactures = parsing.ParseFacture(destination, file.getFileName());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("upload finished");
    }
    
    
    public void copyFile(String fileName, InputStream in) { 
        
        try {
            OutputStream out = new FileOutputStream(new File(destination + fileName)) ;
            int read = 0;
            byte[] bytes = new byte[1024];
            while ((read = in.read(bytes)) != -1) {
                out.write(bytes, 0, read);
            }
            in.close();
            out.flush();
        
    System.out.println("New file created!");
        
    }catch(IOException e){
        System.out.println(e.getMessage());
    }
}
    
}
