/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaSolar;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



/**
 *
 * @author Fran
 */
@Entity  
public class Planeta implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id = 0;
    private String nombre = "";
   
    private boolean tieneAgua;
    private boolean tieneOxigeno;
    private boolean habitado; 
    private int temperatura = 0;
   
    
    public Planeta()
    {
        
    }
    public Planeta(String nombre, boolean tieneAgua,boolean tieneOxigeno, boolean habitado,int temperatura)
    {
        this.nombre = nombre;
 
        this.tieneAgua = tieneAgua;
        this.tieneOxigeno = tieneOxigeno;
        this.habitado = habitado;
        this.temperatura = temperatura;
        
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

    /**
     * @return the distanciaEstrella
     */


    /**
     * @return the tieneAgua
     */
    public boolean isTieneAgua() {
        return tieneAgua;
    }

    /**
     * @param tieneAgua the tieneAgua to set
     */
    public void setTieneAgua(boolean tieneAgua) {
        this.tieneAgua = tieneAgua;
    }

    /**
     * @return the tieneOxigeno
     */
    public boolean isTieneOxigeno() {
        return tieneOxigeno;
    }

    /**
     * @param tieneOxigeno the tieneOxigeno to set
     */
    public void setTieneOxigeno(boolean tieneOxigeno) {
        this.tieneOxigeno = tieneOxigeno;
    }

    /**
     * @return the habitado
     */
    public boolean isHabitado() {
        return habitado;
    }

    /**
     * @param habitado the habitado to set
     */
    public void setHabitado(boolean habitado) {
        this.habitado = habitado;
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
     * @return the temperatura
     */
    public int getTemperatura() {
        return temperatura;
    }

    /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * @return the sistema
     */
   
    
    
}
