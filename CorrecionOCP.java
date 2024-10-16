/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAW2
 */
// Interfaz para el dibujo de formas
interface Drawable {
    void draw();
}

// Implementación de un círculo
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

// Implementación de un cuadrado
class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    String area() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

// Clase de cliente que usa Drawable
class Correccionocp { //Clase ShapeDrawer
    private Drawable shape;

    public Correccionocp(Drawable shape) { //Clase ShapeDrawer
        this.shape = shape;
    }

    public void drawShape() {
        shape.draw();
    }
}
