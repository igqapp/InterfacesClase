/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author ivangq
 */
public class Alfombra {
    private String mod;
    private String color;
    private int ancho;
    private int alto;

    public Alfombra(String mod, String color, int ancho, int alto) {
        this.mod = mod;
        this.color = color;
        this.ancho = ancho;
        this.alto = alto;
    }

    public Alfombra() {
    }
    
    

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    public String getNombre(){
        return "MODELO "+mod+" - COR "+color;
    
    
    }
    
    
    
}
