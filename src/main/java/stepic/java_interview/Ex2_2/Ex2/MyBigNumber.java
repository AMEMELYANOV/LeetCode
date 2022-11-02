package stepic.java_interview.Ex2_2.Ex2;

class MyBigNumber implements BigNumber {
    private final String number;

    public MyBigNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public BigNumber add(BigNumber bigNumber) {
        // enter your code
        int razr = 0;
        int min = Math.min(number.length(), ((MyBigNumber) bigNumber).getNumber().length());
//        BigNumber number1 = number.length() > ((MyBigNumber) bigNumber).getNumber().length() ?



        return null;
    }

    @Override
    public BigNumber sub(BigNumber bigNumber) {
        // enter your code
        return null;
    }

    @Override
    public int compareTo(Object o) {
        // enter your code
        return 0;
    }

    @Override
    public String toString() {
        return number;
    }
}