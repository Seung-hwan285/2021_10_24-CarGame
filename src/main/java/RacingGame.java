import javax.xml.stream.FactoryConfigurationError;
import java.text.Collator;
import java.util.*;

public class RacingGame {
    String carNames[];
    static Car c;
    String n;
    static StringBuilder sb;

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
        // 몇번 진행할건지
        n=new User().playUser();

        System.out.println();
        // 실행 결과 출력e
        gameResult(carList);

        // 우승자 출력
        winnerUser(carList);
    }

    /**
     * 우승자  출력
     */
    private void winnerUser(List<Car> carList){

        sb=new StringBuilder("우승자: ");
        // 내림차순으로 정렬
        // why? 맨앞에 있는 가장 큰값을 가져오기위해서
        carList=sortCarList(carList);

        int bestPostion = carList.get(0).getPostiong();
        for(Car car:carList){
            if(car.getPostiong() == bestPostion){
                sb.append(car.getCarName()+",");
            }

        }
        // 마지막 글자 , 자르기
        // 맨 앞부터 마지막 1 글자 (,) 자르기
        System.out.println(sb.substring(0,sb.length()-1));
    }
    User user=new User();
    /**
     *
     * @param carList 자동차 리스트 받아서 출력
     * 실행 결과 출력 메서드
     */
    private void gameResult(List<Car> carList){
        try {
            for (int i = 0; i < Integer.parseInt(n); i++) {
                System.out.println("실행 결과");
                for (Car car : carList) {
                    car.move();
                    System.out.println(car.toString());
                }
                System.out.println();
            }
        }
        catch (NumberFormatException e){
            System.out.println("null 값 들어옴");
        }
    }

    // carList 내림차순 정렬 -> 가장 첫번째 Car 객체의 postion 값을 가장 큰값으로 만든다
    private List<Car> sortCarList(List<Car> carList) {
        carList.sort((o1, o2) -> o2.getPostiong() - o1.getPostiong());
        return carList;
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
