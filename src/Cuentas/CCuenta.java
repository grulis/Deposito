package Cuentas;
/**
 * Clase que nos permite obtener objetos del tipo cuenta
 * @author Florencio Atienza Martinez 1ºDAM CIDEAD
 */
public class CCuenta {
    
/** denominacion. Variable para manejar el nombre */
    private String denominacion;    
/** cuenta. Variable para almacenar la cuenta */  
    private String cuenta;
/** saldo. Variable para almacenar el saldo */   
    private double saldo;
/** tipoInteres. Variable que contiene el tipo de interes */    
    private double tipoInterés;     

    /**
     * Metodo Constructor sin parametros
     */
    public CCuenta()
    {
    }
    
    /**
     * Metodo Constructor de la clase CCuenta con 4 argumentos
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        denominacion =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Metodo que devuelve el saldo de la cuenta.
     * @return Retorna el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Metodo que nos permite ingresar una cantidad concreta de dinero pasada
     * por parametro en la cuenta.
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Metodo que nos permite retirar una cantidad concreta de dinero pasada por
     * argumento de la cuenta.
     * @param cantidad
     * @throws Exception 
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
     * Metodo que nos permite conocer el valor de la denominación
     * @return the denominacion
     */
    public String getDenominacion() {
        return denominacion;
    }

    /**
     * Metodo que nos permite modificar la denominación con un valor pasado por
     * parametro.
     * @param denominacion the denominacion to set
     */
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    /**
     * Metodo que nos permite conocer la cuenta bancaria
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Metodo que nos permite modificar la denominación del dueño de la cuenta
     * con un valor pasado por parametro.
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Metodo que nos permite conocer el saldo de la cuenta 
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo que nos permite modificar el saldo de una cuenta con un valor 
     * pasado por parametro.
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo que nos permite conocer el tipo de Interes
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Metodo que nos permite modificar el tipo de interes pasado por
     * parametro.
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
