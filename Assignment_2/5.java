package Assignment_2;

import java.util.Scanner;
class q5 {

    public static void main(String args[]){    
        
        System.out.print("Enter your number: ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.println("n n^2 n^3 n^4");

        for(int i = 1; i<=num ; i++){
            int temp = i;
            for(int j = 0;j<4; j++){
                System.out.print(temp + " ");
                temp*=i;
            }   
            System.out.println();
        }
    }
}


