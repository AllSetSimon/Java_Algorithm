import java.util.Scanner;

public class Max_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Value a : ");
        int a = sc.nextInt();

        System.out.print("Value b : ");
        int b = sc.nextInt();

        System.out.print("Value c : ");
        int c = sc.nextInt();

        int max = a;
        if(b>max) max = b;
        if(c>max) max = c;

        System.out.println("Maximum number is " + max);

    }



}
