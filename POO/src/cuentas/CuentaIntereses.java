package cuentas;

class CuentaIntereses extends Cuenta {


    public CuentaIntereses(double saldo) {
        super(saldo);
    }

    @Override
    public double generarCuenta() {
        return getSaldo() * 0.08;
    }
}
