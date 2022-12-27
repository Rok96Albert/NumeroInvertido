package numeroinvertido;

import java.util.*;


public class Main {

    public static Scanner scan;

    public static String num_mod ="";
    public static int n_input = 0;

    public static int n_output = 0;



    public static void main(String[] args){

        System.out.println("Introduce un número:");

        scan = new Scanner(System.in);

        n_input = scan.nextInt();

        num_mod =""+n_input;

        char [] n_digits = num_mod.toCharArray();

        num_mod = "";

        for(int i = n_digits.length-1; i >= 0; i--)
        {
            num_mod +=n_digits[i];
        }

        n_output = Integer.parseInt(num_mod);

        System.out.println(n_output);
    }
}
