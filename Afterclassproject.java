import java.util.Scanner;

public class Afterclassproject {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = scn.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the " + n + " elements of the array:");
    for(int i = 0; i < n; i++) {
    arr[i] = scn.nextInt(); // Store each input value in the array
    }
    reverse(arr);
    }
    public static void reverse(int[] arr) {
    System.out.println("This is the inversed array:");
    for(int i = arr.length-1; i >= 0; i--) {
        System.out.println(arr[i]);
    }
    }
}