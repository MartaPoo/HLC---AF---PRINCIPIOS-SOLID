/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Marta Romero Poo
 */
class CorreccionSRP { //Clase Report
    //Atributos
    private String title;
    private String body;

    // Constructor para inicializar los datos del reporte
    public CorreccionSRP(String title, String body) { //Clase Report
        this.title = title;
        this.body = body;
    }

    // Métodos para obtener el título y el cuerpo del reporte
    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}

// Clase para generar el reporte
class ReportGenerator {
    // El método recibe un objeto de la clase Correccionsrp y genera el reporte
    public void generateReport(CorreccionSRP report) {
        System.out.println("Generating report: " + report.getTitle());
    }
}

// Clase para imprimir el reporte
class ReportPrinter {
    // El método recibe un objeto de la clase Correccionsrp y lo imprime
    public void printReport(CorreccionSRP report) {
        System.out.println("Printing report: " + report.getTitle());
    }
}

//Hay distintas clases para hacer las dos cosas diferentes