/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Fran
 */
@Entity(name = "urlsFiltro")

public class UrlsFiltro implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private  int id = 0;
    private String titulo = "";
    private String url = "";
    
    UrlsFiltro()
    {
        
    }
    UrlsFiltro(String titulo, String url)
    {
        this.titulo = titulo;
        this.url = url;
    }

    

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
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
    
    
}

