package Scr;


import Scr.Servicios;
import Scr.Urls;
import java.util.ArrayList;
import java.util.List;
import java.lang.*;
import java.util.Iterator;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author Fran
 */
public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*****************Web Scrapping LimaBot**********************");
        System.out.println("Menú..");
        System.out.println("1.-Búsqueda en google");
        System.out.println("2.-Insertar Links");
        
        Scanner scanner = new Scanner(System.in);
        String op = scanner.nextLine();
        Servicios serv = new Servicios();
        Urls link = new Urls();
        CharSequence https = "https://";
        CharSequence tube = "youtube.com";
        CharSequence var = "YouTube";
        CharSequence var2 = "google";
     
        switch(op)
        {
            case "1":
                //serv.borrarDatos();
                  System.setProperty("webdriver.gecko.driver", "lib/geckodriver.exe");
                 WebDriver web = new FirefoxDriver();
                 
                System.out.println("Introduce busqueda  ");
                String busqueda = scanner.nextLine();
                
                
                String url = "https://www.google.es/search?source=hp&ei=h1nKWtHPKYaVUcPMv_gN&q="+busqueda+"&oq="+busqueda+"&gs_l=psy-ab.3...2588.3525.0.3735.6.5.0.0.0.0.0.0..1.0....0...1.1.64.psy-ab..5.1.269.6..35i39k1.270.KcSBN4WlHlU";
                web.get(url);
                
                List <WebElement>listaUrls = web.findElements(By.tagName("a"));
                
                for(WebElement lista: listaUrls)
                {
//               System.out.println(lista.getText());
//               System.out.println(lista.getAttribute("href"));
                    link.setTitulo(lista.getText());
                    
                    
                    if(lista.getText().equals("") || lista.getAttribute("href")==null || lista.getText().equals("Maps") || lista.getText().contains(var) )
                    {
                        System.out.println("nulo o vacío");
                        
                    }else
                    {
                        link.setUrl(lista.getAttribute("href"));
                        System.out.println(link.getUrl()) ;
                        serv.altaUrl(link);
                        
                        
                    }
                    
                    
                     
                }
                op = "2";
               
            case "2":
                System.out.println("Consultar la base de datos url? S/N");
                String sino = scanner.nextLine();
                if(sino.equals("s"))
                {
                    List<Urls> consulta = serv.consultaDatos();
                    Iterator it = consulta.iterator();
                    System.setProperty("webdriver.gecko.driver", "lib/geckodriver.exe");
                    web = new FirefoxDriver();
                    while(it.hasNext())
                    {
                        Urls listado = (Urls) it.next();
                        System.out.println(listado.getTitulo());
                        System.out.println(listado.getUrl());
                        
                        
                        web.get(listado.getUrl());
                        List <WebElement>listaUrls2 = web.findElements(By.tagName("a"));
                        UrlsFiltro fil = new UrlsFiltro();
                        for(WebElement linkeado : listaUrls2)
                        {
                            try
                            {
                                if(linkeado.getAttribute("href").contains(https) && !linkeado.getText().equals("")  )
                                {
                                    System.out.println(linkeado.getText());
                                    fil.setTitulo(linkeado.getText());
                                    
                                    fil.setUrl(linkeado.getAttribute("href"));
                                    serv.altaUrl(fil);
                                }else
                                {
                                    System.out.println("url incorrecta");
                                }
                                
                            }catch(NullPointerException e   )
                            {
                                e.printStackTrace();
                            }catch(StaleElementReferenceException f)
                            {
                                f.printStackTrace();
                            }
                        }
                        
                        
                    }
                }}
    }}
