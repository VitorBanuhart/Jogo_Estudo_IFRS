package entities;

public abstract class Personagem {
	
	private int life;
	private int attack;
	
	public Personagem(int life, int attack) {
		this.life = life;
		this.attack = attack;
	}

	public int defenseExecuted() {
		return life +1;
	}
	
	public int opponentsAttack(int life, int attack) {
		life -= attack;
		attack +=1;
		return life;
	
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	@Override
	public String toString() {
		
		return "------------------------------\n" + "Pontos de vida: " + life + "\n" + "Pontos de ataque: " + attack + "\n" + "------------------------------";
	}
	
	
}
