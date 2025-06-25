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
public class EstrategiaBalanceada implements EstrategiaCarrera {
    @Override
    public void correr(Circuito circuito) {
        double km = circuito.getLongitudKm();
        String nombre = circuito.getNombre();
        Random rand = new Random();
        int posicion = rand.nextInt(9) + 2; // 2 a 10

        System.out.println("El piloto adopta una estrategia BALANCEADA en el circuito " 
            + nombre + " (" + km + " km), adaptandose a las condiciones.");

        System.out.println("El piloto ha terminado en la posicion #" + posicion + ".\n");
    }
}