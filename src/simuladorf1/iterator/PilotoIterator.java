/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorf1.iterator;

import simuladorf1.model.Piloto;
import java.util.List;

/**
 *
 * @author Acer
 */
public class PilotoIterator implements IteradorPiloto {
    private List<Piloto> pilotos;
    private int posicion = 0;

    public PilotoIterator(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    @Override
    public boolean tieneSiguiente() {
        return posicion < pilotos.size();
    }

    @Override
    public Piloto siguiente() {
        if (this.tieneSiguiente()) {
            return pilotos.get(posicion++);
        }
        return null;
    }
}