package test.clone_object;

public class Main implements Cloneable{
    private String str;
    private Car car;

    public Main(String str, Car car) {
        this.str = str;
        this.car = car;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Main main1 = new Main("Hello", new Car("Ford"));

        Object main2 = main1.clone();

        System.out.println("End");

    }

    @Override
    public Main clone() {
        Main main = null;
        try {
            main = (Main) super.clone();
        } catch (CloneNotSupportedException e) {
            main = new Main(this.str, this.car);
        }
        main.car = this.car.clone();
        return main;
    }
}

class Car implements Cloneable
{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public Car clone() {
        Car car = null;
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Car(this.name);
        }
    }
}
