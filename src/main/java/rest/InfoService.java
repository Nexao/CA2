/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Emil
 */
@Path("person")
public class InfoService {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of InfoService
     */
    public InfoService() {
    }

    /**
     * Retrieves representation of an instance of rest.InfoService
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    @Path("contactinfo")
//    public String getContactInfo() {
//        //Person p1 = new Person();
//        //InfoEntity ie1 = new InfoEntity();
//        //AddressInfo ai1 = new AddressInfo();
//        
//        Object ob1 = new Object();
//        
//        ob1 = p1.getPersons()
//        return null;
//    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
