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
    public class AlmacenExtintores {
    
   private Extintor[] almacen;
   
   public AlmacenExtintores(int numExtintores){
   int tamMaximo=numExtintores+ numExtintores*(10/100);
   almacen=new Extintor[tamMaximo];
}
    private int funcionHashing(int numRefer){
        return numRefer%almacen.length;
    }  
    public void insertarExtintor(Extintor ext){
    int posicion = funcionHashing (ext.getNumReferencia());
    
    if (almacen[posicion]== null ){
        almacen[posicion]= ext;
    }
    else{
        int dirReh=(posicion+1)%almacen.length;
        if (almacen[dirReh] == null)
        {
          almacen[dirReh]= ext;
        }
    }
   
    
}
public Extintor buscarExtintor (int numRefer){
    int posicion = funcionHashing(numRefer);
    
    if (almacen[posicion].equals(numRefer)){
        return almacen[posicion];
    }
    else{
      int dirReh=(posicion+1)%almacen.length;  
      while (!almacen[dirReh].equals(numRefer) && !almacen[dirReh].equals(0) && (dirReh != posicion)){
          dirReh = (dirReh+1)%almacen.length;
      }
      if (almacen[dirReh].equals(numRefer)){
          return almacen[dirReh];
      }
      else{
          return null;
      }
    }
}
}
