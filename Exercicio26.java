public class Exercicio26 {
    public static void main(String[] args) {
        double num1 = 10.5; // Primeiro numero
        double num2 = 2.5;  // Segundo numero

        // Simulacao de opcoes escolhidas pelo usuario
        int[] opcoes = {1, 2, 3, 4, 9}; // 1: Adicao, 2: Subtracao, 3: Multiplicacao, 4: Divisao, 9: Sair

        for (int opcao : opcoes) {
            if (opcao == 9) {
                System.out.println("Encerrando o programa.");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.printf("Adicao: %.2f + %.2f = %.2f%n", num1, num2, num1 + num2);
                    break;
                case 2:
                    System.out.printf("Subtracao: %.2f - %.2f = %.2f%n", num1, num2, num1 - num2);
                    break;
                case 3:
                    System.out.printf("Multiplicacao: %.2f * %.2f = %.2f%n", num1, num2, num1 * num2);
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.printf("Divisao: %.2f / %.2f = %.2f%n", num1, num2, num1 / num2);
                    } else {
                        System.out.println("Erro: Divisao por zero não e permitida.");
                    }
                    break;
                default:
                    System.out.println("Opçao invalida. Tente novamente.");
            }
        }
    }
}
