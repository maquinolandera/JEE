/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psiquiatrico;

import java.io.Serializable;

/**
 *
 * @author Fran
 */
public class PacienteEnfermedades implements Serializable {
    private Paciente paci;
    private String medicacion = "";
    private String enfermedad = "";
    
    
    public PacienteEnfermedades()
    {
        
    }
    public PacienteEnfermedades(Paciente paci, String medicacion,String enfermedad)
    {
        
        this.paci = paci;
        this.medicacion = medicacion;
        this.enfermedad = enfermedad;
      
    }

    /**
     * @return the paci
     */
    public Paciente getPaci() {
        return paci;
    }

    /**
     * @param paci the paci to set
     */
    public void setPaci(Paciente paci) {
        this.paci = paci;
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
     * @return the enfermedad
     */
    public String getEnfermedad() {
        return enfermedad;
    }

    /**
     * @param enfermedad the enfermedad to set
     */
    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    /**
     * @return the enfermedad
     */
   
}
