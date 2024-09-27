import java.util.Scanner;

public class InputCharDetect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("กรุณาป้อนอักขระหนึ่งตัว: ");
            char ch = scanner.next().charAt(0);

            if (Character.isDigit(ch)) {
                System.out.println(ch + " เป็นตัวเลข");
            } else {
                System.out.println(ch + " ไม่ใช่ตัวเลข");
            }
        } catch (Exception e) {
            System.out.println("invalid" + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
