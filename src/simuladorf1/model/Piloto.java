/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorf1.model;
import simuladorf1.strategy.EstrategiaCarrera;
import simuladorf1.model.Circuito;
/**
 *
 * @author Acer
 */
public class Piloto {
    private String nombre;
    private EstrategiaCarrera estrategia;

    public Piloto(String nombre) {
        this.nombre = nombre;
    }

    //Constructor con estrategia
    public Piloto(String nombre, EstrategiaCarrera estrategia) {
        this.nombre = nombre;
        this.estrategia = estrategia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEstrategia(EstrategiaCarrera estrategia) {
        this.estrategia = estrategia;
    }

    public void correr(Circuito circuito) {
        if (estrategia != null) {
            estrategia.correr(circuito);
        } else {
            System.out.println(nombre + " está corriendo sin una estrategia definida.");
        }
    }
}