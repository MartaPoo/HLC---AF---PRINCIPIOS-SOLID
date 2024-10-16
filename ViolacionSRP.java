/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Marta Romero Poo
 */
public class ViolacionSRP { //Clase Report
    //Atributos
    private String title;
    private String body;
    
    // Constructor para inicializar los datos del reporte
    public ViolacionSRP(String title, String body) { //Clase Report
        this.title = title;
        this.body = body;
    }
    
    //Método para generar el reporte
    public void generateReport() {
        System.out.println("Generating report...");
    }
    
    //Método para imprimir el reporte
    public void printReport() {
        System.out.println("Printing report: " + title);
    }
    
    //Esta clase genera e imprime los reportes, hace dos cosas a la vez.
}
