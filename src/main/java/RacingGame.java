import javax.xml.stream.FactoryConfigurationError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RacingGame {

    void playgame(Scanner sc){

        String carNames[];

        while(true){

            carNames=sc.nextLine().split(",");
            System.out.println(Arrays.toString(carNames));

            if(!isAvailbe(carNames) || !BlankName(carNames)){
                continue;
            }

            break;
        }
        // 생성자 리스트를 만들어주고
        List<Car> carList=new ArrayList<>();
        for(String name: carNames){

            // 입력한 자동차가 들어간다
            carList.add(new Car(name));
        }


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
