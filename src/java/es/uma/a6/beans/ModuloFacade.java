/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.a6.beans;

import es.uma.a6.entity.Campaña;
import es.uma.a6.entity.Modulo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Carlos
 */
@Stateless
public class ModuloFacade extends AbstractFacade<Modulo> {

    @PersistenceContext(unitName = "A6servidorSOAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ModuloFacade() {
        super(Modulo.class);
    }
    
    public List<Modulo> findAllOrderedByName(){
        Query q = em.createQuery("SELECT m FROM Modulo m ORDER BY m.nombre ASC");
        return q.getResultList();
    }
    
    public List<Modulo> findAllOrderedByAlpha(){
        Query q = em.createQuery("SELECT m FROM Modulo m ORDER BY m.alpha");
        return q.getResultList();
    }
    
    public List<Modulo> findAllOrderedByBeta(){
        Query q = em.createQuery("SELECT m FROM Modulo m ORDER BY m.beta");
        return q.getResultList();
    }
    
    public List<Modulo> findAllOrderedByKappa(){
        Query q = em.createQuery("SELECT m FROM Modulo m ORDER BY m.kappa");
        return q.getResultList();
    }
    
    public List<Modulo> findAllOrderedByGamma(){
        Query q = em.createQuery("SELECT m FROM Modulo m ORDER BY m.gamma");
        return q.getResultList();
    }
    
    public Modulo findModuloByCampaña(Campaña c){
        Query q = em.createQuery("SELECT m FROM Modulo m WHERE :cm=m");
        q.setParameter("cm", c.getModulo());
        
        List<Modulo> lista = q.getResultList();
        if(lista.size()>0){
            return lista.get(0);
        }else{
            return null;
        }
    }
    
    public Modulo findModuloByNombre(String nombre){
        Query q = em.createQuery("SELECT m FROM Modulo m WHERE :n=m.nombre");
        q.setParameter("n", nombre);
        
        List<Modulo> lista = q.getResultList();
        if(lista.size()>0){
            return lista.get(0);
        }else{
            return null;
        }
    }
    
    
}
