/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.businessImp;

import com.business.FactureBusiness;
import com.dao.imp.FactureDaoImp;
import com.model.Facture;
import java.util.List;

/**
 *
 * @author mo3
 */
public class FactureBusinessImp extends GeneriqueBusinessImp implements FactureBusiness{
    
    FactureDaoImp factDao = new FactureDaoImp();
    
    @Override
    public List<Object> RechercheFacture(String ref) {

        List result = factDao.ListeFactureClient(ref);

        return result;
    }
    
}
