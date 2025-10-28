package p3;

import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class P3_main {

    public static void main(String[] args) {

        int i = RandomGenerator.getDefault().nextInt(50), j = RandomGenerator.getDefault().nextInt(50), k = RandomGenerator.getDefault().nextInt(50);
        System.out.println("\n" + "Initial values of i, j and k (in order): " + i + ", " + j + ", " + k);

        StringBuilder m = new StringBuilder();

        if(i<j) {m.append("A ");}
        if(i<k) {m.append("B ");}
        if(j<k) {m.append("C");}

        if(m.isEmpty()) {m.append("No expression applied! Empty output!");}

        System.out.println(m);


    }

}
