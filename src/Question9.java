import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do{
            System.out.print("나이 입력: ");
            n = sc.nextInt();
            if(n<=0){
                System.out.println("나이를 지대로 입력 바랍니다");
            }
        }while(n<=0);
        System.out.println("나이: "+ n);

    }
}
