package Ex1;

//Classe "Filha", especializada, que herda tudo da classe abstrata "Mãe" Personagem
public class Mago extends Personagem {

	// Atributos únicos
	public double mana;
	
	// Get e Set
	public double getMana() {
		return mana;
	}
	public void setMana(double mana) {
		this.mana = mana;
	}
	
	public Mago(String nome, double vida, double dano, int velocidade, double mana) {
		this.nome = nome;
		this.vida = vida;
		this.dano = dano;
		this.velocidade = velocidade;
		this.mana = mana;
	}
	
	// Magia do mago, ignora defesas, SOBRESCREVE o método Ataque do Personagem, usando o mesmo nome e parâmetros (Polimorfismo)
	@Override
	public void Ataque(Personagem df) {
		mana -= 50;
		double vidaAtual = df.getVida();
		double vidaRest = vidaAtual - dano;
		
		df.setVida(vidaRest);
	}
	
	// Método que SOBRESCREVE status de Personagem, usando o mesmo nome e parâmetros (Polimorfismo)
	@Override
	public void Status() {
		System.out.println("Nome: " + nome
							+"\nVida: " + vida
							+"\nMana: " + mana + "\n");
	}
	
}
