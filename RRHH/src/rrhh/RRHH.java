/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rrhh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Fran
 */
public class RRHH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        System.out.println("1.-Alta de empleados");
        System.out.println("2.-Consulta Ingenieros");
        System.out.println("3.-Consulta Administrativos");
        System.out.println("4.-Consulta Autonomos");
        
        System.out.println("\n opcion");
        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();
        EmpleadosBO emplBO = new EmpleadosBO();
        
        if (opcion == 1)
        {
        for(int i = 0; i<100 ; i++)
        {
         String nombres [] = {"Nugro","Genhro","Miatos","Cergulino","Mit324 Macho","Fronsote","Buroboyo","Sminfronote"};
         int c = (int)Math.floor(Math.random()*(7));
         String nom = nombres[c];
         String apellidos [] = {"Fiderson","Orfiberson","McErrilson","Kiberson","Smithenson","Bullaranganson","Numinfenson"};
         int d = (int)Math.floor(Math.random()*(7));
         String apell = apellidos[d];
         int categoria = (int)Math.floor(Math.random()*(4));
         SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
         Date fecha = (Date) s.parseObject("21-11-2014");
         String [] rama = {"Administrativo","Autonomo","Ingeniero"};
         int e = (int)Math.floor(Math.random()*(3));
         String ram = rama[e];
         int antiguedad = (int)Math.floor(Math.random()*(15));
            System.out.println(ram);
         if(ram.equals("Autonomo"))
         {
             Empleado empl = new Autonomos(nom,apell,categoria,fecha,ram,antiguedad);
            
             emplBO.insertarDatos(empl);
         }else if(ram.equals("Administrativo"))
         {
             Empleado empl = new Administrativo(nom,apell,categoria,fecha,ram,antiguedad);
             
             emplBO.insertarDatos(empl);
         }else if(ram.equals("Ingeniero"))
         {
             Empleado empl = new Ingeniero(nom,apell,categoria,fecha,ram,antiguedad);
             
             emplBO.insertarDatos(empl);
         }
        
        }
        
    }else if(opcion == 2)
    {
        String cargo = "Ingeniero";
        emplBO.consultarDatos(cargo);
    }else if(opcion == 3)
    {
        String cargo = "Administrativo";
        emplBO.consultarDatos(cargo);
    }else if(opcion == 4)
    {
        String cargo = "Autonomo";
        emplBO.consultarDatos(cargo);
    }
    
}
}