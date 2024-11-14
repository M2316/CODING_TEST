import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;

        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);
        
        // 두 정수를 입력받기
        a = sc.nextInt();  // a에 정수 입력
        b = sc.nextInt();  // b에 정수 입력

        // a와 b의 합을 출력
        System.out.println(a + b);
        
        // Scanner 객체 종료
        sc.close();
    }
}