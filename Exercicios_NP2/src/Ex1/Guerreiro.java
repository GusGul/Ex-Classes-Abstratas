package Ex1;

// Classe "Filha", especializada, que herda tudo da classe abstrata "Mãe" Personagem
public class Guerreiro extends Personagem {

	// Atributos únicos
	protected int armadura;
	protected int escudo;
	
	// Gets
	public int getArmadura() {
		return armadura;
	}
	public int getEscudo() {
		return escudo;
	}
	// Sets
	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}
	public void setEscudo(int escudo) {
		this.escudo = escudo;
	}
	
	// Construtor
	public Guerreiro(String nome, double vida, double dano, int velocidade, int armadura, int escudo) {
		this.nome = nome;
		this.vida = vida;
		this.dano = dano;
		this.velocidade = velocidade;
		defesa = armadura + escudo;
	}
	
}
