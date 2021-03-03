package nl.tudelft.oopp.demo.data;

public class Question {

    private String user;
    private String question;

    public Question(String user, String question) {
        this.user = user;
        this.question = question;
    }

    public String getQuote() {
        return user;
    }

    public String getAuthor() {
        return question;
    }

    @Override
    public String toString() {
        return user + " -" + question;
    }
}
