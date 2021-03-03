package nl.tudelft.oopp.demo.entities;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name = "questions")
public class Question {
    @Id @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    @Column(name = "id")
    private long id;

    @Column(name = "question")
    private String question;

    @Column(name = "user")
    private String user;

    public Question() {
    }

    /**
     * Create a new Quote instance.
     *
     * @param user User that posted the question.
     * @param question Content of the question.
     */
    public Question(String user, String question) {
        this.id = id;
        this.user = user;
        this.question = question;
    }

    public String getUser() {
        return user;
    }

    public String getQuestion() {
        return question;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Question question = (Question) o;

        return id == question.id;
    }
}
