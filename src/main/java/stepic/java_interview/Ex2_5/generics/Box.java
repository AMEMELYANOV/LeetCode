package stepic.java_interview.Ex2_5.generics;

public class Box <T>{
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

class BoxRunner {

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setData(1);
    }
}
