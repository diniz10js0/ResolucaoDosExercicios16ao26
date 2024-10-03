public class Exercicio19 {
    public static void main(String[] args) {
        int numero = 5; // Voce pode alterar este valor para calcular o fatorial de outro numero
        long fatorial = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " e: " + fatorial);
    }

    public static long calcularFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Numero deve ser nao negativo.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long fatorial = 1;
        for (int i = 2; i <= n; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
