/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprojectah3;

import java.util.LinkedList;

/**
 *
 * @author LuikFear
 */
public class ClientsList {
     static LinkedList<ClientsList> List = new LinkedList<> ();

           private int codigo;
           private String Nombre;
           private int NIT;
           private String Correo;
           private String Genero;

    public ClientsList(int codigo, String Nombre, int NIT, String Correo, String Genero) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.NIT = NIT;
        this.Correo = Correo;
        this.Genero = Genero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
           
           
          
           
           
           
}
