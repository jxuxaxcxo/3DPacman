
p public class PowerUp extends Edible{
+	
+	private int xPos, yPos;
 
 	public PowerUp(int x, int y) {
 		super(x, y);
+		xPos =x;
+		yPos =y;
 	}
 
+	public getX(){
+		return xPos;
+	}
+	
+	public getY(){
+		return yPos;
+	}
+	
+	
+	// TAKES A PACMAN OBJECT, AND IF ITS "X" AND "Y" POSITION ARE THE SAME AS THE POWER PILL RETURNS TRUE
+	public isEatenBy(Pacman p){
+		
+		if (p.getX() ==xPos && p.getY()== yPos)
+			return true;
+		
+		else 
+			return false;
+		
+	}
+	
 }
