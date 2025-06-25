/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorf1.model;

/**
 *
 * @author Acer
 */
public class Circuito {
    private String nombre;
    private double longitudKm;

    public Circuito(String nombre, double longitudKm) {
        this.nombre = nombre;
        this.longitudKm = longitudKm;
    }

    public String getNombre() {
        return nombre;
    }

    public double getLongitudKm() {
        return longitudKm;
    }
}