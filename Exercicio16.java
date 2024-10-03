public class Exercicio16 {
    public static void main(String[] args) {
        String input = System.console().readLine("Digite um numero: ");
        int numero = Integer.parseInt(input);

        mostrarFibonacci(numero);
    }

    public static void mostrarFibonacci(int limite) {
        int a = 0, b = 1;
        System.out.print("Sequencia de Fibonacci ate " + limite + ": ");

        while (b <= limite) {
            System.out.print(b + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        System.out.println();     }
}
