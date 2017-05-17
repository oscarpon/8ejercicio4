/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8ejercicio4;

/**
 *
 * @author Usuario
 */
public class Extintor {
    
      private int numReferencia;
      private char tipo;
      private double precio;
     private String fechaTimbrado;
     
      public Extintor(int n, char t, double p, String f){
        numReferencia=n;
        tipo=t;
        precio=p;
        fechaTimbrado=f;
    }
    public int getNumReferencia(){
          return numReferencia;
    }
    public char getTipo(){
        return tipo;
}
    public double getPrecio(){
        return precio;
    }
    public String getFechaTimbrado(){
        return fechaTimbrado;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setFechaTimbrado(String fechaTimbrado) {
        this.fechaTimbrado = fechaTimbrado;
    }
    
    
    
}
