
public class Calculadora {
    public static void main(String[] args) {
        // Exemplo de uso da calculadora
        int resultado = multiplicar(2, 3);
        System.out.println("Resultado: " + resultado);
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new IllegalArgumentException("Não é possível dividir por zero.");
        }
    }
}
