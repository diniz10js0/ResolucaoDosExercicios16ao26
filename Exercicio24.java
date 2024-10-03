public class Exercicio24 {
    public static void main(String[] args) {
        double total = 0.0; // Total a ser pago

        // Simulando dados de entrada
        double[] precos = {10.50, 20.00, -5.00, 15.75, 0.0}; 
        int[] quantidades = {2, 3, 1, -1, 0}; 
        for (int i = 0; i < precos.length; i++) {
            double preco = precos[i];
            int quantidade = quantidades[i];

            // Verificar se a quantidade e zero para terminar o loop
            if (quantidade == 0) {
                break;
            }

            // Verificar o preço valido
            while (preco < 0) {
                System.out.println("Preco invalido. Digite um preço positivo.");
                preco = 10.50;             }

            // Verificar a quantidade valida
            while (quantidade < 0) {
                System.out.println("Quantidade invalida. Digite uma quantidade positiva.");
                quantidade = 2;  
            }

            total += preco * quantidade;
        }

        System.out.printf("Total a ser pago: R$ %.2f%n", total);
    }
}
