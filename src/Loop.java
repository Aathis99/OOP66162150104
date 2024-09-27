import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countdown = 3;
        while (countdown >= 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy New Year !!!");
    }
}



