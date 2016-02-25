
public class Pacman extends Movable{
	private int livesLeft;
	
	public Pacman(int x, int y) {
		super(x, y);
		livesLeft = 3;
	}
	
	public boolean stillAlive(){
		return livesLeft > 0;
	}
}
