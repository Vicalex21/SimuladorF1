/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simuladorf1.main;

import simuladorf1.adapter.*;
import simuladorf1.iterator.*;
import simuladorf1.model.*;
import simuladorf1.singleton.Temporada;
import simuladorf1.strategy.*;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Acer
 */
public class Main {

    private static final Random rand = new Random();

    public static void main(String[] args) {
        Temporada temporada = Temporada.getInstancia();

        // Crear y registrar equipos con estrategias aleatorias
        temporada.registrarEquipo(crearEquipo("Red Bull Racing", "Max Verstappen", "Yuki Tsunoda"));
        temporada.registrarEquipo(crearEquipo("Mercedes-AMG", "George Russell", "Andrea Kimi Antonelli"));
        temporada.registrarEquipo(crearEquipo("Ferrari", "Charles Leclerc", "Lewis Hamilton"));
        temporada.registrarEquipo(crearEquipo("McLaren", "Lando Norris", "Oscar Piastri"));
        temporada.registrarEquipo(crearEquipo("Aston Martin", "Fernando Alonso", "Lance Stroll"));
        temporada.registrarEquipo(crearEquipo("Alpine", "Pierre Gasly", "Franco Chocapinto"));
        temporada.registrarEquipo(crearEquipo("Williams", "Alexander Albon", "Carlos Sainz"));
        temporada.registrarEquipo(crearEquipo("Stake F1 Team", "Nico Hulkernberg", "Gabriel Bortoletto"));
        temporada.registrarEquipo(crearEquipo("Haas", "Esteban Ocon", "Oliver Bearman"));
        temporada.registrarEquipo(crearEquipo("RB", "Issac Hadjar", "Liam Lawson"));
        temporada.registrarEquipo(crearEquipo("Ferrari", "Vicente Munoz", "Alan Aliste"));

        // Registrar circuitos
        temporada.registrarCircuito(new Circuito("Gran Premio de Australia de Albert Park, Melburne", 5.303));
        temporada.registrarCircuito(new Circuito("Gran Premio de China Circuito de Shanghai", 5.451));
        temporada.registrarCircuito(new Circuito("Gran Premio de Japon, Suzuka Circuit", 5.807));
        temporada.registrarCircuito(new Circuito("Gran Premio de Bahrein, Circuito de Bahrein ", 5.412));
        temporada.registrarCircuito(new Circuito("Gran Premio de Jeddah Street Circuito Urbano", 6.174));
        temporada.registrarCircuito(new Circuito("Gran Premio de Miami GP, Circuito Urbano", 5.412));
        temporada.registrarCircuito(new Circuito("Gran Premio de la Emilia Romania, Autodromo Enzo e Dino Ferrari, Imola, Italia", 4.909));
        temporada.registrarCircuito(new Circuito("Gran Premio de Monaco, Circuito de Monaco, Montecarlo, Monaco", 3.337));
        temporada.registrarCircuito(new Circuito("Gran Premio de Espania Circuit de Barcelona Catalunya, Montmelo, Espania", 4.675));
        temporada.registrarCircuito(new Circuito("Gran Premio de Canada, Circuito Gilles Villeneuve, Montreal, Canada", 4.361));
        temporada.registrarCircuito(new Circuito("Gran Premio de Austria Circuito de Red Bull Ring, Knittelfeld, Austria", 4.326));
        temporada.registrarCircuito(new Circuito("Gran Premio de Gran Bretania, Circuito de Silverstone, Silverstone, Gran bretania", 5.891));
        temporada.registrarCircuito(new Circuito("Gran Premio de Belgica, Circuito de Spa-Francorchamps, Spa-Francorchamps, Belgica", 7.004));
        temporada.registrarCircuito(new Circuito("Gran Premio de Hungria, Circuito de Hungaroring, Mogyorod, Hungria", 4.381));
        temporada.registrarCircuito(new Circuito("Gran Premio de los Paises Bajos, Circuito de Zandvoort, Zandvoort, Paises Bajos", 4.259));
        temporada.registrarCircuito(new Circuito("Gran Premio de Italia, Circuito de Monza, Monza, Italia", 5.793));
        temporada.registrarCircuito(new Circuito("Gran Premio de Azerbaiyan, Circuito de la Ciudad de Baku, Baku, Azerbaiyan", 6.003));
        temporada.registrarCircuito(new Circuito("Gran Premio de Singapur, Circuito de Marina Bay, Singapur, Singapur", 5.063));
        temporada.registrarCircuito(new Circuito("Gran Premio de los Estados Unidos, Circuito de las Americas, Travis Country, Aunstin, Estados Unidos", 5.513));
        temporada.registrarCircuito(new Circuito("Gran Premio de Mexico, Autodromo Hermanos Rodriguez, Mexico D.F., Mexico", 4.304));
        temporada.registrarCircuito(new Circuito("Gran Premio de Sao Paulo, Circuito Jose Carlos Pace Interlagos, Sao Paulo, Brasil", 4.309));
        temporada.registrarCircuito(new Circuito("Gran Premio de Las Vegas GP, Circuito de las Vegas, Las Vegas, Estados Unidos", 6.201));
        temporada.registrarCircuito(new Circuito("Gran Premio de Qatar, Circuito de Losail, Losail, Qatar", 5.380));
        temporada.registrarCircuito(new Circuito("Gran Premio de Abu Dhabi, Circuito de Yas Marina, Abu Dhabi, Emiratos Arabes Unidos", 5.281));

        Scanner scanner = new Scanner(System.in);

        // Selección de equipo
        System.out.println("Seleccione un equipo:");
        for (int i = 0; i < temporada.getEquipos().size(); i++) {
            System.out.println(i + ": " + temporada.getEquipos().get(i).getNombre());
        }
        int indiceEquipo = scanner.nextInt();
        Equipo equipoSeleccionado = temporada.getEquipos().get(indiceEquipo);

        // Selección de piloto
        System.out.println("Seleccione un piloto:");
        for (int i = 0; i < equipoSeleccionado.getPilotos().size(); i++) {
            System.out.println(i + ": " + equipoSeleccionado.getPilotos().get(i).getNombre());
        }
        int indicePiloto = scanner.nextInt();
        Piloto pilotoSeleccionado = equipoSeleccionado.getPilotos().get(indicePiloto);

        // Selección de circuito
        System.out.println("Seleccione un circuito:");
        for (int i = 0; i < temporada.getCircuitos().size(); i++) {
            System.out.println(i + ": " + temporada.getCircuitos().get(i).getNombre()
                    + " (" + temporada.getCircuitos().get(i).getLongitudKm() + " km)");
        }
        int indiceCircuito = scanner.nextInt();
        Circuito circuitoSeleccionado = temporada.getCircuitos().get(indiceCircuito);

        // Simulación F1 mejor que EA
        System.out.println("\nSimulacion de carrera:");
        System.out.println("Equipo: " + equipoSeleccionado.getNombre());
        System.out.println(" Piloto: " + pilotoSeleccionado.getNombre());
        System.out.println(" Circuito: " + circuitoSeleccionado.getNombre());

        pilotoSeleccionado.correr(circuitoSeleccionado);

        scanner.close();
    }

    // Método auxiliar para estrategia aleatoria
    private static EstrategiaCarrera estrategiaAleatoria() {
    Random rand = new Random();
    int opcion = rand.nextInt(4); // 0 a 3

    switch (opcion) {
        case 0:
            return new EstrategiaAgresiva();
        case 1:
            return new EstrategiaDefensiva();
        case 2:
            return new EstrategiaBalanceada();
        case 3:
            return new EstrategiaConservadora();
        default:
            return new EstrategiaAgresiva(); // por seguridad
    }
}

    private static Equipo crearEquipo(String nombreEquipo, String nombrePiloto1, String nombrePiloto2) {
        Equipo equipo = new Equipo(nombreEquipo);
        equipo.agregarPiloto(new Piloto(nombrePiloto1, estrategiaAleatoria()));
        equipo.agregarPiloto(new Piloto(nombrePiloto2, estrategiaAleatoria()));
        return equipo;
    }
}
