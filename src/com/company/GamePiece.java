package com.company;

public class GamePiece {     //this is a class
    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    int positionX;
    int positionY;
    boolean frozen;
    String color;
    String name;



    // getters
    public int getPositionX() {       //these are methodss
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }




    // setters
    public boolean isFrozen() {
        return frozen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void freeze () {
         frozen = true;
        System.out.println("yeah you're frozen my man");
    }


    public String getPosition() {
        return "Position X: " + this.positionX + ", Position Y: " + this.positionY;
    }





    public void move (int posX, int posY) {
         if(!this.frozen) {
             positionX = posX;     // i.e. posX = 50, posY = 90
             positionY = posY;    // actual position equals the coordinate placeholder
         } else {
             System.out.println("Sorry, cant move! you're frozen!");

         }
    }

    public void unfreeze () {
        frozen = false;
        System.out.println("hey bro, you're not frozen anymore!");
    }



    public GamePiece () {
        this.positionX = positionX;   //set to itself means its 0
        this.positionY = positionY;   // set to itself means its 0
        this.frozen = false;          // if i change this is stays that way, set in stone
        this.color = color;
        this.name = name;       // i.e. if i set positionX to 10, it's going to stay 10
    }
}








