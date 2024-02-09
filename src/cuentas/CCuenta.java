package cuentas;

/**
 * Esta clase representa una cuenta bancaria con nombre, cuenta, saldo y tipo de interés.
 * @author Alberto González Fernández
 * 
 * @version 1.0
 * 
 */
public class CCuenta {

    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;
    
    /**
     * Número de cuenta de la cuenta.
     */
    private String cuenta;
    
    /**
     * Saldo actual de la cuenta.
     */
    private double saldo;
    
    /**
     * Tipo de interés aplicado a la cuenta.
     */
    private double tipoInterés;

    /**
     * Constructor por defecto de la clase CCuenta. Inicializa todas las
     * variables a 0.
     */
    public CCuenta() {
    }

    /**
     * Constructor de la clase CCuenta con los valores iniciales para el
     * nombre, cuenta, saldo y el tipo de interés.
     * 
     * @param nom parámetro de tipo String. Representa el nombre del propietario de la cuenta.
     * @param cue parámetro de tipo String. Representa el número de cuenta bancaria.
     * @param sal parámetro del tipo doble. Representa el saldo de la cuenta.
     * @param tipo parámetro de tipo double. Representa los tipos de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método que devuelve el saldo de la cuenta. 
     * 
     * @return getSaldo() El valor retornado es el saldo de la cuenta.
     */
    public double estado() {
        
        return getSaldo();
    }

    /**
     * Método que permite ingresar una cantidad en la cuenta bancaria. Con if
     * arroja una excepción si la cantidad a ingresar es menor que 0. Si es mayor,
     * añade la cantidad al saldo.
     * 
     * @param cantidad Cantidad a ingresar en cuenta.
     * @throws Exception Produce una excepción si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método que permite retirar una cantidad de la cuenta. Con if controla 
     * que la cantidad no sea menor o igual a 0. Con otro if controla que no se 
     * retire una cantidad mayor a el saldo existente con una llamada al método estado.
     * Si todo es correcto, se resta la cantidad retirada y actualiza el saldo.
     * 
     * @param cantidad Cantidad a retirar de la cuenta.
     * @throws Exception Lanza excepción si la cantidad es menor o igual a 0 y si
     * la cantidad a retirar es mayor que el saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Devuelve el nombre del titular de la cuenta.
     * 
     * @return Nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre Nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de la cuenta bancaria.
     * 
     * @return Número de la cuenta bancaria.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de la cuenta bancaria.
     * 
     * @param cuenta Número de la cuenta bancaria.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo de la cuenta bancaria.
     * 
     * @return saldo Saldo de la cuenta bancaria.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta bancaria.
     * 
     * @param saldo Saldo de la cuenta bancaria.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés aplicado a la cuenta bancaria.
     * 
     * @return tipoInteres Tipo de interés de la cuenta bancaria.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta bancaria.
     * 
     * @param tipoInterés Tipo de interés de la cuenta bancaria.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
