package day02;

import java.util.Scanner;

public class Mathematics {

    public boolean isPrime(int number){

        for(int i = 2; i<number;i++){
            if(number%i == 0){
               return false;
            }
        }
        return number == 1?false : true;
    }

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        Mathematics mathematics = new Mathematics();
        System.out.println("Kérem adjon meg egy számot.");
        System.out.println("A szám prím? " + mathematics.isPrime(scann.nextInt()));
    }
}
