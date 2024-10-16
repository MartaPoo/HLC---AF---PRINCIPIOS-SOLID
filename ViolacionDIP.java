/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marta Romero Poo
 */
public class ViolacionDIP { //La clase es bombilla
    public void encender() {
        System.out.println("La bombilla está encendida");
    }

    public void apagar() {
        System.out.println("La bombilla está apagada");
    }
}
// Clase Interruptor que depende de Bombilla (violación del DIP)

class Interruptor {

    private ViolacionDIP bombilla;

    public Interruptor(ViolacionDIP bombilla) {
        this.bombilla = bombilla;
    }

    public void operar() {
        bombilla.encender();
// Más tarde: bombilla.apagar();
    }
}


