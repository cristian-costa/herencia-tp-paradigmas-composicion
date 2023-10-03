package com.herencia;

//Clase representativa de un dispositivo táctil portátil.
//Describe las acciones básicas que cualquier dispositivo táctil portátil debe tener.
public class DispositivoTactilPortatil {
	private int brillo = 50;
	private String portapapeles = "";
	
	public void encender() {
	    System.out.println("Dispositivo táctil portátil encendido.");
	}
	
	public void apagar() {
	    System.out.println("Dispositivo táctil portátil apagado.");
	}
	
	public void copiar(String texto) {
	    portapapeles = texto;
	    System.out.println("Texto copiado al portapapeles del dispositivo táctil portátil.");
	}
	
	// Método para pegar texto desde el portapapeles del dispositivo.
	public void pegar() {
	    if (!portapapeles.isEmpty()) {
	        System.out.println("Texto pegado desde el portapapeles: " + portapapeles);
	    } else {
	        System.out.println("El portapapeles está vacío.");
	    }
	}
	
	// Método para aumentar el brillo del dispositivo.
	public void subirBrillo(int cantidad) {
	    if (brillo + cantidad <= 100) {
	        brillo += cantidad;
	        System.out.println("Brillo aumentado a " + brillo + "%.");
	    } else {
	        brillo = 100;
	        System.out.println("Brillo ajustado al máximo (100%).");
	    }
	}
	
	// Método para disminuir el brillo del dispositivo.
	public void disminuirBrillo(int cantidad) {
	    if (brillo - cantidad >= 0) {
	        brillo -= cantidad;
	        System.out.println("Brillo disminuido a " + brillo + "%.");
	    } else {
	        brillo = 0;
	        System.out.println("Brillo ajustado al mínimo (0%).");
	    }
	}
	
	// Método para mostrar la batería del dispositivo (simplificado para el ejemplo).
	public void mostrarBateria() {
	    System.out.println("Batería del dispositivo táctil portátil: 80%");
	}
}

