/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlator;

/**
 *
 * @author Fran
 */
public class UsuarioBean {
    private String nick = "";
    private String foto = "";
    private String edad = "";
    private String comentario = "";
    
    public UsuarioBean()
    {
        
    }
    public UsuarioBean(String n, String f, String e, String c)
    {
        this.nick = n;
        this.foto = f;
        this.edad = e;
        this.comentario = c;
    }

    /**
     * @return the nick
     */
    public String getNick() {
        return nick;
    }

    /**
     * @param nick the nick to set
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    public String mostrarResultados()
    {
       
        
       return  " Nombre Usuario: "+getNick()+" Edad: "+getEdad()+" Comentario: "+getComentario();
    }
    
}
