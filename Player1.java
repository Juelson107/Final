import javax.swing.ImageIcon;

public class Player1 {

    private ImageIcon img;
    private int x,y,w,h;

    public Player1() {
        x=200;
        y=250;
        w=500;
        h=500;
        img = new ImageIcon("JMC.png");

    }

    public void setX(int xV) {
        x+=xV;
        //shorthand for x =   x+xV
    }
    public void setY(int yV) {
        y=yV;
        //snap the photo to a new y position
    }
    public void setW(int width) {
        w=width;
    }
    public void setH(int height) {
        h= height;
    }
    public void setImg(ImageIcon i) {
        img=i;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getW() {
        return w;
    }
    public int getH() {
        return h;
    }
   
    public ImageIcon getImg() {
        return img;
    }

}