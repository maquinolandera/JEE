/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psiquiatrico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fran
 */
public class Psiquiatrico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("1.-Alta paciente");
        System.out.println("2.- Baja paciente");
        System.out.println("3.- Consulta paciente");
        System.out.println("4.- Modificación paciente");
        System.out.println("\n opción");
        
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        int opcion = entrada.nextInt();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        PacienteBO objBo = new PacienteBO();
        switch(opcion)
        {
            case 1:
                System.out.println(" Introduce nombre paciente ");
                String nombre = entrada2.nextLine();
                System.out.println(nombre);
                System.out.println(" Introduce apellido ");
                String apellido = entrada2.nextLine();
                System.out.println(" Introduce fecha alta");
                String fechaString = entrada2.nextLine();
              
                System.out.println(" Introduce Peligrosidad ");
                int peligrosidad = entrada.nextInt();
                
                System.out.println("Introduce patología mental");
                String enfermedad = entrada2.nextLine();
                System.out.println("Tipo de medicación");
                String medicacion = entrada2.nextLine();
                
               
                
                
        
            try {
                Date fecha = (Date) s.parseObject(fechaString);
              
                
                boolean ok =  objBo.AltaPaciente(nombre, apellido, fecha, peligrosidad, enfermedad, medicacion);
                if (ok)
                {
                    System.out.println("PACIENTE DADO DE ALTA");
                    
                }else
                {
                    System.out.println("NO SE HA DADO DE ALTA ERROR");
                }
            } catch (ParseException ex) {
                Logger.getLogger(Psiquiatrico.class.getName()).log(Level.SEVERE, null, ex);
            }
            break;
            
            case 2:
                System.out.println(" Introduce número id a borrar ");
                int borrar = entrada.nextInt();
                objBo.darDeBaja(borrar);
            break;
            
            case 3:
                objBo.consultaDatos();
                
            break;
            case 4:
                System.out.println(" Introduce la id a modificar");
                int id = entrada.nextInt();
                System.out.println(" Introduce el nuevo nombre ");
                String nombreNuevo = entrada2.nextLine();
                objBo.modificarDatos(id,nombreNuevo);
                
        }
    }
    
}
