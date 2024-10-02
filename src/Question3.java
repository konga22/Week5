import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;

        do {
            System.out.println("숫자입력: ");

            n = sc.nextInt();
        }while (n<=1);
        System.out.println("입력한 값: "+ n);

    }
}
