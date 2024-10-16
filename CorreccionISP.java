/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marta Romero Poo
 */
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

public class CorreccionISP implements Workable, Eatable { // Clase HumanWorker corregida
    @Override
    public void work() {
        System.out.println("HumanWorker: Working...");
    }

    @Override
    public void eat() {
        System.out.println("HumanWorker: Eating...");
    }
}

class RobotWorkerCorrected implements Workable { // Clase RobotWorker corregida
    @Override
    public void work() {
        System.out.println("RobotWorker: Working...");
    }
}
