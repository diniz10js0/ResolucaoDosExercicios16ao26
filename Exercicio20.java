public class Exercicio20 {
    public static void main(String[] args) {
        int limiteSuperior = 20; // Limite superior do intervalo
        int incremento = 5; // Incremento

        imprimirIntervalo(limiteSuperior, incremento);
    }

    public static void imprimirIntervalo(int limiteSuperior, int incremento) {
        System.out.println("Numeros de 0 ate " + limiteSuperior + " com incremento de " + incremento + ":");

        for (int i = 0; i <= limiteSuperior; i += incremento) {
            System.out.print(i + (i < limiteSuperior ? ", " : ""));
        }
        System.out.println(); // Nova linha apos a impressão
    }
}
