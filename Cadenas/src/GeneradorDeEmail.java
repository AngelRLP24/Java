public class GeneradorDeEmail {
    public static void main(String[] args){
        System.out.println("*** Generador de Email ***");
        var nombreCompleto = " Ubaldo Acosta Soto ";
        System.out.println("Nombre usuario: " + nombreCompleto);
        var nombreNormalizado = nombreCompleto.strip();
        nombreNormalizado = nombreNormalizado.replace(" ", ".").toLowerCase();
        System.out.println("Nombre usuario normalizado: " + nombreNormalizado);
        System.out.println();

        var nombreEmpresa = " Global Mentoring ";
        System.out.println("Nombre empresa: " + nombreEmpresa);
        var nombreEmpresaNormalizado = nombreEmpresa.strip();
        nombreEmpresaNormalizado = nombreEmpresaNormalizado.replace(" ", "").toLowerCase();

        var extensionDelDominio = ".com.mx";
        System.out.println("Extension del dominio = " + extensionDelDominio);
        System.out.println();

        var dominioPersonalizado = String.join("", "@", nombreEmpresaNormalizado, extensionDelDominio);
        System.out.println("Dominio de email perzonalizado: " + dominioPersonalizado);

        var emailFinal = String.join("", nombreNormalizado, dominioPersonalizado);
        System.out.println("Email final generado: " + emailFinal);
    }
}