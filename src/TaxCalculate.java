import java.util.*;

public class TaxCalculate {

    public static void tax(double money) {
        if (money > 4000000) {
            money -= 4000000;
            System.out.println("Your Tax : " + String.format("%.2f", money * 0.37 + 1045000) + " Bath");
        } else if (money > 1000000) {
            money -= 1000000;
            System.out.println("Your Tax : " + String.format("%.2f", money * 0.3 + 145000) + " Bath");
        } else if (money > 500000) {
            money -= 500000;
            System.out.println("Your Tax : " + String.format("%.2f", money * 0.2 + 45000) + " Bath");
        } else if (money > 100000) {
            money -= 100000;
            System.out.println("Your Tax : " + String.format("%.2f", money * 0.1 + 5000) + " Bath");
        } else if (money >= 0) {
            System.out.println("Your Tax : " + String.format("%.2f", money * 0.05) + " Bath");
        } else {
            System.out.println("Hey!! Your Money Less Than 0!!!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("กรุณากรอกรายได้ของคุณ: ");
            double income = scanner.nextDouble();

            // เรียกใช้งานเมธอด tax(double money) เพื่อคำนวณภาษี
            tax(income);

        } catch (InputMismatchException e) {
            System.out.println("เกิดข้อผิดพลาดในการป้อนข้อมูล กรุณาป้อนตัวเลขเท่านั้น");
        } finally {
            scanner.close(); // ปิด Scanner เมื่อไม่ต้องการใช้งานต่อ
        }
    }
}







