package Assignment_3;
import java.util.Scanner;
import java.util.Arrays;

class q3 {
    
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = input.nextLine();
        char charArray[] = str.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));

        input.close();
    }
}
