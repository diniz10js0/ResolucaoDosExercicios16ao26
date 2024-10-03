public class Exercicio17 {
    public static void main(String[] args) {
        imprimirTabelaConversao();
    }

    public static void imprimirTabelaConversao() {
        System.out.println("Tabela de Conversão: Polegadas para Centímetros");
        System.out.println("-----------------------------------------------");
        System.out.printf("%-10s | %-10s%n", "Polegadas", "Centímetros");
        System.out.println("-----------------------------------------------");

        for (int polegadas = 1; polegadas <= 20; polegadas++) {
            double centimetros = converterParaCentimetros(polegadas);
            System.out.printf("%-10d | %-10.2f%n", polegadas, centimetros);
        }
    }

    public static double converterParaCentimetros(int polegadas) {
        return polegadas * 2.54;
    }
}
