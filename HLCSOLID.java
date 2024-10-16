/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author Marta Romero Poo
 */
public class HLCSOLID {

    public static void main(String[] args) {
        
        //VIOLACIÓN DEL SRP
        System.out.println("CLASE UNICA QUE GENERA E IMPRIME REPORTES (VIOLACION DEL SRP)");
        
        //Crea una instancia
        ViolacionSRP violacionsrp = new ViolacionSRP("Nombre del reporte incorrecto","Cuerpo del incorrecto");
        //Método que genera reportes (en la misma clase)
        violacionsrp.generateReport();
        //Método que imprime reportes (en la misma clase)
        violacionsrp.printReport();
        
        
        //CORRECCIÓN DEL SRP
        System.out.println("CREACION DE DOS CLASES DONDE CADA UNA "
                + " GENERA REPORTES E IMPRIME REPORTES (CORRECCION DEL SRP)");
        
        // Crear una instancia
        CorreccionSRP myReport = new CorreccionSRP("Nombre del reporte correcto", "Cuerpo del correcto");

        // Crea una instancia de una clase que genera reportes
        ReportGenerator generator = new ReportGenerator();
        generator.generateReport(myReport);

        // Crea una instancia de una clase que imprime reportes
        ReportPrinter printer = new ReportPrinter();
        printer.printReport(myReport);
        
        
        
        
        
        System.out.println();
        //VIOLACIÓN DEL OCP
        System.out.println("CLASE QUE NO PERMITE SER EXTENSIBLE SIN MODIFICAR +"
                + "LA CLASE ORIGINAL (VIOLACION DEL OCP)");
        
        // Llamada para dibujar un círculo
        ViolacionOCP circleShape = new ViolacionOCP(ViolacionOCP.CIRCLE);
        circleShape.draw();  // Esto llamará a drawCircle() e imprimirá "Drawing a circle"

        // Llamada para dibujar un cuadrado
        ViolacionOCP squareShape = new ViolacionOCP(ViolacionOCP.SQUARE);
        squareShape.draw();  // Esto llamará a drawSquare() e imprimirá "Drawing a square"
        
        //CORRECCIÓN OCP
        System.out.println("AHORA SI SE NECESITA AÑADIR NUEVAS FORMAS SOLO HAY QUE"
                + "CREAR UNA NUEVA CLASE QUE IMPLEMENTE A SU MANERA LA INTERFAZ"
                + "(CORRECION OCP)");
        
        // Llamada para dibujar un círculo
        Correccionocp circleDrawer = new Correccionocp(new Circle());
        circleDrawer.drawShape();  // Dibujará un círculo

        // Llamada para dibujar un cuadrado
        Correccionocp squareDrawer = new Correccionocp(new Square());
        squareDrawer.drawShape();  // Dibujará un cuadrado
        
      
        
        
        
        
        System.out.println();
        // VIOLACIÓN LSP
        System.out.println("LA CLASE DERIVADA INTRODUCE UN COMPORTAMIENTO "
                + "NO COMPATIBLE CON LA CLASE PRINCIPAL (VIOLACION LSP)");
        
        // Crear una instancia de ViolacionLSP (un ave genérica)
        ViolacionLSP aveGenerica = new ViolacionLSP();
        aveGenerica.volar(); 

        // Crear una instancia de AvestruzViolacion
        ViolacionLSP avestruzViolacion = new AvestruzViolacion();
        try {
            avestruzViolacion.volar();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());  
        }

        // CORRECCIÓN LSP
        System.out.println("ESTE CODIGO SE ASEGURA DE QUE LAS SUBCLASES SEAN "
                + "SUSTITUIBLES POR SU CLASE BASE SIN ALTERAR EL COMPORTAMIENTO "
                + "DEL PROGRAMA (CORRECCION LSP)");
        
        // Crear una instancia de AvestruzCorreccion
        CorreccionLSP avestruzCorreccion = new AvestruzCorreccion("Avestruz");
        System.out.println(avestruzCorreccion.getNombre() + " no puede volar.");

