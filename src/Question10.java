import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        int end = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            end = end + i;
            if ( n>=100){
                break;
            }
        }
       System.out.println("1부터 입력하신 값의 합: "+end);
    }
}
