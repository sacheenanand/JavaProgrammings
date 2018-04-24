/**
 * Created by sanand on 7/12/17.
 */
public class MdArray {
    public static void main(String[] args) {
        int result = 0;
        for(int i =0; i<5 ;i++)
        {
            if(i == 3)
            {
                result += 10;
            }
            else
            {
                result+=i;
            }
        }
        System.out.println(result);
    }
}
/*
result = 0
i = 1
result = 0+1
result =1
i=2
result = 1+2;
result =3
i=3
result = 3+10 =13
i=4
result = 4+13 =17
result = 17
 */
