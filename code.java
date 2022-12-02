package first;

import java.util.Scanner;

public class recursiveexponential {
    static void exp(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base:");
        int base = input.nextInt();
        System.out.print("Enter the exponent:");
        int expo = input.nextInt();
        int result = 1;
        for(int i=1;i<=expo;i++){
            result*=base;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        exp();
    }
}
