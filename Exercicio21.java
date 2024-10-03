public class Exercicio21 {
    public static void main(String[] args) {
        // Definindo os dados de 20 pessoas
        String[] nomes = {
            "Gabriel", "Maria", "Pedro", "Ana", "Carlos",
            "Lucas", "Fernanda", "Ricardo", "Juliana", "Fernando",
            "Rafael", "Aline", "Roberto", "Patricia", "Gustavo",
            "Sofia", "Leandro", "Mariana", "Thiago", "Isabela"
        };

        int[] idades = {
            22, 19, 25, 20, 30,
            18, 28, 21, 24, 35,
            15, 29, 32, 22, 26,
            31, 20, 23, 27, 34, 25
        };

        char[] sexos = {
            'M', 'F', 'M', 'F', 'M',
            'M', 'F', 'M', 'F', 'M',
            'M', 'F', 'M', 'F', 'M',
            'F', 'M', 'F', 'M', 'M', 'M'
        };

        imprimirNomesMasculinosMaior21(nomes, idades, sexos);
    }

    public static void imprimirNomesMasculinosMaior21(String[] nomes, int[] idades, char[] sexos) {
        System.out.println("Nomes de pessoas do sexo masculino com mais de 21 anos:");

        for (int i = 0; i < nomes.length; i++) {
            if (sexos[i] == 'M' && idades[i] > 21) {
                System.out.println(nomes[i]);
            }
        }
    }
}
