/**
 * Created by sanand on 7/12/17.
 */
public class ArrayLength {
    public static void main(String[] args) {
        int [] myArr = {9 , 10, 20 ,30 ,40};
        int sum=0;
        for(int x=0; x<myArr.length; x++) {
           sum += myArr[x];
        }
        System.out.println(sum);

    }

}
/* sum = 0;
MyArr[0] = 9
sum = 0 + 9 = 9;
sum = 9

x = 1
myArr[1] = 10
sum = 9 + 10
sum = 19;

x = 2
myArr[2] = 20;
sum = 19+20=39

x=3
myArr[3] = 30
39+30 = 69;

x=4
69+40=109

 */
