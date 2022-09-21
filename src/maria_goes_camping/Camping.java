package maria_goes_camping;

import java.util.Scanner;

public class Camping {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter your name: ");
        Tourist person1 = new Tourist(scan.next());
        System.out.println("Enter your items: ");
        person1.setBelongings(new String[]{scan.next(), scan.next(), scan.next()});
        person1.setUpTent();
        person1.playMusic();
        person1.makeFair();

    }
}
