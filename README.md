# SimuladorF1 🏎️🏎️🏎️

## Descripción del Sistema y Problema a Resolver

SimuladorF1 es un programa en Java que simula una carrera de una temporada de Formula 1 2025. Permite seleccionar equipos, pilotos y circuitos para disputar carreras con distintas estrategias que estan asignadas de manera aleatoria, dejando fuera del alcance del piloto (usuario) y obteniendo la posicion final dependiendo de la estrategia en juego. El objetivo es modelar la dinámica real de una temporada de F1 y demostrar el uso práctico de patrones de diseño.

El problema que resuelve es cómo organizar y gestionar múltiples entidades (equipos, pilotos, circuitos) y comportamientos variables (estrategias de carrera), garantizando flexibilidad y extensibilidad en el sistema.

---

## Justificación de Patrones de Diseño

| Patrón         | Por qué se usa                               | Cómo se implementa                                   | Dónde en el código                                |
|----------------|---------------------------------------------|-----------------------------------------------------|--------------------------------------------------|
| Singleton      | Garantizar que solo haya una temporada única| Clase `Temporada` con constructor privado y método `getInstancia()` | `simuladorf1.singleton.Temporada`                |
| Strategy       | Permitir cambiar comportamiento de carrera | Interfaz `EstrategiaCarrera` y clases concretas que implementan distintas estrategias | `simuladorf1.strategy.`                          |
| Adapter        | Integrar pilotos externos con diferente interfaz | `PilotoAdapter` que adapta `PilotoExterno` a `Piloto` | `simuladorf1.adapter.`                           |
| Iterator       | Recorrer colecciones de pilotos de forma uniforme | Implementación de `IteradorPiloto` y `ColeccionPilotos` | `simuladorf1.iterator.`                          |

---

## Instrucciones de Compilación y Ejecución

### Compilar y ejecutar desde consola

```bash
git clone https://github.com/Vicalex21/SimuladorF1.git
cd SimuladorF1
javac -d bin -sourcepath src src/simuladorf1/main/Main.java
java -cp bin simuladorf1.main.Main
