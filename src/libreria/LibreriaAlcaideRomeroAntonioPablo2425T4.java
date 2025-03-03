
package libreria;

/**
 * Clase que representa una librería que gestiona la venta de libros, 
 * incluyendo el control de stock, precios y saldo disponible.
 * 
 * Permite la compra de libros y la actualización del saldo de la librería.
 * 
 * @author Antonio Pablo Alcaide Romero
 * @version 1.0
 */




public class LibreriaAlcaideRomeroAntonioPablo2425T4 {
    private String nom; // Nombre del libro
    private int cantidad; // Cantidad de libros en stock
    private double precio; // Precio unitario del libro
    private double saldo;// Saldo de la librería
    
    
    
    
    
    /**
     * Constructor por defecto de la librería sin argumentos.
     * Crea una librería sin valores iniciales.
     */

   
    public LibreriaAlcaideRomeroAntonioPablo2425T4(){}
    
     /**
     * Constructor que inicializa todas las propiedades de la  clase librería.
     * 
     * @param nom Nombre del libro.
     * @param cantidad Cantidad de ejemplares en stock.
     * @param precio Precio unitario del libro.
     * @param saldo Saldo inicial de la librería.
     */
    
    
    
    public LibreriaAlcaideRomeroAntonioPablo2425T4(String nom, int cantidad, double precio, double saldo){
        this.nom = nom;                 //Nombre del libro
        this.cantidad = cantidad;       //Cantidad de ejemplares que hay en stock
        this.precio = precio;           //Precio unitario del libro
        this.saldo = saldo;             //Saldo en la cuenta de la librería
    }
    
    
    /**
     * Obtiene el nombre del libro
     * 
     * @return Nombre del libro.
     */
    
    public String obtenerNombre(){
        return getNom();
    }
    
     /**
     *  Obtiene el precio del libro.
     * 
     * @return Precio unitario del libro.
     */
    
    public double obtenerPrecio(){
        return getPrecio();
    }
    
    
    /**
     *  Obtiene la cantidad de libros en stock.
     * 
     * @return Número de libros disponibles.
     */
    
    public int obtenerStock(){
        return getCantidad();
    }
    
    
    /**
     *  Obtiene el saldo actual de la librería.
     * 
     * @return Saldo disponible.
     */
    
    public double obtenerSaldo(){
        return getSaldo();
    }
    
     /**
     * Aumenta el saldo de la librería con una cantidad específica.
     * 
     * @param saldomas Cantidad a agregar al saldo.
     * @throws Exception Si la cantidad a ingresar es 0 o negativo.
     */
     //Método para aumentar el saldo
    public void aumentarSaldo(double saldomas) throws Exception{
        if (saldomas<=0)
            throw new Exception("No se puede ingresar 0 o una cantidad negativa");
        setSaldo(getSaldo() + saldomas);
    }
    
    
    
     /**
     * Compra un número determinado de ejemplares de un libro, 
     * actualizando el stock y el saldo de la librería.
     * 
     * @param canti Número de ejemplares a comprar.
     * @throws Exception Si la cantidad es negativa, si no hay suficiente stock o saldo.
     */
    //Método para comprar un ejemplar de un libro, actualiza el stock y el saldo
    public void comprarLibro(int canti) throws Exception{
        if (canti <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa de libros");
        if (getCantidad()>=canti){
            if (getSaldo() <= getPrecio())
                  throw new Exception ("No hay suficiente saldo para comprar");
            else{
                setCantidad(getCantidad() - canti);
                setSaldo(getSaldo() + (getPrecio() * canti));
            }
        }
        else 
            throw new Exception ("No se pueden comprar más libros de los que hay disponibles");
       
    }

    /**
     * Obtiene el nombre del libro.
     * 
     * @return Nombre del libro.
     */
    public String getNom() {
        return nom;
    }

     /**
     * Establece el nombre del libro.
     * 
     * @param nom Nuevo nombre del libro.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Obtiene la cantidad de libros en stock.
     * 
     * @return Número de libros en stock.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de libros en stock.
     * 
     * @param cantidad Nueva cantidad de libros en stock.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene el precio por cada libro.
     * 
     * @return Precio unitario del libro.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio unitario del libro.
     * 
     * @param precio Nuevo precio del libro.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el saldo actual de la librería.
     * 
     * @return Saldo actual.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la librería.
     * 
     * @param saldo Nuevo saldo de la librería.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
