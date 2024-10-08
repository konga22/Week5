import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int end = 1;
        for(int i=1; i<=n; i++) {
            end =end*i;

        }
        System.out.print("입력하신 수의 팩토리얼: "+end);
    }
}
