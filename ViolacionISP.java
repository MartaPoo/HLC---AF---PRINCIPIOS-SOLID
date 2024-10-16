/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marta Romero Poo
 */
interface Worker {
    void work();
    void eat();
}

public class ViolacionISP implements Worker { // Clase HumanWorker
    @Override
    public void work() {
        System.out.println("HumanWorker: Working...");
    }

    @Override
    public void eat() {
        System.out.println("HumanWorker: Eating...");
    }
}

class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("RobotWorker: Working...");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat");
    }
}
