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
public class EstrategiaDefensiva implements EstrategiaCarrera {
    @Override
    public void correr(Circuito circuito) {
        double km = circuito.getLongitudKm();
        String nombreCircuito = circuito.getNombre();
        Random rand = new Random();
        int posicion = rand.nextInt(9) + 4; // Posición entre 4 y 12

        if (km > 6) {
            System.out.println("El piloto corre de forma DEFENSIVA y constante en el circuito de " 
                + nombreCircuito + " (" + km + " km).");
        } else {
            System.out.println("El piloto corre de forma DEFENSIVA pero con momentos agresivos en el circuito de " 
                + nombreCircuito + " (" + km + " km).");
        }

        System.out.println("El piloto ha terminado en la posicion #" + posicion + ".\n");
    }
}