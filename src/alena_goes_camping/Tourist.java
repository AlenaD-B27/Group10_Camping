package alena_goes_camping;

import java.util.Arrays;

public class Tourist {

    // variables:

    String name;
    private String [] belongings = new String [3];

    // constructor:

    public Tourist(String name) {
        this.name = name;
    }

    // encapsulating belongings. We really do not use this encapsulation but for practice I just wanted to remind the rules of encapsulation: PRIVATE variable has PUBLIC getter and setter.

    public String[] getBelongings() {
        return belongings;
    }

    public void setBelongings(String[] belongings) {
        this.belongings = belongings;
    }

    // methods: setUpTent, makeFire, playMusic. Here I wanted us to practice iteration through Array.



    public void setUpTent(){
        int countTent = 0;
        for (int i = 0; i < belongings.length; i++ ){
            if(belongings[i].equals("tent")){
                countTent++;
                break;
            }
        }

        if (countTent == 0){
            System.out.println(name + " doesn't have a tent, tonight " + name + " is sleeping under the stars.");
        } else {
            System.out.println("Tent is ready, tonight " + name + " is sleeping in a tent.");
        }
    }


    public void makeFire(){
        int countFire = 0;
        for (int i = 0; i < belongings.length; i++ ){
            if(belongings[i].equals("matches") || belongings[i].equals("lighter") || belongings[i].equals("flint")){
                countFire++;
                break;
            }
        }

        if (countFire == 0){
            System.out.println(name + " has no items to make the fire.");
        } else {
            System.out.println("The fire is ready.");
        }
    }


    public void playMusic(){
        int countMusic = 0;
        for (int i = 0; i < belongings.length; i++ ){
            if(belongings[i].equals("guitar") || belongings[i].equals("speaker") || belongings[i].equals("radio")){
                countMusic++;
                break;
            }
        }

        if (countMusic == 0){
            System.out.println(name + " has no music so " + name + " is singing, the wolves think it's their brother");
        } else {
            System.out.println("The music is fun.");
        }
    }


    // toString method

    public String toString(){
        return name + " goes camping and has " + Arrays.toString(belongings) + " .";
    }
}
