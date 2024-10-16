/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marta Romero Poo
 */   

// Nueva interfaz para voladores
interface Volador {
    void volar();
}

// Clase Ave sin el método volar
public class CorreccionLSP { //Clase Ave
    private String nombre;
    
    public CorreccionLSP(String nombre) { //Clase Ave
        this.nombre = nombre;
}
    
    public String getNombre() {
        return nombre;
    }
}

// Clase Avestruz, que no implementa Volador porque no vuela

class AvestruzCorreccion extends CorreccionLSP {
    public AvestruzCorreccion(String nombre) {
        super(nombre);
    }
}

// Clase Gorrion, que sí puede volar

class GorrionCorreccion extends CorreccionLSP implements Volador {
    public GorrionCorreccion(String nombre) {
        super(nombre);
        
    }
    
@Override
    public void volar() {
        System.out.println("El gorrión está volando");
    }
}
    
