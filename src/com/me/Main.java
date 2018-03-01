package com.me;
//encapsulation allows you restrict access to certain components
//in the objects that you are creating
//restricting access from outside the inner workings of a class
//enables you to change code without hindering other parts of program
//basically making fields private, protection
//can change names without messing up any other code
public class Main {

    public static void main(String[] args) {

        //step 5
        Player player = new Player();
        //remember we did not create a constructor, one exist by default,
        // but with no fields, so we will initialize them in now
        //this is why constructors are important, b/c in larger programs
        // creating these here can be forgotten
        //step 6
        //player.name = "Patrick";
        //step 10 fix error name to fullName
        //step 11 now lets create a new class Enhanced Player
        //and do it the correct way to show why encapsulation is
        // the way to go
        player.fullName = "Patrick";
        player.health = 20;
        player.weapon = "Sword";
        //accessed b/c we set fields to public in player class step 2

        //step 7 test it is working
        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " +
                player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health = " +
                player.healthRemaining());

        //result;
        /*
        Remaining health = 10
        Player knocked out
        Remaining health = -1
        */

        //step 8 overriding health,
        // taking control out of player class,
        // could be a problem
        //now another problem go to step 9 in player class
        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " +
                player.healthRemaining());

        //result;
        /*
        Remaining health = 10
        Player knocked out
        Remaining health = -1
        Remaining health = 189
         */

        //step 18, then step 19 run code
        EnhancedPlayer player1 = new EnhancedPlayer("Patrick", 50, "Sword");
        System.out.println("Initial health is " + player1.getHealth());
        //print result; Initial health is 50

        //step 20 change health to show if statement working
        EnhancedPlayer player2 = new EnhancedPlayer("Patrick", 200, "Sword");
        System.out.println("Initial health is " + player2.getHealth());
        //print result; Initial health is 100

    }
}

//go to player class for step 9

//complete results;
/*
Remaining health = 10
Player knocked out
Remaining health = -1
Remaining health = 189
Initial health is 50
Initial health is 100
 */