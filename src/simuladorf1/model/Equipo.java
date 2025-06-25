/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorf1.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Acer
 */
public class Equipo {
    private String nombre;
    private List<Piloto> pilotos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.pilotos = new ArrayList<>();
    }

    public void agregarPiloto(Piloto piloto) {
        pilotos.add(piloto);
    }

    public List<Piloto> getPilotos() {
        return pilotos;
    }

    public String getNombre() {
        return nombre;
    }
}