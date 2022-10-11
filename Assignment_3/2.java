package Assignment_3;
import java.util.Scanner;

class q2 {
    
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of elements in array: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array (Between 0-20): ");
        for(int i = 0; i<n; i++){
            arr[i] = input.nextInt();
        }

        int[] count = new int [21];

        for(int i = 0; i<n; i++){
            count[arr[i]]++;
        }

        int index = 0;

        for(int i = 0; i<20; i++){

            for(int j = 0; j<count[i]; j++){
                arr[index] = i;
                index++;
            }
        }

        System.out.println("Sorted array: ");
        for(int i = 0; i<n ; i++)
            System.out.print(arr[i] + " ");

        input.close();
    }   
}
