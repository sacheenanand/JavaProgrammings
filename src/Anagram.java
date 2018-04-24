/**
 * Created by sanand on 4/19/18.
 */
/* Check whether two strings are anagram of each other */
import java.io.*;
import java.util.Arrays;

public class Anagram {
    static String input = "silent";
    static String anag = "islent";

    public static void main(String[] args){

        System.out.println("Checking if anagram" + checkIsAnagram(input, anag));

    }

    public static boolean checkIsAnagram(String str1, String str2 ){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if(str1.length()!= str2.length()){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            return true;
        }

        return false;
    }
}
