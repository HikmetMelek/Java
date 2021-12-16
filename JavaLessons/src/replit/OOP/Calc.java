package replit.OOP;

public class Calc {
    private String names;
    private int x,y,result;

    public Calc() {

    }

    public int getResult() {
        return result;
    }
    public void plus(){
        result=x+y;
    }

    public void minus(){
        result=x-y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


}
