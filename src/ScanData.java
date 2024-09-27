import java.util.Scanner;

public class ScanData {
    public static void main(String[] args) {
        String pname;
        int qty;
        double price;
        Scanner sn = new Scanner(System.in);
        System.out.println("please enter quantity , price and "+ "product Description then press Enter");
        qty = sn.nextInt();
        price = sn.nextDouble();
        pname = sn.nextLine();
        System.out.println("product"+pname);
        System.out.println("quantity"+qty);
        System.out.println("product"+price);
        System.out.println("amount"+qty*price);

    }
}