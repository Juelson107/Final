import javax.swing.ImageIcon;

public class bg2 {

    private ImageIcon img;
    private int x,y,w,h;

    public bg2() {
        x=0;
        y=0;
        w=1134;
        h=1422;
        img = new ImageIcon("cave.png");
    }

    public void setX(int xV) {
        x+=xV;
    }
    public void setY(int yV) {
        y+=yV;
    }
    public void setW(int width) {
        w=width;
    }
    public void setH(int height) {
        h=height;
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
