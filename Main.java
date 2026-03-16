import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of numbers in the array.");
        int n = s.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Enter the " + n + " numbers of the array.");
        for (int i = 0; i < n; i++){
            int value = s.nextInt();
            if(value > max){
                max = value;
            }
            if (value < min){
                min = value;
            }

        }

        System.out.println("Min: "+min);
        System.out.println("Max: "+max);

        int span = max - min;

        System.out.println("This is the span: " + span);

        s.close();


    }
}
