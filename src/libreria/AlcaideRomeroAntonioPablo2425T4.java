
package libreria;

public class AlcaideRomeroAntonioPablo2425T4 {
  
    public static void main(String[] args) {
        LibreriaAlcaideRomeroAntonioPablo2425T4 miLibreriaAlcaideRomeroAntonioPablo2425T4;
        String x;
        int stock;
        int num;
        double dinero;
        double saldoActual;
        double ingreso;
        
        miLibreriaAlcaideRomeroAntonioPablo2425T4 = new LibreriaAlcaideRomeroAntonioPablo2425T4("Don Quijote de la Mancha", 10, 45, 120);

        compraQuijoteAlcaideRomeroAntonioPablo2425T4(miLibreriaAlcaideRomeroAntonioPablo2425T4);
        
        saldoActual = miLibreriaAlcaideRomeroAntonioPablo2425T4.obtenerSaldo();
        System.out.println("El saldo al comprar el libro es de "+ saldoActual );        
        x = miLibreriaAlcaideRomeroAntonioPablo2425T4.obtenerNombre();
        stock = miLibreriaAlcaideRomeroAntonioPablo2425T4.obtenerStock();
        System.out.println("El libro "+x+" tiene un stock de "+stock+" unidades ahora");
        
        añadeIngresoAlcaideRomeroAntonioPablo2425T4(miLibreriaAlcaideRomeroAntonioPablo2425T4, "Libro vendido");
    }

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
