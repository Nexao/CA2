///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Facades;
//
//import java.util.List;
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
///**
// *
// * @author jarmo
// */
//public class PersonFacadeImp implements IPersonFacade {
//
//    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//    
//    
//    
//    public PersonFacadeImp(EntityManagerFactory emf) {
//        this.emf = emf;
//        }
//    
//    public EntityManager getEntityManager() 
//    {
//        return emf.createEntityManager();
//    }
//    
//    public PersonFacadeImp getPersonsInCity(String city, int zipCode) {
//        
//        
//        return null;
//    }
//    
//    @Override
//    public void addEntityManagerFactory(EntityManagerFactory emf) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Person addPerson(Person p) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Person deletePerson(int id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Person getPerson(int id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public List<Person> getPersons() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Person editPerson(Person p) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//    
//    
////    
//    
//    
//    
//    
//    
//}
