package com.herencia;

public class Main {
    public static void main(String[] args) {
        NintendoSwitch miConsola = new NintendoSwitch();

        // Llamando a los métodos heredados de ConsolaDeJuegos
        miConsola.encender();
        miConsola.listarJuegos();
        miConsola.abrirJuego(1);
        miConsola.jugar();

        // Llamando a los métodos de DispositivoTactilPortatil a través de delegación
        miConsola.copiar("Esto es muy divertido");
        miConsola.pegar();
        miConsola.subirBrillo(10);
        miConsola.mostrarBateria();
    }
}

