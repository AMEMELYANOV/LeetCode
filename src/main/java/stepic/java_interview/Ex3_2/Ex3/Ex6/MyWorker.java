package stepic.java_interview.Ex3_2.Ex3.Ex6;

public class MyWorker implements Worker{
    private String position;
    private double salary;

    public MyWorker(String position, double salary) {
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "MyWorker{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
