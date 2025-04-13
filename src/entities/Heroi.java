package entities;

public class Heroi extends Personagem {
	
	
	private int lifeUp;
	
	public Heroi(int life, int attack) {
		super(life, attack);
	}

	@Override
	public int opponentsAttack(int life, int attack) {
		// TODO Auto-generated method stub
		return super.opponentsAttack(life, attack);
	}

	@Override
	public void setAttack(int attack) {
		// TODO Auto-generated method stub
		super.setAttack(attack + 1);
	}
	
	public int setLifeUp(int lifeUp) {
		return lifeUp + 1;
	}
	
	@Override
	public String toString() {
		return "------------------------------\n" + "Heroi \n" + "Vida: " + getLife() + "\nAtaque: " + getAttack() + "\n------------------------------";
	}

}
