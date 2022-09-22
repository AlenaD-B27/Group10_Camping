package alena_goes_camping;


import java.util.Scanner;

public class Camping {
    public static void main(String[] args) {

        // creating the Scanner object:

        Scanner input = new Scanner (System.in);

        // creating the Tourist object:

        Tourist tourist1 = new Tourist("Alena");

        //TODO using the Scanner to input Array. It's a tricky moment. If someone has different approach it needs to be reviewed.

        System.out.println("Enter 3 belongings:");
        tourist1.setBelongings(new String [] {input.next(),input.next(),input.next()});

        // testing the methods with positive (tent, matches, radio) and negative (chair, cigarettes, chips) inputs.

        System.out.println(tourist1);

        tourist1.setUpTent();

        tourist1.makeFire();

        tourist1.playMusic();

        /*

        outputs:

        - positive test:

        Alena goes camping and has [tent, matches, radio] .
        Tent is ready, tonight Alena is sleeping in a tent.
        The fire is ready.
        The music is fun.

        - negative test:

        Alena goes camping and has [chair, cigarettes, chips] .
        Alena doesn't have a tent, tonight Alena is sleeping under the stars.
        Alena has no items to make the fire.
        Alena has no music so Alena is singing, the wolves think it's their brother
         */











    }
}
