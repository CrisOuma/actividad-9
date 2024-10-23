public class Paciente {
    // Atributos encapsulados
    private double peso;
    private double altura;

    // Constructor
    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    // Getters y setters para peso y altura
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular el IMC
    public double calcularIMC() {
        return peso / Math.pow(altura, 2);
    }

    // Método para obtener el diagnóstico basado en el IMC
    public String diagnosticoIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "BAJO PESO";
        } else if (imc < 25) {
            return "PESO NORMAL";
        } else if (imc < 30) {
            return "SOBREPESO";
        } else if (imc < 35) {
            return "OBESIDAD TIPO 1";
        } else if (imc < 40) {
            return "OBESIDAD TIPO 2";
        } else {
            return "OBESIDAD TIPO 3";
        }
    }
}

