package Encapsulation.Point;

public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y){

        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance(){
        //double total = ((0 - getX()) * (0 - getX())) + ((0 - getY()) * (0 - getY()));
        double total = ((0 - this.x) * (0 - this.x)) + ((0 - this.y) * (0 - this.y));
        return Math.sqrt(total);
    }

    public double distance (int x, int y){
        //double total = ((getX() - x) * (getX() - x)) + ((getY() - y) * (getY() - y));
        double total = ((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y));

        return Math.sqrt(total);
    }

    public double distance (Point xy){
        double total = ((getX() - xy.getX()) * (getX()- xy.getX())) + ((getY() - xy.getY()) * (getY() - xy.getY()));
        //double total = ((this.x - xy.getX()) * (this.x - xy.getX())) + ((this.y - xy.getY()) * (this.y - xy.getY()));

        return Math.sqrt(total);
    }
}
