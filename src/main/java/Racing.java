import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Racing {


    private final Car c=new Car();


    void play(Scanner sc){
        StringBuilder sb=new StringBuilder();
        String []carName;
        while(true){
            System.out.println("경주할 자동차 이름을 입력하세요 (,)기준");
            carName=sc.nextLine().split(",");
            System.out.println(Arrays.toString(carName));

            for(String s: carName){
                System.out.println(s);
            }

        }


    }
}