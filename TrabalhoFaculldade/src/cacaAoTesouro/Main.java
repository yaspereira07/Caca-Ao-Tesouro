package cacaAoTesouro;

/*
 * Trabalho Prático em Dupla - Caça ao Tesouro com Listas Encadeadas
 * Disciplina: Estrutura de Dados
 * Professora: Karina Leite
 *
 * Integrante 1: Ana Jaqueline Gomes Souza dos Santos - 200040523
 * Integrante 2: Yasmin Morais Melo Lima Pereira - 200040408
 */

public class Main {

    public static void main(String[] args) {

        CacaAoTesouro jogo = new CacaAoTesouro();

        jogo.adicionarPista("Ilha dos Pássaros", "Procure pela palmeira torta na praia leste.");
        jogo.adicionarPista("Ilha da Névoa", "Siga o rio até a caverna; atente-se às rochas.");
        jogo.adicionarPista("Ilha do Esqueleto", "Cuidado com as armadilhas no caminho de pedra.");
        jogo.adicionarPista("Ilha das Sereias", "Navegue ao sul até encontrar o rochedo azul.");
        jogo.adicionarPista("Ilha do Baú de Ouro", "PARABÉNS! Você encontrou o tesouro do Capitão Morgan!");

        System.out.println("=== Rota original ===");
        jogo.iniciarJornada();

        System.out.println("\nUm pirata rival destruiu a pista da Ilha do Esqueleto!");
        jogo.removerPista("Ilha do Esqueleto");

        System.out.println("\n=== Rota após a sabotagem ===");
        jogo.iniciarJornada();

        System.out.println("\n=== Buscando o tesouro ===");
        Pista encontrada = jogo.buscarPista("Ilha do Baú de Ouro");
        if (encontrada != null) {
            System.out.println("Mensagem encontrada: " + encontrada.getMensagem());
        }
    }

}
