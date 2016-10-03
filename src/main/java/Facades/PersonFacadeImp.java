/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facades;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author jarmo
 */
public class PersonFacadeImp implements PersonFacade {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    
    
    
    public PersonFacadeImp(EntityManagerFactory emf) {
        this.emf = emf;
        }
    
    
    
    public PersonFacadeImp getPersonsInCity(String city, int zipCode) {
        
        
        return null;
    }
    
    public List<PersonFacadeImp> getPersons() {
    
        
        
        return null;
    }
    
    public PersonFacadeImp getPersonWithNumber(String pNumber) {
    return null;
    }
    
    public PersonFacadeImp getPersonsWithHobby(String hobby) {
    return null;
    }
    
    
    
}
