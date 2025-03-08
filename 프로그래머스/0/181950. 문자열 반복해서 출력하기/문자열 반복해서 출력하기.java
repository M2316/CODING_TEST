import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        if(str.length() <= 0 || str.length() >= 11) {
            System.out.println("빈문자열 또는 10글자를 초과하는 글입니다.");
        }
        if(n <= 0 || n >= 6){
            System.out.println("1~5의 수만 입력 가능합니다.");
        }
        for(int i=0; i<n; i++){
            System.out.print(str);
        }
    }
}