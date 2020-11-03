/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author ivang
 */
public class ListaProvincias {
    private  ArrayList<Provincia> lista;
    private final String LUGO = "LUGO";
    private final String A_CORUÑA = "A CORUÑA";
    private final String OURENSE = "OURENSE";
    private final String PONTEVEDRA = "PONTEVEDRA";

    public ListaProvincias() {
        lista = new ArrayList();
        inicializarLista();
    }
    
    
    public  boolean addProvincia(Provincia p){
        return lista.add(p);
    }
    
    public  Provincia getProvincia(String nombre){
        for (Provincia provincia : lista) {
            if (provincia.getNombre().equals(nombre)){
                return provincia;
            } 
        }
        return null;
    }
    
    public int size(){
        return lista.size();
    }
    
    public Provincia getProvincia(int index){
        return lista.get(index);
    }
    
    public void inicializarLista(){
        lista.add(new Provincia(LUGO));
        lista.add(new Provincia(A_CORUÑA));
        lista.add(new Provincia(OURENSE));
        lista.add(new Provincia(PONTEVEDRA));
        for (Provincia provincia : lista) { 
            provincia.getListaLocalidades().add(new Localidad("Localidad1"));
            provincia.getListaLocalidades().add(new Localidad("Localidad2"));
        }
    }
    
    public boolean removeLocalidad(Provincia p, Localidad l){
        return p.removeLocalidad(l);
    
    }
    
    public String getModel(Provincia p){
        StringBuilder s = new StringBuilder();
        ArrayList<Localidad> l = p.getListaLocalidades();
        for (Localidad localidad : l) {
            s=s.append(localidad.getNombre()+",");
        }
        return s.toString();
    
    }
}
