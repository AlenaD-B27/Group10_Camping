package alena_goes_camping;

import java.util.Arrays;
import java.util.Scanner;

public class Camping {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        Tourist tourist1 = new Tourist("Alena");
        System.out.println("Enter 3 belongings:");
        tourist1.setBelongings(new String [] {input.next(),input.next(),input.next()});

        System.out.println(tourist1);










    }
}
