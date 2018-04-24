/**
 * Created by sanand on 4/16/18.
 */

/* Static Variables */

import java.util.*;
public class StaticVariables {

    static int a =1000;
    static int b = 2000;
    public static void main(String args[]) //main method//
    {
        System.out.println(StaticVariables.a);
        System.out.println(StaticVariables.b);

        StaticVariables t = new StaticVariables();
        t.m1();

    }
    //instance variables//
    void m1()
    {
        System.out.println(StaticVariables.a);
        System.out.println(StaticVariables.b);
    }

}
