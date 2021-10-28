import javax.xml.stream.FactoryConfigurationError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RacingGame {
    String carNames[];

    String n;
    void playgame(Scanner sc){



        while(true){
            System.out.println("경주할 자동차 이름 입력하세요 , 기준입니다");
            carNames=sc.nextLine().split(",");
            System.out.println(Arrays.toString(carNames));

            if(isAvailbe(carNames) && BlankName(carNames)) {
                break;
            }

        }
        // 생성자 리스트를 만들어주고
        List<Car> carList=new ArrayList<>();

        for(String name: carNames){
            // 입력한 자동차가 들어간다
            carList.add(new Car(name));
        }


        while(true){
            System.out.println("시도할 횟수는?");
            n=sc.nextLine();

            if(checkInteger(n)){
                break;
            }

        }

        System.out.println();

        for(int i=0; i<Integer.parseInt(n); i++){
            System.out.println("실행결과");

            for(Car car: carList){
                car.move();
                System.out.println(car.toString());

            }
            System.out.println();
        }

    }

    // 이동할 입력받은 숫자가 1이상 양수인지 확인
    public boolean checkInteger(String userNum){

        int num=Integer.parseInt(userNum);
        if(num <= 0){
            System.out.println("1이상 숫자만 입력해주세요");
            return false;
        }
        return true;
    }


    // 빈값제한
    public boolean BlankName (String []carName){
        for(String s: carName){
            if (s.isEmpty()){
                System.out.println("빈값이 있습니다.");
                return false;
            }

            if(s.contains(" ")){
                System.out.println("공백 값이 있습니다");
                return false;
            }
        }
        return true;
    }

    // 글자제한
    private boolean isAvailbe(String []carName){

        for(String s: carName) {
            if (s.length() > 5 || s.length() < 0) {
                System.out.println("5글자를 맞춰주세요");
                return false;
            }
        }

        return true;
    }

}
