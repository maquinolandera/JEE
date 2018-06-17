/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlator;

import java.io.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




/**
 *
 * @author Fran
 */
public class Scrap {
    public WebDriver driver = new FirefoxDriver();
   
     public void abrirWeb()
     {
         driver.navigate().to("http://google.es");
         driver.get("http://google.es");
         
     }
    
}
