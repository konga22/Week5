import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 2개를 입력하셍: ");
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        while (n2 != 0) {
            int tmp = n2;
            System.out.println("tmp=" + tmp);
            n2 = n % n2;
            System.out.println("n2= " + n2);
            n = tmp;
            System.out.println("n= " + n);
        }
        System.out.println("최대공약수: " + n);
    }
}
