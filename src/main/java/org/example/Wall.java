package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height){
        this.width=width;
        this.height=height;
    }
    public double getWidth(){
        return this.width;
    }
    public double getHeight(){
        return this.height;
    }
    public double setWidth(double newWidth){
        if(newWidth<0){
            return this.width=0;
        } else {
            return this.width=newWidth;
        }
    }
    public double setHeight(double newHeight){
        if(newHeight<0){
            return this.height=0;
        } else {
            return this.height=newHeight;
        }
    }
    public double getArea(){
        return this.width*this.height;
    }
}
