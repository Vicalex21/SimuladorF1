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
public class ColeccionPilotos {
    private List<Piloto> pilotos;

    public ColeccionPilotos(List<Piloto> pilotos) {
        this.pilotos = pilotos;
    }

    public IteradorPiloto crearIterador() {
        return new PilotoIterator(pilotos);
    }
}