
public class Edible extends Immovable{

	public Edible(int x, int y) {
		super(x, y);
	}
	
	
	// TAKES A PACMAN OBJECT, AND IF ITS "X" AND "Y" POSITION ARE THE SAME AS THE OBJECT RETURNS TRUE
	public isEatenBy(Pacman p){
		
		if (p.getX() ==xPos && p.getY()== yPos)
			return true;
		
		else 
			return false;
		
	}

}
