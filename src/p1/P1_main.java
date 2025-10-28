package p1;

import java.util.Scanner;

public class P1_main {

    //Main
    public static void main(String[] args){

        //Init Scanner
        Scanner s = new Scanner(System.in);

        //Init Zeile + read input
        String zeile = new String();
        zeile = s.nextLine();

        //Print former user input
        System.out.println(zeile);
        s.close();

    }

}
