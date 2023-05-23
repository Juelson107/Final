
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage; 
import java.awt.event.*; 


public class Game  extends JPanel implements Runnable, KeyListener{

	
	private BufferedImage back; 
	private int key, lives; 
    private boolean spacebar;
    private Answers w;
	private Riddles r;
	private Box nose;
	private bg bg;
	private boolean start;
	private boolean winner;
	private int count;
	private int countp;
	private Player1 player1;
	private Player2 player2;
	private Raft raft;



	public Game() {
		new Thread(this).start();	
		this.addKeyListener(this);
		key =-1; 
        spacebar=false;
        w = new Answers();
		r = new Riddles();
		lives=0;
		bg = new bg();
		Player p =new Player();
		p.playmusic("song.wav");
		new Thread(this).start();
		start=false;
		winner=false;
		count=0;
		countp=0;
		player1 = new Player1();
		player2 = new Player2();
		raft = new Raft();
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
			g2d.drawString("Press ENTER to start", 300, 300);
			if(winner==true) {
				g2d.drawString("You Won", 300, 400);
			} 
		}
		else {
			
		drawLives(g2d);
		g2d.setColor(Color.white);
		g2d.drawString(w.getDisplayWord(), 250, 455);


		
		}
		
		
		//System.out.println(lives);
		
		
		twoDgraph.drawImage(back, null, 0, 0);
		}

	

	
	private void drawLives(Graphics g2d) {


		g2d.setColor(Color.red);

		switch(lives) {

			case 0:
			g2d.drawString("Press ENTER to start", 100, 300);

			case 1:
			g2d.fillOval(1, 1, 50, 50);
			g2d.fillOval(1, 61, 50, 50);
			g2d.fillOval(1, 121, 50, 50);
			break;

			case 2:
			g2d.fillOval(1, 1, 50, 50);
			g2d.fillOval(1, 61, 50, 50);
			g2d.fillOval(1, 121, 50, 50);
			break;

			case 3:
			g2d.fillOval(1, 1, 50, 50);
			g2d.fillOval(1, 61, 50, 50);
			g2d.fillOval(1, 121, 50, 50);
			break;

			case 4:
			g2d.drawImage(bg.getImg().getImage(), bg.getX(), bg.getY(), bg.getW(), bg.getH(), this);
			g2d.drawString("You Lose", 100, 300);
			g2d.drawString("Press ESC to restart", 1, 50);
			g2d.drawImage(player1.getImg().getImage(), player1.getX(), player1.getY(), player1.getW(), player1.getH(), this);
			g2d.drawImage(player2.getImg().getImage(), player2.getX(), player2.getY(), player2.getW(), player2.getH(), this);
			break;



			case 5:
			g2d.drawImage(bg.getImg().getImage(), bg.getX(), bg.getY(), bg.getW(), bg.getH(), this);
			g2d.drawString("You Won", 100, 300);
			g2d.drawString("Press ESC to restart", 1, 50);
			g2d.drawImage(raft.getImg().getImage(), raft.getX(), raft.getY(), raft.getW(), raft.getH(), this);
			g2d.drawImage(player1.getImg().getImage(), player1.getX(), player1.getY(), player1.getW(), player1.getH(), this);
			g2d.drawImage(player2.getImg().getImage(), player2.getX(), player2.getY(), player2.getW(), player2.getH(), this);
			

			




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
		
		if(key==27) {
			restart();
		}

		if(key==10) {
			start = true;
			if (!w.checkGuess(c)) {}
				winner=false;
		}

		if(key==81) {
			lives=5;
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

