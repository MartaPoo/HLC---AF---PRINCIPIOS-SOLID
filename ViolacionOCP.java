/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marta Romero Poo
 */

public class ViolacionOCP { //Clase Shape
        public static final int CIRCLE = 1;
        public static final int SQUARE = 2;
        private int shapeType;
        
    public ViolacionOCP(int shapeType) { //Clase Shape
        this.shapeType = shapeType;
    }
    
    public void draw() {
        if (shapeType == CIRCLE) {
            drawCircle();
        } else if (shapeType == SQUARE) {
            drawSquare();
        }//Fin Si
    }
    
    private void drawCircle() {
        System.out.println("Drawing a circle");
    }
        
    private void drawSquare() {
        System.out.println("Drawing a square");
    }
}

//Viola este principio porque deberías poder agregar nuevas funcionalidades sin cambiar el código existente.