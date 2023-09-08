import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//
//
//            System.out.println("i = " + i);
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int s = skaner.nextInt();
        int silnia = 1;

        for(int i = 1;i<=s; i++){
            silnia*=i;


        }
        System.out.println("Silnia wynosi " + silnia);


    }
}