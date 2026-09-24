package cacaAoTesouro;

public class CacaAoTesouro {
	private Pista primeiraPista ;
	private Pista ultimaPista ;
	
	public CacaAoTesouro() {
		this.primeiraPista=null;
		this.ultimaPista=null;
	}
	
	
	public void adicionarPista(String nomeIlha,String Mensagem) {
		
		Pista novaPista=new Pista(nomeIlha,Mensagem);
		
		if(primeiraPista==null) {
			primeiraPista = novaPista;
			ultimaPista=novaPista;
		}else {
			ultimaPista.setProximaPista(novaPista);
			ultimaPista=novaPista;
		}
		
	}
	public void iniciarJornada() {
		
		Pista atual =primeiraPista;
		
		if(primeiraPista==null) {
			System.out.println("A lista de Pistas estão vazias ");
			}else {
				while(atual!=null) {
					System.out.println("Ilha: "+atual.getNomeIlha()+"---"+ " Mensagem: "+atual.getMensagem());
					atual=atual.getProximaPista();
			
				}
			}	
	}
	
	public Pista buscarPista(String nomeIlha) {
		Pista atual=primeiraPista;
		while(atual!=null) {
			if(atual.getNomeIlha().equalsIgnoreCase(nomeIlha)) {
				return atual;
			}else {
				atual=atual.getProximaPista();
			}
			
		}
		System.out.println("\nSem dica");
		return null;
		
		
	}
	
	public boolean removerPista(String nomeIlha) {
		Pista anterior=null;
		Pista atual=primeiraPista;
		
		while(atual!=null){
			
			if(atual.getNomeIlha().equalsIgnoreCase(nomeIlha)) {
			
				if(anterior==null) {
					primeiraPista=atual.getProximaPista();
				}else {
					anterior.setProximaPista(atual.getProximaPista());
				}
				
				if(atual==ultimaPista) {
					ultimaPista=anterior;
				}
				return true;
			}
			
			anterior=atual;
			atual=atual.getProximaPista();
			
		}
		
		System.out.println("Ilha não encontrada (*-*) ");
		
		return false;
	}
	
	
}
