package com.examples.MyPoint;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){

    }
    public MyPoint(int x, int y ){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        return new int[]{this.x,this.y};

    }
    public  void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int x, int y) {
        int xDist = this.x - x;
        int yDist = this.y - y;
        return Math.sqrt(xDist*xDist + yDist*yDist);
    }

    public double distance(MyPoint another){
        int xDist = this.x - another.x;
        int yDist = this.y - another.y;
        return Math.sqrt(xDist*xDist + yDist*yDist);
    }
    public double distance(){
        int xDist = this.x - x;
        int yDist = this.y - y;
        return Math.sqrt(Math.pow(xDist, 2) + Math.pow(yDist, 2));
    }

}
