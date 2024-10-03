public class Exercicio23 {
    public static void main(String[] args) {
        int quantidadePares = 4; // Numero de pares a serem impressos

        imprimirNumerosPares(quantidadePares);
    }

    public static void imprimirNumerosPares(int quantidade) {
        System.out.println("Primeiros " + quantidade + " numeros pares a partir de 2:");

        for (int i = 1; i <= quantidade; i++) {
            int par = i * 2; // Calcular o número par
            System.out.print(par + (i < quantidade ? ", " : ""));
        }
        System.out.println();     }
}
