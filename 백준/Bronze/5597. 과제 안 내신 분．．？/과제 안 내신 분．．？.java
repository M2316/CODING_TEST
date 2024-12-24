import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] studentNumber = new int[30];


        for(int i = 0; i<28; i++){
            int inputNum = scan.nextInt();
            studentNumber[inputNum-1] = inputNum;
        }
        for(int i = 0; i<studentNumber.length; i++){
            if(studentNumber[i] == 0){
                System.out.println(i+1);
            }
        }
    }
}