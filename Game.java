
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage; 
import java.awt.event.*; 


public class Game  extends JPanel implements Runnable, KeyListener{

	
	private BufferedImage back; 
	private int key, lives; 
    private boolean spacebar;
    private Words w;
	private Box nose;
	private bg bg;
	private bg2 bg2;
	private boolean start;
	private boolean winner;
	private int count;
	private int countp;
	private PlayerShip1 player1;
	private PlayerShip2 player2;


	public Game() {
		new Thread(this).start();	
		this.addKeyListener(this);
		key =-1; 
        spacebar=false;
        w = new Words();
		lives=0;
		bg = new bg();
		bg2 = new bg2();
		player1 = new PlayerShip1(1,1);
		player2 = new PlayerShip2(1, 1);
		//player p =new player();
		//p.playmusic("song.wav");
		new Thread(this).start();
		start=false;
		winner=false;
		count=0;
		countp=0;
	}

	
	
	public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }
	   		catch(Exception e)
	      {
	      }
	  	}
	

	
	
	
	public void paint(Graphics g){
		
		Graphics2D twoDgraph = (Graphics2D) g; 
		if( back ==null)
			back=(BufferedImage)( (createImage(getWidth(), getHeight()))); 
		

		Graphics g2d = back.createGraphics();
	
		g2d.clearRect(0,0,getSize().width, getSize().height);

		g2d.drawImage(bg.getImg().getImage(), bg.getX(), bg.getY(), bg.getW(), bg.getH(), this);
		


		g2d.setFont( new Font("Broadway", Font.BOLD, 50));
		


		if(start==false) {
			g2d.setColor(Color.white);
			g2d.setFont(new Font("Times New Roman", Font.BOLD, 72));
			g2d.drawString(" ", 300, 300);
			if(winner==true) {
				g2d.drawString("You Won", 300, 400);
			} 
		}
		else {
			
		drawLives(g2d);
		g2d.setColor(Color.white);
		

		
		}
		
		
		//System.out.println(lives);
		
		
		twoDgraph.drawImage(back, null, 0, 0);
		}

	

	
	private void drawLives(Graphics g2d) {


		g2d.setColor(Color.white);

		switch(lives) {


			case 0:
			g2d.drawImage(bg.getImg().getImage(), bg.getX(), bg.getY(), bg.getW(), bg.getH(), this);
			g2d.drawImage(player1.getShipImg().getImage(), player1.getX(), player1.getY(), player1.getW(), player1.getH(), this);
		g2d.drawImage(player2.getShipImg().getImage(), player2.getX(), player2.getY(), player2.getW(), player2.getH(), this);
		break;

			case 1:
			g2d.drawImage(bg2.getImg().getImage(), bg2.getX(), bg2.getY(), bg2.getW(), bg2.getH(), this);
			g2d.drawImage(player1.getShipImg().getImage(), player1.getX(), player1.getY(), player1.getW(), player1.getH(), this);
		g2d.drawImage(player2.getShipImg().getImage(), player2.getX(), player2.getY(), player2.getW(), player2.getH(), this);
			break;
			
			
			

			




		}


	}



	//DO NOT DELETE
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

		//dont use
		
	}




//DO NOT DELETE
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		key= e.getKeyCode();
		System.out.println(key);
		char c = e.getKeyChar();
		System.out.println("letter picked " + c);

		if(!w.checkGuess(c)) {

			lives++;
		}

		if(key == 37) {
			player1.setX(-5);
		}
		
		if(key == 39) {
			player1.setX(5);

		}

		if(key == 38) {
			player1.setY(-5);
		}

		if(key == 40) {
			player1.setY(5);
		}
		if(key == 50) {
		
		}
		if(key == 65) {
			player2.setX(-5);
		}
		
		if(key == 68) {
			player2.setX(5);

		}

		if(key == 87) {
			player2.setY(-5);
		}

		if(key == 83) {
			player2.setY(5);
		}
		
		if(key==27) {
			restart();
		}

		if(key==10) {
			start = true;
			if (!w.checkGuess(c)) {}
				winner=false;
		}

		if(key==49) {
			lives=0;
		}

		if(key==50) {
			lives=1;
		}
			

			
		}
		
		
	
	


	//DO NOT DELETE
	@Override
	public void keyReleased(KeyEvent e) {
		
		
		
		
	}

	public void reset() {
			start=false;
			winner=false;
			lives=0;
			Graphics g2d = back.createGraphics();
			drawLives(g2d);
		g2d.setColor(Color.white);
		g2d.drawString(w.getDisplayWord(), 250, 455);
		
	}

	public void restart() {
		reset();
		start=false;
	}
	
	

	
}

