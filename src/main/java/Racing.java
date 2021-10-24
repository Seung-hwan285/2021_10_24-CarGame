import java.util.Arrays;
import java.util.Scanner;

public class Racing {


    private final Car c=new Car();
    void play(Scanner sc){
        StringBuilder sb=new StringBuilder();


        while(true){
            System.out.println("경주할 자동차 이름을 입력하세요 (,)기준");
            String[] car=c.check(sc.nextLine());
            System.out.println(Arrays.toString(car));
        }
    }
}
