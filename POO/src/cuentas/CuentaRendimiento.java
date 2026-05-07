package cuentas;

class CuentaRendimiento extends Cuenta{

    public CuentaRendimiento(double saldo) {
        super(saldo);
    }

    @Override
    public double generarCuenta() {
        return getSaldo() * 0.16;
    }
}
