package p2;

import java.util.random.RandomGenerator;

public class P2_main {

    //Main
    public static void main(String[] args) {

        //Assign random values to both variables
        int i = RandomGenerator.getDefault().nextInt(20);
        boolean b = RandomGenerator.getDefault().nextBoolean();

        //Print originals values
        System.out.println("\n" + "Initial value for int i: " + i);
        System.out.println("Initial value for bool b: " + b);

        //Check if i > 10
        if(i>10) {b=true;}

        //Print "updated" value of b
        System.out.println("\n" + "Value of bool b: " + b);

    }
}
