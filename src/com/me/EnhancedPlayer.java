package com.me;
//step 11 showing why encapsulation works better
public class EnhancedPlayer {

    //step 12 creating fields
    private String name;
    private int health = 100; //step 14 defining a default value for health
    private String weapon;

    //step 13 constructor
    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        //step 15 if statement for health
        if(health > 0 && health <= 100){
            this.health = health;
        }
        //this.health = health;  *now in if statment above
        this.weapon = weapon;

    }

    //step 16 method for loseHealth
    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            //reduce number of lives remaining for player
        }
    }

    //step 17 create getter for health
    //now got to main for step 18
    public int getHealth() {
        return health;
    }
}

