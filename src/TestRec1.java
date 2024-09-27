import java.util.Scanner;

public class TestRec1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ใส่ตัวเลขสูง: ");
        int length = scanner.nextInt();

        System.out.print("ใส่ตัวเลขฐาน: ");
        int width = scanner.nextInt();

        double result = 0.5 * width * length;

        System.out.println("คำนวณแล้วได้: " + result);

        scanner.close();
    }
}


