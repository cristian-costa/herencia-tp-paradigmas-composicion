package com.herencia;

public class NintendoSwitch extends ConsolaDeJuegos {
    private DispositivoTactilPortatil dispositivo;

    public NintendoSwitch() {
        super();
        dispositivo = new DispositivoTactilPortatil();
    }

    // Puedo llamar directamente a los métodos de ConsolaDeJuegos.
    // Para los métodos de DispositivoTactilPortatil, se deben definir métodos de delegación.
    
    public void copiar(String texto) {
        dispositivo.copiar(texto);
    }

    public void pegar() {
        dispositivo.pegar();
    }

    public void subirBrillo(int cantidad) {
        dispositivo.subirBrillo(cantidad);
    }

    public void disminuirBrillo(int cantidad) {
        dispositivo.disminuirBrillo(cantidad);
    }

    public void mostrarBateria() {
        dispositivo.mostrarBateria();
    }
}
