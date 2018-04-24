/**
 * Created by sanand on 5/17/17.
 */
public class Array1 {

    public int sum2(int[] nums)
    {
        if(nums.length >= 2)
            return (nums[0] + nums[1]);
        if(nums.length == 1)
            return nums[0];
        return 0;
    }

    public static void main(String[] args)
{
    Array1 Arr = new Array1();
    int[] nums = {100, 200, 300, 400};
    int result = Arr.sum2(nums);
    System.out.println("The array result  " +result);
}
}
