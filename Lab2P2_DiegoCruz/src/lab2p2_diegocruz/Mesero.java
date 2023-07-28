/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_diegocruz;

/**
 *
 * @author dfcm9
 */
public class Mesero {
    
    private String nombre, turno;
    private int edad;
    private double sueldo, propina;
    
    Mesero(){
    }
    
    Mesero(String nombre, String turno, int edad, double sueldo, double propina){
        this.nombre = nombre;
        this.turno = turno;
        this.edad = edad;
        this.sueldo = sueldo;
        this.propina = propina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getPropina() {
        return propina;
    }

    public void setPropina(double propina) {
        this.propina = propina;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nEdad: "+edad+"\nTurno: "+turno+"\nSueldo: "+sueldo+"\nPropina: "+propina;
    }
    
    
}
