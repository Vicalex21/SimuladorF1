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



public class EstrategiaAgresiva implements EstrategiaCarrera {
    @Override
    public void correr(Circuito circuito) {
        double km = circuito.getLongitudKm();
        String nombreCircuito = circuito.getNombre();
        Random rand = new Random();
        int posicion = rand.nextInt(8) + 1; // Posición entre 1 y 8

        if (km > 5.5) {
            System.out.println("El piloto ataca con todo en el circuito largo " + nombreCircuito + " (" + km + " km).");
        } else {
            System.out.println("El piloto corre AGRESIVAMENTE en el circuito corto " + nombreCircuito + " (" + km + " km).");
        }

        System.out.println("El piloto ha terminado en la posicion #" + posicion + ".\n");
    }
}