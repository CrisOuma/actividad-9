import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Ingrese su peso en kg (ej. 45.3): ");
            double peso = teclado.nextDouble();
            System.out.print("Ingrese su altura en metros (ej. 1.65): ");
            double altura = teclado.nextDouble();

            // Crear objeto Paciente
            Paciente paciente = new Paciente(peso, altura);

            // Calcular IMC y diagnóstico
            double imc = paciente.calcularIMC();
            String diagnostico = paciente.diagnosticoIMC();

            System.out.println("Su IMC es: " + imc);
            System.out.println("Usted se encuentra con: " + diagnostico);

        } catch (Exception e) {
            System.out.println("Error en la entrada de datos. Por favor, ingrese valores numéricos válidos.");
        } finally {
            teclado.close();
        }
    }
}
