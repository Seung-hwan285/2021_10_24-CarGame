public class Car {

    private int postiong;
    private String carName;

    public Car(String name) {
        this.carName=name;
    }

    public Car() {

    }


    public void move(){
        // 0~9 숫자
        int random = (int) (Math.random()*10);
        if (random >=4){
            postiong++;
        }
    }


    public String toString(){
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<postiong; i++){
            sb.append("-");
        }
        return carName+":"+sb;
    }


    public int getPostiong(){
        return postiong;
    }

}
