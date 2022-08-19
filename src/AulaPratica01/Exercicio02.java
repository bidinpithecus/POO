package AulaPratica01;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nums = 3;
        String[] names = new String[nums];
        int[] ages = new int[nums];

        System.out.println("Insira o nome e idade de 3 pessoas:");

        // Input
        for (int i = 0; i < names.length; i++) {
            System.out.printf("Pessoa %d\nNome: ", i + 1);
            names[i] = input.next();
            System.out.print("Idade: ");
            ages[i] = input.nextInt();
        }

        // Bubble sort
        int temp = 0;
        String tempString = new String();
        for(int i = 0; i < nums; i++){
            for(int j = 1; j < (nums - i); j++){
                if(ages[j - 1] > ages[j]){
                    // swap elements
                    temp = ages[j - 1];
                    ages[j - 1] = ages[j];
                    ages[j] = temp;

                    tempString = names[j - 1];
                    names[j - 1] = names[j];
                    names[j] = tempString;
                }

            }
        }

        // Output
        System.out.println("Lista ordenada de forma decrescente pela idade das pessoas:\n");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Pessoa " + (i + 1) + "\n\tNome: " + names[i] + "\n\tIdade: " + ages[i]);
        }
    }
}
