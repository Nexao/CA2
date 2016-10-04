/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Diana
 */
public class CompanyFacade implements ICompanyFacade{
    
    EntityManagerFactory emf;

    @Override
    public void addEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }
    
}
