/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marta Romero Poo
 */
public class ViolacionLSP { //Clase Ave

    public void volar() {
        System.out.println("El ave está volando");
    }
}

class AvestruzViolacion extends ViolacionLSP {
    
    @Override
    public void volar() {
        throw new UnsupportedOperationException("Las avestruces no pueden volar");
    }
}
