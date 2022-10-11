package Assignment_3;
import java.util.Scanner;

class q4 {
    
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        
        int n = input.nextInt();

        while(n!=1){

            System.out.print(n + " ");
            if(n%2==0){
                n/=2;
            }
            else{
                n = n*3 + 1;
            }
        }

        System.out.println(1);
        input.close();
    }   
}
