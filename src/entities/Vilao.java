package entities;

public class Vilao extends Personagem{
		
	public Vilao(int life, int attack) {
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


	@Override
	public String toString() {
		return "------------------------------\n" + "Vilao \n" + "Vida: " + getLife() + "\nAtaque: " + getAttack() + "\n------------------------------";
	}
	
	

}
