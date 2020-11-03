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
    
    @Override
    public String toString() {
        return "MODELO "+mod+" - COR "+color; //To change body of generated methods, choose Tools | Templates.
    }
    
    public String info(){
        return( "MODELO : "+getMod()+"\n"
                    +"COR : "+getColor()+"\n"
                    +"ANCHO : "+getAlto()+"cm"+"\n"
                    +"ALTO : "+getAlto()+"cm");
    }
    
    
    
}
