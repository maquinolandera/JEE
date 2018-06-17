/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaSolar;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.persistence.Entity;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author Fran
 */

  
 @Entity   
public class Sistema implements Serializable  {
@Id
        @GeneratedValue(strategy=GenerationType.AUTO)
    @Access(value=AccessType.FIELD)
    private int id = 0;
    private String nombre = "";
   
    @OneToOne
    private Planeta planeta;
    
    @OneToOne
    private Sol sol;
    //eager = carga ansiosa
    
    
    @OneToMany(targetEntity = Planeta.class,  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Planeta> planetas;
    //eager = carga ansiosa
   
    @OneToMany(targetEntity = Sol.class,  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    
    
    private List<Sol> Estrella;
    
   
   public Sistema()
   {
        this.Estrella = new ArrayList <Sol>();
        this.planetas = new ArrayList <Planeta>();
       
   }
   
    
   public Sistema(Planeta planeta)
    {
        this.Estrella = new ArrayList <Sol>();
        this.planetas = new ArrayList <Planeta>();
        this.planeta = planeta;
        
    }
    public Sistema(Sol sol)
    {
        this.Estrella = new ArrayList <Sol>();
        this.planetas = new ArrayList <Planeta>();
        this.sol = sol;
    }


    /**
     * @return the planeta
     */
    public Planeta getPlaneta() {
        return planeta;
    }

    /**
     * @param planeta the planeta to set
     */
    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

    /**
     * @return the sol
     */
    public Sol getSol() {
        return sol;
    }

    /**
     * @param sol the sol to set
     */
    public void setSol(Sol sol) {
        this.sol = sol;
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
     * @return the planetas
     */
    public List<Planeta> getPlanetas() {
        return planetas;
    }

    /**
     * @param planetas the planetas to set
     */
    public void setPlanetas(Planeta planetas) {
        this.planetas.add(planetas);
    }

    /**
     * @return the Estrella
     */
    public List<Sol> getEstrella() {
        return Estrella;
    }

    /**
     * @param Estrella the Estrella to set
     */
    public void setEstrella( Sol e) {
        this.Estrella.add(e);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
