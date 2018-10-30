/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.a6.beans;

import es.uma.a6.entity.Campaña;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vikour
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
    
}
