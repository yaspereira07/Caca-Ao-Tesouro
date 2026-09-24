package cacaAoTesouro;

public class Main {

	public static void main(String[] args) {
	
		
		CacaAoTesouro jogo=new CacaAoTesouro();
		boolean verificar;
			
		jogo.adicionarPista("Ilha dos Pássaros", " Procure pela palmeira torta na praia leste.");	
		
		jogo.adicionarPista("Ilha da Névoa", " Siga o rio até a caverna; atente-se às rochas.");	
		
		jogo.adicionarPista("Ilha do Esqueleto", " Cuidado com as armadilhas no caminho de pedra.");	
		
		jogo.adicionarPista("Ilha das Sereias", " Navegue ao sul até encontrar o rochedo azul.");	
		
		jogo.adicionarPista("Ilha do Baú de Ouro", " PARABÉNS! Você encontrou o tesouro do Capitão Morgan!.");	
		
		jogo.iniciarJornada();
		
		jogo.removerPista("ilha do esqueleto");
		
		
		jogo.iniciarJornada();
		
		jogo.buscarPista("Ilha do baú de Ouro");
		
		Pista encontrada = jogo.buscarPista("Ilha do Baú de Ouro");
		System.out.println();
		System.out.println(encontrada.getMensagem());
	}

}
