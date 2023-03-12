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
public class ProductList {
    
    static LinkedList<ProductList> Stock = new LinkedList<> ();

           private int codigo;
           private String Nombre;
           private String Description;
           private int Cantidad;
           private int Precio;
          

        public ProductList (int codigo, String Nombre, String Description, int Cantidad, int Precio) {
            this.codigo = codigo;
            this.Nombre = Nombre;
            this.Description = Description;
            this.Cantidad = Cantidad;
            this.Precio = Precio;
          
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

  
        
        
        
        
        
        
}
