
package libreria;

/**
 * Clase principal que gestiona la compra de libros y el ingreso de dinero en una librería.
 * Simula una librería donde se realizan operaciones sobre un libro específico.
 * 
 * @author Antonio Pablo Alcaide Romero
 * @version 1.0
 */

public class AlcaideRomeroAntonioPablo2425T4 {
    
     /**
     * Método principal de la aplicación.
     * Se encarga de gestionar la compra de un libro y el aumento de saldo en la librería.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados en este programa).
     */
  
    public static void main(String[] args) {
        LibreriaAlcaideRomeroAntonioPablo2425T4 miLibreriaAlcaideRomeroAntonioPablo2425T4;
        String x;
        int stock;
        int num;
        double dinero;
        double saldoActual;
        double ingreso;
        
        // Creación de la librería con el libro "Don Quijote de la Mancha"
        miLibreriaAlcaideRomeroAntonioPablo2425T4 = new LibreriaAlcaideRomeroAntonioPablo2425T4("Don Quijote de la Mancha", 10, 45, 120);

        
        // Se realiza la compra del libro
        compraQuijoteAlcaideRomeroAntonioPablo2425T4(miLibreriaAlcaideRomeroAntonioPablo2425T4);
        
        
         // Se obtiene y muestra el saldo después de la compra
        saldoActual = miLibreriaAlcaideRomeroAntonioPablo2425T4.obtenerSaldo();
        System.out.println("El saldo al comprar el libro es de "+ saldoActual );  
        
        // Se obtiene y muestra el stock actual del libro
        x = miLibreriaAlcaideRomeroAntonioPablo2425T4.obtenerNombre();
        stock = miLibreriaAlcaideRomeroAntonioPablo2425T4.obtenerStock();
        System.out.println("El libro "+x+" tiene un stock de "+stock+" unidades ahora");
        
        añadeIngresoAlcaideRomeroAntonioPablo2425T4(miLibreriaAlcaideRomeroAntonioPablo2425T4, "Libro vendido");
    }

    
     /**
     * Aumenta el saldo de la librería con un ingreso específico.
     * 
     * @param miLibreriaAlcaideRomeroAntonioPablo2425T4 Objeto de la librería en la que se realizará el ingreso.
     * @param objeto Descripción del motivo del ingreso.
     */
    private static void añadeIngresoAlcaideRomeroAntonioPablo2425T4(LibreriaAlcaideRomeroAntonioPablo2425T4 miLibreriaAlcaideRomeroAntonioPablo2425T4, String objeto) {
        double ingreso;
        double saldoActual;
        try
        {
            ingreso = 30.5; //Ingreso que se va a realizar en el saldo de la librería
            miLibreriaAlcaideRomeroAntonioPablo2425T4.aumentarSaldo(ingreso);
            saldoActual = miLibreriaAlcaideRomeroAntonioPablo2425T4.obtenerSaldo();
            System.out.println("Tu saldo actual después de ingresar es de "+saldoActual+"€");
        } catch (Exception e)
        {
            System.out.println("Fallo al obtener el saldo al ingresar");
        }
    }
    
    
    /**
     * Realiza la compra de dos ejemplares del libro "Don Quijote de la Mancha".
     * 
     * @param miLibreriaAlcaideRomeroAntonioPablo2425T4 Objeto de la librería en la que se realizará la compra.
     */
    private static void compraQuijoteAlcaideRomeroAntonioPablo2425T4(LibreriaAlcaideRomeroAntonioPablo2425T4 miLibreriaAlcaideRomeroAntonioPablo2425T4) {
        String x;
        int num;
        double dinero;
        double saldoActual;
        try
        {
            x = "Don Quijote de la Mancha";
            num = 2;    //Número de ejemplares a comprar
            dinero = miLibreriaAlcaideRomeroAntonioPablo2425T4.obtenerPrecio();
            saldoActual = miLibreriaAlcaideRomeroAntonioPablo2425T4.obtenerSaldo();
            System.out.println("El libro "+x+" vale "+dinero+"€");
            System.out.println("El saldo actual de la librería es de "+saldoActual+"€");
            miLibreriaAlcaideRomeroAntonioPablo2425T4.comprarLibro(num);
        } catch (Exception e)
        {
            System.out.println("Error en la compra del libro");
        }
    }
}
