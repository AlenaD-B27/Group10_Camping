package alena_goes_camping;

import java.util.Arrays;

public class Tourist {

    String name;
    private String [] belongings = new String [3];

    public Tourist(String name) {
        this.name = name;
    }

    public String[] getBelongings() {
        return belongings;
    }

    public void setBelongings(String[] belongings) {
        this.belongings = belongings;
    }



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


    public String toString(){
        return name + " goes camping and has " + Arrays.toString(belongings) + " .";
    }
}
