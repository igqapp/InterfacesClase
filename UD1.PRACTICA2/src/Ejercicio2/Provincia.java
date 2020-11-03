/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author ivang
 */
public class Provincia {
    String nombre;
    ArrayList<Localidad> listaLocalidades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        listaLocalidades = new ArrayList();
    }

    public Provincia(String nombre, ArrayList<Localidad> listaLocalidades) {
        this.nombre = nombre;
        this.listaLocalidades = listaLocalidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Localidad> getListaLocalidades() {
        return listaLocalidades;
    }

    public void setListaLocalidades(ArrayList<Localidad> listaLocalidades) {
        this.listaLocalidades = listaLocalidades;
    }
    
    public Localidad getLocalidad(String localidad){
        for (Localidad localidade : listaLocalidades) {
            if (localidade.getNombre().equals(localidad)){
                return localidade;
            }
        }
        return null;
    }
    
    public boolean removeLocalidad(Localidad l){
        return listaLocalidades.remove(l);
    }
    
    
    
    
}
