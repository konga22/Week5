public class Question8 {
    public static void main(String[] args) {
        int n = 1;
        int end = 1;
        while (n <= 100) {
            end = end + n;
            n = n + 2;
        }
        System.out.println("1~100까지 홀수 합: "+end);
    }
}