        // Crear una instancia de GorrionCorreccion
        GorrionCorreccion gorrion = new GorrionCorreccion("Gorrion");
        System.out.println(gorrion.getNombre() + " sí puede volar.");
        gorrion.volar();  
        
        
        
        
        
        
        System.out.println();
        System.out.println("ESTE CODIGO VIOLA EL PRINCIPIO LSP PORQUE UNA DE LA "
                + "CLASES ESTÁ OBLIGADA A USAR MÉTODOS QUE NO HACE FALTA QUE UTILICE"
                + "(VIOLACIÓN ISP)");
        
        //VIOLACIÓN ISP
        Worker humanWorker = new ViolacionISP();
        humanWorker.work();  // Esto imprimirá "HumanWorker: Working..."
        humanWorker.eat();   // Esto imprimirá "HumanWorker: Eating..."

        Worker robotWorker = new RobotWorker();
        robotWorker.work();  // Esto imprimirá "RobotWorker: Working..."

        // No llamaremos a robotWorker.eat() porque lanzaría una excepción
        try {
            robotWorker.eat();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage()); // Esto imprimirá "Robots don't eat"
        }
        
        
        //CORRECCIÓN ISP
        System.out.println(" ESTE CODIGO IMPLEMENTA SOLO LAS INTERFACES"
                + "ESENCIALES PARA SU COMPORTAMIENTO (CORRECCIÓN ISP)");
        
        /// Crear una instancia de CorreccionISP (HumanWorker)
        Workable humanWorkerCorrected = new CorreccionISP();
        humanWorkerCorrected.work();  // Esto imprimirá "HumanWorker: Working..."

        if (humanWorkerCorrected instanceof Eatable eatable) {
            eatable.eat();  // Esto imprimirá "HumanWorker: Eating..."
        }

        Workable robotWorkerCorrected = new RobotWorkerCorrected();
        robotWorkerCorrected.work();  // Esto imprimirá "RobotWorker: Working..."
        
        
        
        
        
        
        
        System.out.println();
        System.out.println("EN ESTE CÓDIGO LA CLASE DE ALTO NIVEL DEPENDE DE "
                + "UNA CLASE DE BAJO NIVEL (VIOLACIÓN DIP)");
        //VIOLACIÓN DIP
        // Crear una instancia de la Bombilla
        ViolacionDIP bombilla = new ViolacionDIP();

        // Crear una instancia del Interruptor que usa la Bombilla
        Interruptor interruptor = new Interruptor(bombilla);

        // Operar el interruptor (encender la bombilla)
        interruptor.operar();  // Esto imprimirá "La bombilla está encendida"
        
        
        //CORRECCIÓN DIP
        System.out.println("EN EL SIGUIENTE CÓDIGO, LA CLASE DE ALTO NIVEL NO "
                + "DEPENDE DE LA DE BAJO NIVEL, DEPENDE DE UNA INTERFAZ "
                + "(CORRECIÓN DIP)");
       // Crear una instancia de la Bombilla (que implementa Encendible)
        Encendible bombillaCorreccion = new CorreccionDIP();

        // Crear una instancia del Interruptor que usa la Bombilla
        InterruptorCorreccion interruptorBombilla = new InterruptorCorreccion(bombillaCorreccion);

        // Operar el interruptor para encender la bombilla
        interruptorBombilla.operar();  // Esto imprimirá "La bombilla está encendida"

        // Crear una instancia de un Ventilador (que implementa Encendible)
        Encendible ventilador = new VentiladorCorreccion();

        // Crear una instancia del Interruptor que usa el Ventilador
        InterruptorCorreccion interruptorVentilador = new InterruptorCorreccion(ventilador);

        // Operar el interruptor para encender el ventilador
        interruptorVentilador.operar();  // Esto imprimirá "El ventilador está encendido" 
    }
}

