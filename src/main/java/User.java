import java.util.Scanner;

public class User {

    String n;
    static final Scanner sc=new Scanner(System.in);


    String playUser(){
        while(true) {
            System.out.println("시도할 횟수는?");
            n = sc.nextLine();
            if (checkInteger(n)) {
                break;
            }
        }
        return getN();
    }

    public boolean checkInteger(String n) {
        int userNum=Integer.parseInt(n);

        if(userNum <=0){
            System.out.println("숫자 1이싱만 입력해주세요!!");
            return false;
        }
        return true;
    }

    String getN(){
        return n;
    }
}
