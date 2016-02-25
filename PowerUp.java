
public class PowerUp extends Edible{
	
	private int xPos, yPos;

	public PowerUp(int x, int y) {
		super(x, y);
		xPos =x;
		yPos =y;
	}

	public getX(){
		return xPos;
	}
	
	public getY(){
		return yPos;
	}

	
}
