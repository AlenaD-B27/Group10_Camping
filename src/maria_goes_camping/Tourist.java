package maria_goes_camping;

import java.util.ArrayList;
import java.util.Arrays;

public class Tourist {
    String name;
    private String[] belongings;

    public Tourist(String name) {
        this.name = name;
    }

    public String[] getBelongings() {
        return belongings;
    }

    @Override
    public String toString() {
        return name + " goes camping and has " + Arrays.toString(belongings);

    }
    public void setBelongings(String [] belongings) {
        if(belongings.length == 3) {
            //  this.belongings = new String[3];
            this.belongings = belongings;
        }else{
            System.out.println("The number of belongings should be 3 ");
        }
    }
    public void setUpTent(){
        ArrayList<String> items = new ArrayList<>(Arrays.asList(belongings));
        if(items.contains("tent")){
            System.out.println("Tent is ready, tonight " + name + " is sleeping in a tent.");
        }else{
            System.out.println(name + " doesn't have a tent, tonight name is sleeping under the stars.");
        }
    }
    public void makeFair(){
        ArrayList<String> items = new ArrayList<>(Arrays.asList(belongings));
        if(items.contains("matches") || items.contains("lighter") || items.contains("flint")){
            System.out.println("The fire is ready");
        }else{
            System.out.println(name + " has no items to make the fire.");
        }
    }
    public void playMusic(){
        ArrayList<String> items = new ArrayList<>(Arrays.asList(belongings));
        if(items.contains("radio") || items.contains("guitar") || items.contains("speaker")){
            System.out.println("The music is fun");
        }else{
            System.out.println(name + " has no music so "+ name + " is singing, the wolves think it's their brother");
        }
        /*ArrayList<String> items = new ArrayList<>(Arrays.asList(belongings));
        for(String eachItems : items){
            if ((eachItems.equals("guitar")) || (eachItems.equals("radio")) || (eachItems.equals("speaker"))){
                System.out.println("The music is fun");
            }else{
                System.out.println(name + " has no music so "+ name + " is singing, the wolves think it's their brother");
            }
        }*/
    }

}
