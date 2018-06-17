package rrhh;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Fran
 */
@Entity
public class Nomina implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private int id = 0;
    private double bruto = 0;
    private final double irpfGrande = 0.15;
    private final double irpfPequeño = 0.9;
    private final double ssooG = 0.10;
    private final double ssooP = 0.6;
    private double neto = 0;
    private int categoria = 0;
    private String cargo = "";
    private int anyo = 0 ;
   @ManyToOne
    private Empleado empl;

    /**
     * @return the bruto
     */
    public Nomina()
    {
        
    }
    public Nomina(Empleado empl, int categoria,String cargo,int anyo)
    {
        this.empl = empl;
        this.categoria = categoria;
        this.cargo = cargo;
        this.anyo = anyo;
    }
    
    public double getBruto() {
        if(this.cargo.equals("Ingeniero"))
        {
            this.bruto = 2000;
        }else if(this.cargo.equals("Administrativo"))
        {
            this.bruto = 1200;
        }else if(this.cargo.equals("Autonomo"))
        {
            this.bruto = 2500;
        }
        if (this.categoria >2)
        {
            this.bruto = this.bruto + 500;
        }
        return this.bruto;
    }

    /**
     * @param bruto the bruto to set
     */
  

    /**
     * @return the irpfGrande
     */
    public double getIrpfGrande() {
        return irpfGrande;
    }

    /**
     * @return the irpfPequeño
     */
    public double getIrpfPequeño() {
        return irpfPequeño;
    }

    /**
     * @return the ssooG
     */
    public double getSsooG() {
        return ssooG;
    }

    /**
     * @return the ssooP
     */
    public double getSsooP() {
        return ssooP;
    }

    /**
     * @return the neto
     */
    public double getNeto() {
        
        return neto;
    }

    /**
     * @param neto the neto to set
     */
  

    /**
     * @return the categoria
     */
    public int getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
  

    /**
     * @return the cargo
     */
    public String getCargo() {
        
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the empl
     */
    public Empleado getEmpl() {
        return empl;
    }

    /**
     * @param empl the empl to set
     */
    public void setEmpl(Empleado empl) {
        this.empl = empl;
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
     * @return the anyo
     */
    public int getAnyo() {
        return anyo;
    }

    /**
     * @param anyo the anyo to set
     */
    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    /**
     * @param bruto the bruto to set
     */
    public void setBruto(double bruto) {
        this.bruto = bruto;
    }

    /**
     * @param neto the neto to set
     */
    public void setNeto(double bruto) {
        if (bruto >2000)
        {
           double sinIva =  bruto - (bruto * this.irpfGrande);
            bruto = sinIva -(sinIva * this.ssooG);
        
        }else
        {
           double sinIva = bruto - (bruto * this.irpfPequeño);
            bruto = sinIva -(sinIva * this.ssooG);
           
        }
        this.neto = bruto;
    }
    
    
}
