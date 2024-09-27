import java.util.InputMismatchException;
import java.util.Scanner;

public class FindRadius {
    public static void main(String[] args) {
               double r = 0.0d;
        Scanner sn = new Scanner(System.in);
        System.out.println("please Enter The Radius then press Enter");

        try{
            r = sn.nextDouble();

        }
        catch (InputMismatchException e) {
            String s= sn.nextLine();
            System.out.print("Invalid Radius"+s);
        }
        System.out.println("readuis"+r);
    }

    }
