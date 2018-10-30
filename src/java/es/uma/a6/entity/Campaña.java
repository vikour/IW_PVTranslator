/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.a6.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vikour
 */
@Entity
@Table(name = "CAMPA\u00d1A")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Campa\u00f1a.findAll", query = "SELECT c FROM Campa\u00f1a c")
    , @NamedQuery(name = "Campa\u00f1a.findByNombre", query = "SELECT c FROM Campa\u00f1a c WHERE c.nombre = :nombre")})
public class Campaña implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "NOMBRE")
    private String nombre;
    @JoinColumn(name = "MODULO", referencedColumnName = "NOMBRE")
    @ManyToOne(optional = false)
    private Modulo modulo;

    public Campaña() {
    }

    public Campaña(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombre != null ? nombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Campaña)) {
            return false;
        }
        Campaña other = (Campaña) object;
        if ((this.nombre == null && other.nombre != null) || (this.nombre != null && !this.nombre.equals(other.nombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.uma.a6.entity.Campa\u00f1a[ nombre=" + nombre + " ]";
    }
    
}
