package com.me;
//step 1
//this is an example class without encapsulation
//and note no constructor created, but there is a
// default constructor with no parameters

public class Player {

    //step 2 make fields, made public instead of private
    //public String name;
    public String fullName;
    //step 9 changing name to fullName above, error in main
    //have to fix in step 10
    public int health;
    public String weapon;

    //step 3 method losehealth
    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            //reduce number of lives remaining for player
        }
    }

    //step 4 method for health remaining
    //then go to main class for step 5
    public int healthRemaining(){
        return this.health;

    }

}

//step 5 go to main to create instances and run program