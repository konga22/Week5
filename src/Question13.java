import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;
        int sp;
        do{
            System.out.println("처음 비밀번호 입력: ");
            p = sc.nextInt();
            System.out.println("다시 입력: ");
            sp = sc.nextInt();
            if(p != sp){
                System.out.println("다시 입력해주세요");
            }
        }while(p != sp);
        System.out.println("성공");
    }
}
