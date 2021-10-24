import java.util.Arrays;
import java.util.RandomAccess;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Car {

    private String carName;
    private int position=0;




    public Car(){

    }


    void move(){
        int random=randomNumber();

        // 5
        if(random >= 4) {
            position++;
        }
    }

    int getPosition(){
        return position;
    }

    void OutPut(){
        String line=toLine(position);


    }



    // postion 만큼 - 움직이기
    String toLine(int position){

        StringBuilder sb=new StringBuilder();
        for(int i=0; i<position; i++){
            sb.append("-");
        }

        return carName+":"+sb;
    }


    /**
     * --자동차 기능--
     * <p>
     * 1.주어진 횟수동안 n대의 자동차는 전진 , 멈춤
     * 2.각 자동차에 이름을 부여한다
     * 3.자동차 이름은 쉼표를 기준으로 5자이하
     * 4.사용자는 몇번의 이동을 할것인지 입력 -> 시도할 횟수
       5.전진하는 조건은 0~9 랜덤값  -> random 4이상이면 전진 , 3이하면 멈춤

     */

    // 5
    int randomNumber(){
        int random= (int) (Math.random()*10);


        return random;
    }

    // 2,3
    // 배열로 분리가된다

}

