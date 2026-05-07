package cuentas;

public abstract class Cuenta{
    static public int contadorCuenta = 0;
    private String numeroCuenta;
    private double saldo;
    private String usuario;

    public Cuenta(double saldo){
        this.saldo = saldo;
        Cuenta.contadorCuenta++;
    }

    public abstract double generarCuenta();

    public String getNumeroCuenta(){
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}

