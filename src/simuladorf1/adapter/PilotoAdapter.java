/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorf1.adapter;

/**
 *
 * @author Acer
 */
public class PilotoAdapter implements IPiloto {
    private PilotoExterno pilotoExterno;

    public PilotoAdapter(PilotoExterno pilotoExterno) {
        this.pilotoExterno = pilotoExterno;
    }

    @Override
    public String getNombre() {
        return pilotoExterno.obtenerNombre();
    }

    @Override
    public void correr() {
        pilotoExterno.conducir();
    }
}