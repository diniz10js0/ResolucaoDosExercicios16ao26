public class Exercicio18 {
    public static void main(String[] args) {
        int limiteInferior = 0; // Limite inferior em graus Celsius
        int limiteSuperior = 100; // Limite superior em graus Celsius
        int incremento = 10; // Incremento em graus Celsius

        imprimirTabelaConversao(limiteInferior, limiteSuperior, incremento);
    }

    public static void imprimirTabelaConversao(int limiteInferior, int limiteSuperior, int incremento) {
        System.out.println("Tabela de Conversão: Graus Celsius para Graus Fahrenheit");
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-15s | %-15s%n", "Celsius", "Fahrenheit");
        System.out.println("-------------------------------------------------------");

        for (int celsius = limiteInferior; celsius <= limiteSuperior; celsius += incremento) {
            double fahrenheit = converterParaFahrenheit(celsius);
            System.out.printf("%-15d | %-15.2f%n", celsius, fahrenheit);
        }
    }

    public static double converterParaFahrenheit(int celsius) {
        return (9.0 / 5.0) * celsius + 32;
    }
}
