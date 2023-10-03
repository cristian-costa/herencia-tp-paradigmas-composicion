package com.herencia;

import java.util.ArrayList;
import java.util.List;

// Clase representativa de una consola de videojuegos.
// Describe las acciones básicas que cualquier consola de videojuegos debe tener.
public class ConsolaDeJuegos {
    private String juegoActual = null;
    private List<String> juegosDisponibles = new ArrayList<>();
    private boolean encendida;
    private int bateria = 100;

    public ConsolaDeJuegos() {
        juegosDisponibles.add("Super Mario");
        juegosDisponibles.add("Zelda: Tears of the Kingdom");
        juegosDisponibles.add("Mario Kart 8");
        juegosDisponibles.add("Animal Crossing: New Horizons");
    }

    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("Consola de juegos encendida.");
        } else {
            System.out.println("La consola ya está encendida.");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("Consola de juegos apagada.");
        } else {
            System.out.println("La consola ya está apagada.");
        }
    }

    public void abrirJuego(int indiceJuego) {
        if (encendida) {
            if (juegoActual == null) {
                if (indiceJuego >= 0 && indiceJuego < juegosDisponibles.size()) {
                    juegoActual = juegosDisponibles.get(indiceJuego);
                    System.out.println("Juego " + juegoActual + " abierto.");
                } else {
                    System.out.println("Índice de juego inválido.");
                }
            } else {
                System.out.println("Ya hay un juego en ejecución: " + juegoActual);
            }
        } else {
            System.out.println("La consola está apagada. Enciéndela para jugar.");
        }
    }

    public void cerrarJuego() {
        if (encendida && juegoActual != null) {
            System.out.println("Juego " + juegoActual + " cerrado.");
            juegoActual = null;
        } else {
            System.out.println("No hay ningún juego en ejecución para cerrar o la consola está apagada.");
        }
    }

    public void jugar() {
        if (encendida && juegoActual != null) {
            System.out.println("Jugando " + juegoActual + "...");
            bateria -= 5;
            if (bateria < 0) bateria = 0;
            System.out.println("Batería actual: " + bateria + "%");
        } else {
            System.out.println("No hay ningún juego abierto para jugar o la consola está apagada.");
        }
    }

    public void listarJuegos() {
        System.out.println("Juegos disponibles:");
        for (int i = 0; i < juegosDisponibles.size(); i++) {
            System.out.println((i + 1) + ". " + juegosDisponibles.get(i));
        }
    }
}

