import javax.print.DocFlavor;

public class Car {

    private int postiong;
    private String carName;
    static StringBuilder sb;
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

    public String getCarName(){
        return carName;
    }

    public String toString(){
        sb=new StringBuilder();
        for(int i=0; i<postiong; i++){
            sb.append("-");
        }
        int n=winner(sb);
        return carName+":"+sb+" "+n;
    }

    public int winner(StringBuilder sb){
        int n=sb.length();
        return n;
    }

    public int getPostiong(){
        return postiong;
    }

}
