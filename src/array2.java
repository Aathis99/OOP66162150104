import java.util.*;


class array2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        // รับจำนวนของสมาชิกในอาร์เรย์
        System.out.print("ป้อนจำนวนของสมาชิกในอาร์เรย์: ");
        int n = scanner.nextInt();

        // ประกาศอาร์เรย์ตามจำนวนที่ผู้ใช้ป้อน
        int[] number = new int[n];

        // รับค่าสมาชิกแต่ละตัวของอาร์เรย์
        System.out.println("ป้อนค่าสมาชิกในอาร์เรย์:");
        for (int i = 0; i < n; i++) {
            number[i] = scanner.nextInt();
        }

        Arrays.sort(number);

        int max= number[n-1];

        // แสดงผลลัพธ์
        System.out.println(Arrays.toString(number));
        System.out.println("ค่ามากสุดคือ " + max);

        // ปิด Scanner
        scanner.close();
    }
}

