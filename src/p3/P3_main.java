package p3;

import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class P3_main {

    //Main
    public static void main(String[] args) {

        //Assign random values in Range 50 to i, j, k + print the output
        int i = RandomGenerator.getDefault().nextInt(50), j = RandomGenerator.getDefault().nextInt(50), k = RandomGenerator.getDefault().nextInt(50);
        System.out.println("\n" + "Initial values of i, j and k (in order): " + i + ", " + j + ", " + k);

        //StringBuilder for Output
        StringBuilder m = new StringBuilder();

        //Check defined expressions
        if(i<j) {m.append("A ");}
        if(i<k) {m.append("B ");}
        if(j<k) {m.append("C");}

        //Case: StrinBuilder is empty => no expression applied!
        if(m.isEmpty()) {m.append("No expression applied! Empty output!");}

        //Print m
        System.out.println(m);
    }
}
