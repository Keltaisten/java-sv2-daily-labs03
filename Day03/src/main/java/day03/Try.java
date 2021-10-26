package day03;

import java.util.Random;
import java.util.Scanner;

public class Try {
    private int rndNumber;
    private int guessedNumber;

    public static void main(String[] args) {
        Try tried = new Try();
        Random random = new Random();
        tried.rndNumber = random.nextInt(1,101);
        System.out.println(tried.calculate());
    }

    public String calculate(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i<6;i++){
            System.out.println("Tippelj");
            guessedNumber = scanner.nextInt();
            if(rndNumber> guessedNumber){
                System.out.println("Nagyobb mint a gondolt szám");
            }else if(rndNumber<guessedNumber){
                System.out.println("Kisebb mint a gondolt szám");
            }else{
                return "Gratulálok kitaláltad!";
            }
        }
        return "Nem sikerült kitalálni" + rndNumber;
    }

    public String equalOrNot(){
        if(rndNumber> guessedNumber){
            System.out.println("Nagyobb mint a gondolt szám");
        }else if(rndNumber<guessedNumber){
            System.out.println("Kisebb mint a gondolt szám");
        }else{
            return "Gratulálok kitaláltad!";
        }
    }
}
