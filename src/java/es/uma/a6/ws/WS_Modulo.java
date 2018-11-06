/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.a6.ws;

import es.uma.a6.beans.ModuloFacade;
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
@WebService(serviceName = "WS_Modulo")
@Stateless()
public class WS_Modulo {

    @EJB
    private ModuloFacade ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "entity") Modulo entity) {
        ejbRef.create(entity);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "entity") Modulo entity) {
        ejbRef.edit(entity);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "entity") Modulo entity) {
        ejbRef.remove(entity);
    }

    @WebMethod(operationName = "find")
    public Modulo find(@WebParam(name = "id") Object id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Modulo> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Modulo> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }

    @WebMethod(operationName = "findAllOrderedByName")
    public List<Modulo> findAllOrderedByName() {
        return ejbRef.findAllOrderedByName();
    }

    @WebMethod(operationName = "findAllOrderedByAlpha")
    public List<Modulo> findAllOrderedByAlpha() {
        return ejbRef.findAllOrderedByAlpha();
    }

    @WebMethod(operationName = "findAllOrderedByBeta")
    public List<Modulo> findAllOrderedByBeta() {
        return ejbRef.findAllOrderedByBeta();
    }

    @WebMethod(operationName = "findAllOrderedByKappa")
    public List<Modulo> findAllOrderedByKappa() {
        return ejbRef.findAllOrderedByKappa();
    }

    @WebMethod(operationName = "findAllOrderedByGamma")
    public List<Modulo> findAllOrderedByGamma() {
        return ejbRef.findAllOrderedByGamma();
    }

    @WebMethod(operationName = "findModuloByCampa\u00f1a")
    public Modulo findModuloByCampaña(@WebParam(name = "c") Campaña c) {
        return ejbRef.findModuloByCampaña(c);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findModuloByNombre")
    public Modulo findModuloByNombre(@WebParam(name = "nombre") String nombre) {
        return ejbRef.findModuloByNombre(nombre);
    }
    
}
