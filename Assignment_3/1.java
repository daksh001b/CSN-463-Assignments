package Assignment_3;
import java.util.Scanner;

class q1 {
    
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter string 1: ");
        String s1 = input.nextLine();

        System.out.println("Enter string 2: ");
        String s2 = input.nextLine();

        int size = Math.max(s1.length(), s2.length());
        boolean b = true;
        for(int i = 0; i<size; i++){

            if((s1.length() <=i && s2.length() > i) || s1.charAt(i) > s2.charAt(i)){
                break;
            }else if((s2.length() <= i && s1.length() > i) || s1.charAt(i) < s2.charAt(i)){
                b = false;
                break;
            }
        }

        if(b){
            System.out.println("String 1 is lexicographically greater than String 2");
        }else{
            System.out.println("String 2 is lexicographically greater than String 1");
        }

        input.close();
    }
}
