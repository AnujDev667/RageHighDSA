package PW.Kunal;


import java.util.*;

public class ArrayIntr {
    static int countOccur(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        String[] str = new String[4];
//        for(int i=0;i<str.length;i++){
//            str[i] = in.next();
//
//        }
//        System.out.println(Arrays.toString(str));
//        int[] nums = {3, 4, 5, 12};
//        System.out.println(Arrays.toString(nums));
//        change(nums);
//        System.out.println(Arrays.toString((nums)));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter"+n+"elemnts");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("count of x" + countOccur(arr,x));


    }

//    static void change(int[] arr) {
//        arr[0] = 99;
//    }
}
//  int[] arr2 = Arrays.copyOf(arr,arr.length);
//    System.out.println("Copied arr_2");
//    printArray(arr_2);
//    arr_2[0] = 0;
//    Arrays.copyOfRange(arr,1,4)
