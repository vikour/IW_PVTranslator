/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.a6.ws;

import es.uma.a6.beans.CampañaFacade;
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
@WebService(serviceName = "WSPV_Translator")
@Stateless()
public class WSPV_Translator {

    @EJB
    private ModuloFacade ejbRefModulo;// Add business logic below. (Right-click in editor and choose
    
    @EJB
    private CampañaFacade ejbRefCampanya;
    // "Insert Code > Add Web Service Operation")

    
 /*
    Modulo methods
 */
    
    @WebMethod(operationName = "createModulo")
    @Oneway
    public void createModulo(@WebParam(name = "entity") Modulo entity) {
        ejbRefModulo.create(entity);
    }

    @WebMethod(operationName = "editModulo")
    @Oneway
    public void editModulo(@WebParam(name = "entity") Modulo entity) {
        ejbRefModulo.edit(entity);
    }

    @WebMethod(operationName = "removeModulo")
    @Oneway
    public void removeModulo(@WebParam(name = "entity") Modulo entity) {
        ejbRefModulo.remove(entity);
    }

    @WebMethod(operationName = "findModulo")
    public Modulo findModulo(@WebParam(name = "id") Object id) {
        return ejbRefModulo.find(id);
    }

    @WebMethod(operationName = "findAllModulo")
    public List<Modulo> findAllModulo() {
        return ejbRefModulo.findAll();
    }

    @WebMethod(operationName = "findAllModuloOrderedByName")
    public List<Modulo> findAllModuloOrderedByName() {
        return ejbRefModulo.findAllOrderedByName();
    }

    @WebMethod(operationName = "findAllModuloOrderedByAlpha")
    public List<Modulo> findAllModuloOrderedByAlpha() {
        return ejbRefModulo.findAllOrderedByAlpha();
    }

    @WebMethod(operationName = "findAllModuloOrderedByBeta")
    public List<Modulo> findAllModuloOrderedByBeta() {
        return ejbRefModulo.findAllOrderedByBeta();
    }

    @WebMethod(operationName = "findAllModuloOrderedByKappa")
    public List<Modulo> findAllModuloOrderedByKappa() {
        return ejbRefModulo.findAllOrderedByKappa();
    }

    @WebMethod(operationName = "findAllModuloOrderedByGamma")
    public List<Modulo> findAllModuloOrderedByGamma() {
        return ejbRefModulo.findAllOrderedByGamma();
    }

    @WebMethod(operationName = "findModuloByCampa\u00f1a")
    public Modulo findModuloByCampaña(@WebParam(name = "c") Campaña c) {
        return ejbRefModulo.findModuloByCampaña(c);
    }

    @WebMethod(operationName = "findModuloByNombre")
    public Modulo findModuloByNombre(@WebParam(name = "nombre") String nombre) {
        return ejbRefModulo.findModuloByNombre(nombre);
    }
    
/*
    Campanya methods
*/
    
    @WebMethod(operationName = "createCampanya")
    @Oneway
    public void createCampanya(@WebParam(name = "entity") Campaña entity) {
        ejbRefCampanya.create(entity);
    }

    @WebMethod(operationName = "editCampanya")
    @Oneway
    public void editCampanya(@WebParam(name = "entity") Campaña entity) {
        ejbRefCampanya.edit(entity);
    }

    @WebMethod(operationName = "removeCampanya")
    @Oneway
    public void removeCampanya(@WebParam(name = "entity") Campaña entity) {
        ejbRefCampanya.remove(entity);
    }

    @WebMethod(operationName = "findCampanya")
    public Campaña findCampanya(@WebParam(name = "id") Object id) {
        return ejbRefCampanya.find(id);
    }

    @WebMethod(operationName = "findAllCampanya")
    public List<Campaña> findAllCampanya() {
        return ejbRefCampanya.findAll();
    }


    @WebMethod(operationName = "findAllCampanyaOrderedByName")
    public List<Campaña> findAllCampanyaOrderedByName() {
        return ejbRefCampanya.findAllOrderedByName();
    }

    @WebMethod(operationName = "findAllCampanyaOrderedByDateAsc")
    public List<Campaña> findAllCampanyaOrderedByDateAsc() {
        return ejbRefCampanya.findAllOrderedByDateAsc();
    }

    @WebMethod(operationName = "findAllCampanyaOrderedByDateDesc")
    public List<Campaña> findAllCampanyaOrderedByDateDesc() {
        return ejbRefCampanya.findAllOrderedByDateDesc();
    }

    @WebMethod(operationName = "findCampanyaByModulo")
    public List<Campaña> findCampanyaByModulo(@WebParam(name = "m") Modulo m) {
        return ejbRefCampanya.findByModulo(m);
    }
    
}
