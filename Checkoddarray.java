import java.util.Scanner;

public class Checkoddarray {
    public Checkoddarray() {
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the array");

        int i;
        for(i = 0; i < array.length; ++i) {
            array[i] = s1.nextInt();
        }

        for(i = 0; i < array.length; ++i) {
            if (array[i] % 2 != 0) {
            }
        }
        System.out.println("DISPLAY THE RESUIT");
        System.out.println("Enter array is odd");
    }
}
