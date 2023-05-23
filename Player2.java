import javax.swing.ImageIcon;

public class Player2 {

    private ImageIcon img;
    private int x,y,w,h;

    public Player2() {
        x=500;
        y=250;
        w=500;
        h=500;
        img = new ImageIcon("LMC.png");

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