/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parsing;

import com.model.Client;
import com.model.Compte_Client;
import com.model.Contrat;
import com.model.Facture;
import com.model.Vocabulaire;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author mo3
 */
public class GetXmlFactures {
    
    
    public List<Facture> ParseFacture(String path, String fileName) throws ParseException{
        List<Facture> factList = new ArrayList<Facture>();
        String filePath = path+fileName;
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("Facture");
            //now XML is loaded as Document in memory, lets convert it to Object List
            
            for (int i = 0; i < nodeList.getLength(); i++) {
                factList.add(getFacture(nodeList.item(i)));
            }
         
        } catch (SAXException | ParserConfigurationException | IOException e1) {
            e1.printStackTrace();
        }
        
        return factList;
    }
    
    
    private Facture getFacture(Node node) throws ParseException {
        //XMLReaderDOM domReader = new XMLReaderDOM();
        Facture fact = new Facture();
        Client cl = new Client();
        Compte_Client cc = new Compte_Client();
        Contrat contr = new Contrat();
        Vocabulaire voc = new Vocabulaire();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
        
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;

            fact.setId(Long.parseLong(getTagValue("id", element)));
            fact.setRef_fact(getTagValue("ref_fact", element));
            fact.setId_organisation(Integer.parseInt(getTagValue("id_organisation", element)));
            
            cl.setId(Long.parseLong(getTagValue("client_fact", element)));
            fact.setClient_fact(cl);
            
            fact.setAdresse_fact(getTagValue("adresse_fact", element));
            
            Date d1 = format.parse(getTagValue("date_offic_fact", element));
            fact.setDate_offic_fact(d1);
            
            Date d2 = format.parse(getTagValue("date_exig_fact", element));
            fact.setDate_exig_fact(d2);
            
            Date d3 = format.parse(getTagValue("date_edit_fact", element));
            fact.setDate_edit_fact(d3);
            
            fact.setMontant_fact(Float.parseFloat(getTagValue("montant_fact", element)));
            
            cc.setId(Long.parseLong(getTagValue("compte_c_fact", element)));
            fact.setCompte_c_fact(cc);
            
            fact.setDette_exoneree_fact(Integer.parseInt(getTagValue("dette_exoneree_fact", element)));
            
            fact.setMontant_enc_fact(Float.parseFloat(getTagValue("montant_enc_fact", element)));
            
            contr.setId(Long.parseLong(getTagValue("contrat_fact", element)));
            fact.setContrat_fact(contr);
            
            voc.setId(Long.parseLong(getTagValue("voc_fact", element)));
            fact.setVoc_fact(voc);
            
            fact.setDette_remboursable_fact(Integer.parseInt(getTagValue("dette_remboursable_fact", element)));
            
            fact.setNom_train_fact(getTagValue("nom_train_fact", element));
            fact.setEtape_actu_relance_fact(getTagValue("etape_actu_relance_fact", element));
        }
 
        return fact;
    }
    
        private String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }
    
}
