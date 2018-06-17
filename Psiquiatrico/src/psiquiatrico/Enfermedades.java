/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psiquiatrico;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;



/**
 *
 * @author Fran
 */
@Entity


public class Enfermedades implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private int id = 0;
    private String nombreEnfermedad = "";
    private String medicacion = "";
    
    
    
    
    @ManyToOne
    
    private Paciente paciente;
  
    public Enfermedades()
    {
        
    }
    public Enfermedades(String nombreEn, String medicacion,Paciente paciente)
    {
        this.nombreEnfermedad = nombreEn;
        this.medicacion = medicacion;
        this.paciente = paciente;
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

    /**
     * @return the nombreEnfermedad
     */
    public String getNombreEnfermedad() {
        return nombreEnfermedad;
    }

    /**
     * @param nombreEnfermedad the nombreEnfermedad to set
     */
    public void setNombreEnfermedad(String nombreEnfermedad) {
        this.nombreEnfermedad = nombreEnfermedad;
    }

    /**
     * @return the medicacion
     */
    public String getMedicacion() {
        return medicacion;
    }

    /**
     * @param medicacion the medicacion to set
     */
    public void setMedicacion(String medicacion) {
        this.medicacion = medicacion;
    }

    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the paciente_id
     */

    
}
