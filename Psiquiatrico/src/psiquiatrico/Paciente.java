/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psiquiatrico;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 *
 * @author Fran
 */
@Entity

public class Paciente implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
   
    private int id = 0;
   
   
    
    private String nombre = "";
    private String apellido = "";
  
    private Date fecha_alta;
    private  int peligrosidad = 0;
    
   
    
   
    @OneToMany(cascade=CascadeType.ALL , fetch=FetchType.EAGER,mappedBy = "paciente")
    
    private List <Enfermedades>enfermedades;

    /**
     * @return the nombre
     */
    public Paciente(){}
    public Paciente(String nombre, String apellido, Date fecha_alta, int peligrosidad) 
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_alta = fecha_alta;
        this.peligrosidad = peligrosidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the fecha_alta
     */
    public Date getFecha_alta() {
        return fecha_alta;
    }

    /**
     * @param fecha_alta the fecha_alta to set
     */
    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    /**
     * @return the peligrosidad
     */
    public int getPeligrosidad() {
        return peligrosidad;
    }

    /**
     * @param peligrosidad the peligrosidad to set
     */
    public void setPeligrosidad(int peligrosidad) {
        this.peligrosidad = peligrosidad;
    }

    /**
     * @return the enfermedades
     */
    public List<Enfermedades> getEnfermedades() {
        return enfermedades;
    }

    /**
     * @param enfermedades the enfermedades to set
     */
    
    public void setEnfermedades(List <Enfermedades>enfermedades) {
        this.enfermedades = enfermedades;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
