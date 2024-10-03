public class Exercicio25 {
    public static void main(String[] args) {
        int[] votos = new int[4]; // Votos para os 4 candidatos
        int totalVotos = 0; // Total de votos
        int[] simulacaoVotacao = {1, 2, 3, 4, 2, 1, -1, 3, 1, -1}; // Simulação dos votos

        // Processar os votos da simulação
        for (int voto : simulacaoVotacao) {
            if (voto == -1) {
                break; // Encerrar a votação
            }
            if (voto >= 1 && voto <= 4) {
                votos[voto - 1]++; // Incrementar o voto para o candidato correspondente
                totalVotos++; // Incrementar o total de votos
            }
        }

        // Exibir o resultado
        System.out.println("Resultados da Eleicao:");
        for (int i = 0; i < votos.length; i++) {
            double percentual = (totalVotos > 0) ? (votos[i] * 100.0 / totalVotos) : 0;
            System.out.printf("Candidato %d: %d votos (%.2f%%)%n", (i + 1), votos[i], percentual);
        }
        System.out.printf("Total de alunos eleitores: %d%n", totalVotos);
    }
}
