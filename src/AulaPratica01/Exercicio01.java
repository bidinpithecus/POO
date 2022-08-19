package AulaPratica01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Exercicio 1:");
        int nums = 5;
        int[] arr = new int[nums];
        double avg = 0;
        System.out.println("Insira " + nums + " valores para ser obtida a media destes:");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d] = ", i);
            arr[i] = input.nextInt();
            avg += arr[i];
        }

        avg /= arr.length;

        System.out.println("Media = " + avg);
    }
}
