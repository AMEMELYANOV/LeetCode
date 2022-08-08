package stepic.stream;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

final class CommentUtils {
    public static void main(String[] args) throws ParseException {
        String input = "15-03-2020 00:00:00 30\n"
                + "14-03-2020 10:20:34 What a beautiful photo! Where is it?\n"
                + "16-03-2020 15:35:18 I do not know, I just found it on the internet!\n"
                + "20-03-2020 19:10:22 Is anyone here?";
        List<Comment> list = new ArrayList<>();
        list.add(new Comment(TEXT_FORMATTER.parse("14-03-2020 10:20:34"), "What a beautiful photo! Where is it?"));
        list.add(new Comment(TEXT_FORMATTER.parse("16-03-2020 15:35:18"), "I do not know, I just found it on the internet!"));
        list.add(new Comment(TEXT_FORMATTER.parse("20-03-2020 19:10:22"), "Is anyone here?"));
        handleComments(list, TEXT_FORMATTER.parse("15-03-2020 00:00:00"), 30);
    }

    /**
     * An example string that fits the format "15-03-2020 10:20:34".
     * Use it to print the comments.
     */
    public static final SimpleDateFormat TEXT_FORMATTER = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    private CommentUtils() {
    }

    /**
     * It processes a given list of comments by removing old comments and shortening the text length
     */
    public static void handleComments(List<Comment> comments, Date thresholdDate, int maxTextLength) {
        ListIterator<Comment> iterator = comments.listIterator();

        while (iterator.hasNext()) {
            Comment comment = iterator.next();
            if (!comment.getCreated().after(thresholdDate)) {
                iterator.remove();
            }
            if (comment.getText().length() >= maxTextLength) {
                iterator.set(new Comment(comment.getCreated(), comment.getText().substring(0, maxTextLength)));
            }
        }
//        List<Comment> temps = new ArrayList<>(comments);
//        temps.replaceAll(temp -> new Comment(temp.getCreated(),
//                temp.getText().substring(0, Math.min(temp.getText().length(), maxTextLength))));
//        comments = temps.stream()
//                .filter(comment -> comment.getCreated().after(thresholdDate))
//                .collect(Collectors.toList());
        printComments(comments);
    }

    /**
     * It prints each comment in the following format:
     * [14-03-2020 10:20:34] What a beautiful photo! Where is it?
     * [16-03-2020 15:35:18] I do not know, I just found it on the internet!
     * [20-03-2020 19:10:22] Is anyone here?
     * Please, use the formatter above to fit the format.
     */
    public static void printComments(List<Comment> comments) {
        // write your code here
        comments.stream()
                .map(comment -> String.format("[%s] %s", TEXT_FORMATTER.format(comment.getCreated()), comment.getText()))
                .forEach(System.out::println);
    }
}

class Comment {
    private final Date created;
    private final String text;

    public Comment(Date created, String text) {
        this.created = created;
        this.text = text;
    }

    public Date getCreated() {
        return created;
    }

    public String getText() {
        return text;
    }
}
