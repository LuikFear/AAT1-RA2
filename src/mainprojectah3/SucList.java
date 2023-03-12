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
public class SucList {
    static LinkedList<SucList> Ad = new LinkedList<> ();

           private int Codigo;
           private String Nombre;
           private String Direccion;
           private String Correo;
           private int Telefono;

           
           
           
           
    public SucList(int Codigo, String Nombre, String Direccion, String Correo, int Telefono) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Telefono = Telefono;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
}
