import java.util.Scanner;

public class TestCircle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ใส่ตัวเลขรัศมี: ");
        int cc = scanner.nextInt();

        double result = Math.PI*Math.pow(cc,2);

        System.out.println("คำนวณแล้วได้: " + result);

        scanner.close();
    }
}
