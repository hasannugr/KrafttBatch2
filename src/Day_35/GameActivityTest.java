package Day_35;

import java.util.Scanner;

public class GameActivityTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("kac hedefle karsilastiniz");
        int dusman = scan.nextInt();
        System.out.println("kac hedefle vurdunuz");
        int isabet = scan.nextInt();
        Challenge challenge=new Challenge(dusman,isabet);
        System.out.println(challenge.getRenk());
        System.out.println(challenge.getScore());

    }
}
