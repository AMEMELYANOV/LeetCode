package stepic.java_interview.Ex3_2.Ex3;

public class MyWorker implements Worker{
    private String name;
    private int points;

    public MyWorker(String name, int points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "MyWorker{" +
                "name='" + name + '\'' +
                ", points=" + points +
                '}';
    }
}
