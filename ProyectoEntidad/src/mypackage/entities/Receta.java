package mypackage.entities;

import java.util.Date;

public class Receta {
    private String codigo;
    private String nombre;
    private float precio;
    private char tipo;
    

    public Receta(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        
    }
    
   
    
    public void descuentoReceta(char tipo){
        
        this.tipo=tipo;
        
        if(tipo == 'A'){
            System.out.println("Se aplica descuento ya que su receta es de tipo A");
        }else{
            System.out.println("No se aplica descuento ya que su receta no es de tipo A");
        }      
        
    }
    public void precioFinalReceta(float monto){
        if(this.tipo=='A'){
            this.precio= (float) (monto-(monto*0.15));
            System.out.println("Su precio final es $"+precio);
            
        }else{
            this.precio=monto;
            System.out.println("Su precio final es $"+precio);
        }
                       
       
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public char getTipo() {
        return tipo;
    }
    
    public float getPrecio() {
        return precio;
    }

   

    @Override
    public String toString() {
        return " Receta{" + "codigo=" + codigo + ", nombre=" + nombre;
    }

    

}
