package Vitalii_goes_camping;

import java.util.Arrays;

public class VitaliiTourist {
    String name;
    public  String [] belongings = new String[3];

    public VitaliiTourist ( String name) {
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
