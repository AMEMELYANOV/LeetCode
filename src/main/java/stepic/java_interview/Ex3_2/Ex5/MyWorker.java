package stepic.java_interview.Ex3_2.Ex5;

public class MyWorker implements Worker {

    private String position;

    public MyWorker(String position) {
        this.position = position;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "MyWorker{" +
                "position='" + position + '\'' +
                '}';
    }
}
