package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println("Create your game piece!!");
        GamePiece joshPiece = new GamePiece();
        GamePiece dogPiece = new GamePiece();

        joshPiece.setPositionY(5);
        joshPiece.setPositionX(5);

        System.out.println("Check initial position");

        System.out.println(joshPiece.getPosition());

        System.out.println(dogPiece.getPosition());

        joshPiece.move(25, 50);
        System.out.println("check position after moving!");
        System.out.println(joshPiece.getPosition());

        joshPiece.freeze();
        System.out.println("Check if Frozen");
        System.out.println(joshPiece.frozen);

        joshPiece.move(10, 10);
        System.out.println(joshPiece.getPosition());

        joshPiece.unfreeze();
        System.out.println("Check if still frozen");
        System.out.println(joshPiece.frozen);
        joshPiece.move(10, 10);
        System.out.println(joshPiece.getPosition());

    }
}

