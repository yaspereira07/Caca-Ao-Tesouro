package cacaAoTesouro;

public class Pista {
	private String nomeIlha;
	private String mensagem;
	private Pista proximaPista;
	
	public Pista(String nomeIlha,String mensagem) {
		this.nomeIlha=nomeIlha;
		this.mensagem=mensagem;
		this.proximaPista=null;
		
	}
	
	public void setNomeIlha(String nomeIlha) {
		this.nomeIlha=nomeIlha;
	}
	
	public String getNomeIlha() {
		return this.nomeIlha;
	}
	public void setMensagem(String mensagem) {
		this.mensagem=mensagem;
	}

	public String getMensagem() {
		return this.mensagem;
	}
	
	public void setProximaPista (Pista proximaPista) {
		this.proximaPista=proximaPista;
	}
	
	public Pista getProximaPista() {
		return this.proximaPista;
	}
	
}
