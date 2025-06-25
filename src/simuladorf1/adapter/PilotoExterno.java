/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorf1.adapter;

/**
 *
 * @author Acer
 */

public class PilotoExterno {
    private String nombreCompleto;

    public PilotoExterno(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void conducir() {
        System.out.println(nombreCompleto + " está conduciendo (Piloto Externo).");
    }

    public String obtenerNombre() {
        return nombreCompleto;
    }
}