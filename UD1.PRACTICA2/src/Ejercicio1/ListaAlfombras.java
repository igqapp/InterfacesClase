/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.ArrayList;

/**
 *
 * @author ivangq
 */
public class ListaAlfombras {
    
    ArrayList<Alfombra> lista;

    public ListaAlfombras() {
        lista=new ArrayList();
    }
    
    public int size(){
        return lista.size();
    }
    
    public Alfombra getAlfombra(int index){
        return lista.get(index);
    }
    
    public Alfombra getAlfombra(String modelo){
        for (Alfombra alfombra : lista) {
            if(alfombra.getMod().equals(modelo))
                return alfombra;
        }
        return null;
    
    }
    
    
    public boolean addAlfombra(Alfombra a){
        if (lista.contains(a))
            return false;
        else{
            lista.add(a);
            return true;
        }
    }
    
    public Alfombra last(){
        return lista.get(-1);
    }
    
    
    public boolean eliminarAlfombra(Alfombra a){
        if(lista.contains(a))
            lista.remove(a);
        else
            return false;
        return true;    
    }
    
    
    public void limpiarLista(){
        lista.removeAll(lista);   
    }
}
