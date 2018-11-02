/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.a6.ws;

import es.uma.a6.beans.CampañaFacade;
import es.uma.a6.entity.Campaña;
import es.uma.a6.entity.Modulo;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Carlos
 */
@WebService(serviceName = "WS_Campanya")
@Stateless()
public class WS_Campanya {

    @EJB
    private CampañaFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") Campaña entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Campaña entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") Campaña entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Campaña find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Campaña> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Campaña> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findAllOrderedByName")
    public List<Campaña> findAllOrderedByName() {
        return ejbRef.findAllOrderedByName();
    }

    @WebMethod(operationName = "findAllOrderedByDateAsc")
    public List<Campaña> findAllOrderedByDateAsc() {
        return ejbRef.findAllOrderedByDateAsc();
    }

    @WebMethod(operationName = "findAllOrderedByDateDesc")
    public List<Campaña> findAllOrderedByDateDesc() {
        return ejbRef.findAllOrderedByDateDesc();
    }

    @WebMethod(operationName = "findByModulo")
    public List<Campaña> findByModulo(@WebParam(name = "m") Modulo m) {
        return ejbRef.findByModulo(m);
    }
    
}
