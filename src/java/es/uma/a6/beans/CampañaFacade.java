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
public class CampañaFacade extends AbstractFacade<Campaña> {

    @PersistenceContext(unitName = "A6servidorSOAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CampañaFacade() {
        super(Campaña.class);
    }
    
    
    
    public List<Campaña> findAllOrderedByName(){
        Query q = em.createQuery("SELECT c FROM Campaña c ORDER BY c.nombre ASC");
        return q.getResultList();
    }
    
    public List<Campaña> findAllOrderedByDateAsc(){
        Query q = em.createQuery("SELECT c FROM Campaña c ORDER BY c.fecha ASC");
        return q.getResultList();
    }
    
    public List<Campaña> findAllOrderedByDateDesc(){
        Query q = em.createQuery("SELECT c FROM Campaña c ORDER BY c.fecha DESC");
        return q.getResultList();
    }
    
    public List<Campaña> findByModulo(Modulo m){
        Query q = em.createQuery("SELECT c FROM Campaña c WHERE :m = c.modulo");
        q.setParameter("m", m);
        return q.getResultList();
    }
    
    
}
