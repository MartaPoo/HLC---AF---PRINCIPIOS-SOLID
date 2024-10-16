/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marta Romero Poo
 */
// Interfaz que define el comportamiento de cualquier dispositivo que se pueda encender o apagar

interface Encendible {

    void encender();

    void apagar();
}
// Implementación de la interfaz Encendible para una bombilla

public class CorreccionDIP implements Encendible { //Es la clase Bombilla

    @Override
    public void encender() {
        System.out.println("La bombilla está encendida");
    }

    @Override
    public void apagar() {
        System.out.println("La bombilla está apagada");
    }
}

class VentiladorCorreccion implements Encendible {

    @Override
    public void encender() {
        System.out.println("El ventilador está encendido");
    }

    @Override
    public void apagar() {
        System.out.println("El ventilador está apagada");
    }
}
// Clase Interruptor que ahora depende de la abstracción (cumple con el DIP)

class InterruptorCorreccion {

    private Encendible dispositivo;

    public InterruptorCorreccion(Encendible dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void operar() {
        dispositivo.encender();
// Más tarde: dispositivo.apagar();
    }
}
