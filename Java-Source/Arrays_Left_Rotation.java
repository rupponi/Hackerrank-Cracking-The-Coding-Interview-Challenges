import java.util.*;

public class Arrays_Left_Rotation {

    //The goal of this exercise is to shift an array length n leftwards k times e.g. an array {1,2,3,4,5} shifted 1 time will be {2,3,4,5,1}.
    //The input is in the form of two numbers, the first being the length of the array and the second the number of shifts.
    /*EX:
        Input: 5 4                  Output: 5 1 2 3 4
               1 2 3 4 5
    */

    public static int[] arrayLeftRotation(int[] a, int n, int k) {

        for (int x = 0; x < k; x++) {//For each shift, the contents of this loop perform one shift on the array.
            int y = a[0];//Takes the initial element, which, in each step, will be used to replace the last element.
            for (int z = 0; z < n-1; z++) {
                a[z] = a[z+1];//For all contents from 0 to n-2, replace the contents of each index with the contents of one index greater.
            }
            a[n-1] = y;// Fill in n-1 spot with the carried over initial array element.
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}
