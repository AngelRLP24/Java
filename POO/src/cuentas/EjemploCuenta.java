package cuentas;

public class EjemploCuenta{
    public static void main(String[] args) {
        System.out.println(Cuenta.contadorCuenta);
        Cuenta cuentaR_1 = new CuentaRendimiento(500);
        System.out.println(cuentaR_1.getSaldo());
        System.out.println(cuentaR_1.generarCuenta());
        System.out.println(Cuenta.contadorCuenta);

        System.out.println();

        Cuenta cuentaI_1 = new CuentaIntereses(150);
        System.out.println(cuentaI_1.getSaldo());
        System.out.println(cuentaI_1.generarCuenta());
        System.out.println(Cuenta.contadorCuenta);
    }
}
