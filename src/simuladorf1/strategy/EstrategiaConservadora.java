/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorf1.strategy;
import simuladorf1.model.Circuito;
import java.util.Random;

/**
 *
 * @author Acer
 */
public class EstrategiaConservadora implements EstrategiaCarrera {
    @Override
    public void correr(Circuito circuito) {
        double km = circuito.getLongitudKm();
        String nombre = circuito.getNombre();
        Random rand = new Random();
        int posicion = rand.nextInt(11) + 6; // 6 a 16

        System.out.println("El piloto corre con una estrategia CONSERVADORA en " 
            + nombre + " (" + km + " km), evitando riesgos innecesarios.");

        System.out.println("El piloto ha terminado en la posicion #" + posicion + ".\n");
    }
}