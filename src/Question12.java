import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a%2==0){

            System.out.println("소수가 아닙니다");

        }
        System.out.println("소수입니다");
    }
}
