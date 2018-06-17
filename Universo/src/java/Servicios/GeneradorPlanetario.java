/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Servicios;

import SistemaSolar.Planeta;
import SistemaSolar.Sistema;
import SistemaSolar.Sol;

/**
 *
 * @author Fran
 */


public class GeneradorPlanetario {
    
   public GeneradorPlanetario(){}
   
    
    public Sistema generarSistema()
    {
        
        int max = 7000;
        int min = -200;
        Sistema sistema = new Sistema();
       
        for(int j = 0; j<100 ; j++)
        {
            int dinamicSize = (int)Math.floor(Math.random()*(10));
            char [] asc = new char [dinamicSize];
            
            for(int i = 0; i<dinamicSize; i++)
            {
                char caracter = (char)Math.floor(Math.random()*(127-1)+1);
                asc[i] = caracter;
                
                
            }
            String nombre = String.valueOf(asc);
            sistema.setNombre(nombre);
            int booleando = (int)Math.floor(Math.random()*(2));
            boolean verdad = false;
            
            if(booleando == 1)
            {
                verdad = true;
            }else if (booleando == 0)
            {
                verdad = false;
            }
            int temperatura = (int)Math.floor(Math.random()*(max - min )+min);
            try
            {
                
                if(temperatura >= 5000)
                {
                    Sol sol = new Sol(nombre,temperatura);
                    
                    sistema.setEstrella(sol);
                   
                    return sistema;
                   
                    
                    
                    
                    
                }else
                {
                    Planeta planeta = new Planeta(nombre,verdad,verdad,verdad,temperatura);
                   
                    sistema.setPlanetas(planeta);
                   
                    
                    
                }
                
            }catch(Exception e)
            {
                
            }
            
           
       }
       
        return sistema;
        
    }

    /**
     * @return the a
     */
  
}
