
public class PowerUp extends Edible{

	private int xPos, yPos;
	
	public PowerUp(int x, int y) {
		super(x, y);
	}
	
	
	public boolean isEatenBy(Pacman p){
		if (p.getX()==xPos && p.getY()==yPos)
		return true;
		
		else 
		return false;
	}
	
	public int getX(){
		return xPos;
	}
	
	public int getY(){
		return yPos;
	}
	

}
