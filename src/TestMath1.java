import java.util.*;

public class TestMath1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ใส่ตัวเลข: ");
        int x = scanner.nextInt();

        System.out.print("ใส่ตัวเลข: ");
        int y = scanner.nextInt();

        int result= Math.max(x,y);
        System.out.println("ค่าที่มากที่สุดคือ : " + result);
        //if else แสดงว่าตัวแปลไหน มีค่ามากกว่ากันจาก นม.
//        if (result == x) {
//            System.out.println("x > y");
//        }
//        else {
//            System.out.println("y > x");
//        }

        scanner.close();
    }
}
