/**
 * Created by sanand on 4/16/18.
 */
import java.util.*;
public class Assignment1 {
    int a = 10;
    static int b = 20;
    public static void main(String[] args) {
        Assignment1 t = new Assignment1();
        System.out.println(t.a);
        System.out.println(t.b);
        t.a = 888;
        t.b = 999;
        Assignment1 t2 = new Assignment1();
        System.out.println(t2.a);
        System.out.println(t2.b);
        t2.b=333;
        Assignment1 t3 = new Assignment1();
        System.out.println(t3.a);
        System.out.println(t3.b);

    }
}

