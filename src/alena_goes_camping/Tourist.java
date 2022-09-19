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

    public String toString(){
        return name + " goes camping and has " + Arrays.toString(belongings) + " .";
    }
}
