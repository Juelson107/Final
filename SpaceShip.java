import javax.swing.ImageIcon;

public class SpaceShip {
	private int x, y, w, h;
	private int dx, dy;
	private ImageIcon shipImg;
	
	public SpaceShip() {
		x = 0;
		y = 0;
		w = 50;
		h = 100;
		shipImg = new ImageIcon("Mario.png");
	}
	
	//use  for aliens
	public SpaceShip(int xV, int yV, int width, int height, ImageIcon i, int dxV, int dyV) {
		x = xV;
		y = yV;
		w = width;
		h = height;
		shipImg = i;
		dx = dxV;
		dy = dyV;
		
	}
	
	//use for the player ship
	public SpaceShip(int xV, int yV, ImageIcon i) {
		x = xV;
		y = yV;
		w = 50;
		h = 50;
		shipImg = i;
		dx = 0;
		dy = 0;
		
	}
	
	public void setX(int xV)
	{
		x+=xV;
	}

	public void setY(int yV)
	{
		y+=yV;
	}
	
	public int getX() 
	{
		return x;
	}
	 
	public int getY() 
	{
		return y;
	}	

	public int getH() 
	{
		return h;
	}
	 
	public int getW() 
	{
		return w;
	}	
	public void HMove(int dx) {
		x+=dx;
	}
	public void VMove(int dy) {
		y+=dy;
	}
	
	public ImageIcon getShipImg() 
	{
		return shipImg;
	}	
}