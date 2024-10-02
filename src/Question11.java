public class Question11 {
    public static void main(String[] args) {
      /*
        System.out.println("    ★");
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  *****");
        System.out.println(" *******");
        System.out.println("*********");*/
        int n = 5;// 처음에 5줄을 먼저 생각하기
        for (int i=1; i<=n; i++ ) {//피라미드를 뒤집는거 생각하기
            for(int j=1; j<=n-i; j++) {//별의 앞부분 공백 생각하기
                System.out.print(" ");
            }
            for(int k=1; k<=i*2-1; k++) {//별의 갯수 생각하기
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
