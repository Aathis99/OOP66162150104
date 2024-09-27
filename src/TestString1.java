import java.util.*;

public class TestString1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณาป้อนข้อความ: ");

        String input = scanner.nextLine();

        int length = input.length();
        int e = input.indexOf("e",0);
        e++;
        System.out.println("คุณป้อนข้อความ: " + input);
        System.out.println("ความยาวของข้อความ : " + length);
        System.out.println("เจอตัว e ณ หลักที่ ที่ : " + e);

        scanner.close();
    }
}

