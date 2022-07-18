package hackerrank.easy.solveproblem;

public class TimeConversion {

    public static String timeConversion(String s) {
        // Write your code here
        String rsl = "";
        String format = s.substring(s.length() - 2);
        int startDate = Integer.parseInt(s.substring(0, 2));
        String endDate = s.substring(2, s.length() - 2);
        String date = s.substring(0, s.length() - 2);
        if (format.equals("AM") && startDate < 12) {
            rsl = date;
        } else if (format.equals("AM")) {
            rsl = startDate - 12 + endDate;
            rsl = "0" + rsl;
        } else if (format.equals("PM") && startDate < 12) {
            rsl = startDate + 12 + endDate;
        } else if (format.equals("PM")){
            rsl = date;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("07:05:45AM"));
        System.out.println(timeConversion("12:01:00PM"));
        System.out.println(timeConversion("12:01:00AM"));

    }

}
