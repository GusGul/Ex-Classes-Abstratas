package Ex1;

// Criação da classe abstrata de "personagem", classe que não será instanciada
public abstract class Personagem {

	// Criação dos atributos gerais de "personagem"
	protected String nome;
	protected double vida;
	protected double dano;
	protected int velocidade;
	protected int defesa;
	
	// Gets
	public String getNome() {
		return nome;
	}
	public double getVida() {
		return vida;
	}
	public double getDano() {
		return dano;
	}
	public int getVel() {
		return velocidade;
	}
	public int getDefesa() {
		return defesa;
	}
	// Sets
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setVida(double vida) {
		this.vida = vida;
	}
	public void setDano(double dano) {
		this.dano = dano;
	}
	public void setVelocidade(int vel) {
		velocidade = vel;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

	// Método de personagem para ataque, aonde o personagem Atacante tira vida do Defensor
	public void Ataque(Personagem df) {
		double vidaAtual = df.getVida();
		int defesa = df.getDefesa();
		double vidaRest = vidaAtual - (dano-defesa);

		df.setVida(vidaRest);
	}
	
	// Método para ver a situação atual do personagem
	public void Status() {
		System.out.println("Nome: " + nome
							+"\nVida: " + vida + "\n");
	}
	
}
