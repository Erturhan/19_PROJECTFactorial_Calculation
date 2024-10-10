import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int factor, result = 1;

        System.out.print("Pleas , enter the number you want : ");
        factor = scan.nextInt();

        for (int i = factor ; i >= 1 ; i-= 1)
        {

            result *= i ;

        }

        System.out.print(factor+"! RESULT : "+result);
    }
}