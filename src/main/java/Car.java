public class Car {

    private int postiong;
    private String carName;

    public Car(String name) {
        this.carName=name;
    }

    public Car() {

    }


    public void move(){

        postiong++;
    }


    public int getPostiong(){
        return postiong;
    }

}
