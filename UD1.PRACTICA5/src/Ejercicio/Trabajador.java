/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author ivangq
 */
public class Trabajador {
    private String DNI;
    private String nombre;
    private String ap1;
    private String ap2;
    private String prof;
    private String prov;

    public Trabajador(String DNI, String nombre, String ap1, String ap2, String prof, String prov) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.ap1 = ap1;
        this.ap2 = ap2;
        this.prof = prof;
        this.prov = prov;
    }

    
    public Trabajador() {
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp1() {
        return ap1;
    }

    public void setAp1(String ap1) {
        this.ap1 = ap1;
    }

    public String getAp2() {
        return ap2;
    }

    public void setAp2(String ap2) {
        this.ap2 = ap2;
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }

    @Override
    public String toString() {
        return nombre+" "+ap1+" "+ap2; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
