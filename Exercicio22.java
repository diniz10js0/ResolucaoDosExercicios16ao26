public class Exercicio22 {
    public static void main(String[] args) {
        int limiteSuperior = 15; // Limite superior do intervalo

        imprimirNumerosImpares(limiteSuperior);
    }

    public static void imprimirNumerosImpares(int limiteSuperior) {
        System.out.println("Numeros impares menores que " + limiteSuperior + ":");

        for (int i = 1; i < limiteSuperior; i += 2) {
            System.out.print(i + (i < limiteSuperior - 1 ? ", " : ""));
        }
        System.out.println(); 
    }
}
