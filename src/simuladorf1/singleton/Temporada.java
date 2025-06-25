/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorf1.singleton;

import simuladorf1.model.Equipo;
import simuladorf1.model.Piloto;
import simuladorf1.model.Circuito;

import java.util.ArrayList;
import java.util.List;

/**
 //Clase Singleton que representa una temporada de Fórmula 1.
 //Permite registrar equipos, pilotos y circuitos, y acceder a ellos.
 */
public class Temporada {
    private static volatile Temporada instancia;
    private List<Equipo> equipos;
    private List<Circuito> circuitos;

    private Temporada() {
        equipos = new ArrayList<>();
        circuitos = new ArrayList<>();
    }

    public static Temporada getInstancia() {
        if (instancia == null) {
            synchronized (Temporada.class) {
                if (instancia == null) {
                    instancia = new Temporada();
                }
            }
        }
        return instancia;
    }

    public void registrarEquipo(Equipo equipo) {
        if (!equipos.contains(equipo)) {
            equipos.add(equipo);
        }
    }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public List<Piloto> getTodosLosPilotos() {
        List<Piloto> todos = new ArrayList<>();
        for (Equipo equipo : equipos) {
            todos.addAll(equipo.getPilotos());
        }
        return todos;
    }



    public void registrarCircuito(Circuito circuito) {
        circuitos.add(circuito);
    }

    public List<Circuito> getCircuitos() {
        return circuitos;
    }
}
