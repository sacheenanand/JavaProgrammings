/**
 * Created by sanand on 8/23/17.
 */
public class Array2 {

    public int sum(int[] nums )
    {
        if(nums.length>=5)
            return(nums[0]*nums[1]*nums[2]);
        if(nums.length==1)
            return(nums[0]);
        return 0;


    }
    public static void main(String[] args)
    {
        Array2 arr = new Array2();
        int[] nums ={20, 21, 22, 12, 24};
        int results = arr.sum(nums);
        System.out.println(" The array result is " +results);

    }
}
