package at.ac.fhcampuswien;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    // Implement all methods as public static
    public static void oneMonthCalendar(int numD, int startD) {
        int row = startD - 1;
        System.out.println("");
        for (int i = 0; i < startD; i++) {
            System.out.println(" ");
        }
        int x = 1;
        while (x <= numD) {
            while (row < 7 && x <= numD) {
                if (x >= 9 || row == 6) {
                    System.out.print(x + " ");
                } else {
                    System.out.print(x + " ");
                }
                row++;
                x++;
            }
            System.out.println();
            if (x < 10) {
                System.out.print(" ");
            }
            row = 0;
        }
    }
    public static long [] lcg(long seed) {
        long[] array = new long[11];
        array[0] = seed;

        long m = ((long) Math.pow(2, 31));
        long a = 1103515245;
        long c = 12345;

        for (int i = 1; i < 11; i++) {
            array[i] = ((a*array[i-1])+c)%m;
        }

        return Arrays.copyOfRange(array,1,array.length);
    }

    public static void guessingGame(int numberToGuess) {
        Scanner scanner1 = new Scanner(System.in);
        int guess;

        for (int i = 1; i <= 10; i++){
            System.out.print("Guess number "+i+": ");
            guess = scanner1.nextInt();

            if (guess == numberToGuess){
                System.out.println("You won wisenheimer!");
                break;
            }

            if (i == 10){
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                break;
            }
            if (guess > numberToGuess)
                System.out.println("The number AI picked is lower than your guess.");
            if(guess < numberToGuess)
                System.out.println("The number AI picked is higher than your guess.");
        }

    }

    public static int randomNumberBetweenOneAndHundred() {

        Random something = new Random();
        return something.nextInt(100)+1;

    }

    public static boolean swapArrays(int[] array1, int[] array2) {
        if(array1.length != array2.length)
            return false;

        for (int i = 0; i < array1.length; i++){
            array1[i]=array1[i]-array2[i];
            array2[i]=array2[i]+array1[i];
            array1[i]=array2[i]-array1[i];
        }
        return true;
    }

    public static String camelCase(String s){
        char[] satz = s.toCharArray();
        StringBuilder neue = new StringBuilder();

        if(satz[0] >= 97 && satz[0] <= 122)
            satz[0] -= 32;

        for(int i = 1; i < satz.length; i++){
            if(satz[i] >= 65 && satz[i] <= 90){
                satz[i] += 32;}
            else if(satz[i] == 32){
                i++;
                if(satz[i] >= 97 && satz[i] <= 122){
                    satz[i] -= 32;}
            }
        }
        for(char j : satz){
            if(j >= 65 && j <= 90 || j >= 97 && j <= 122)
                neue.append(j);
        }
        return neue.toString();
    }

    public static int checkDigit(int[] array) {
        int weight = 2;
        int sum=0;
        int x;
        for (int i = 0; i < array.length; i++) {
            sum += array[i]*(weight+i);
        }
        x = sum%11;

        if (11-x==10)
            return 0;
        if (11-x==11)
            return 5;

        return 11-x;

    }


    public static void main(String[] args) {
        // test your method implementations here
        // make method calls
        // print their results
        // etc.
    }
}