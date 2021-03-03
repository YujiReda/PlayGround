package nl.tudelft.oopp.demo;

import nl.tudelft.oopp.demo.entities.Question;
import nl.tudelft.oopp.demo.repositories.QuestionRepository;
import org.springframework.stereotype.Service;

/**
 * Load stuff in database for development
 */

@Service
public class DatabaseLoader {

    public DatabaseLoader(QuestionRepository repository) {
        Question q1 = new Question(
                "A clever person solves a problem. A wise person avoids it.",
                "Albert Einstein"
        );

        Question q2 = new Question(
                "The computer was born to solve problems that did not exist before.",
                "Bill Gates"
        );

        Question q3 = new Question(
                "Tell me and I forget.  Teach me and I remember.  Involve me and I learn.",
                "Benjamin Franklin"
        );

        repository.save(q1);
        repository.save(q2);
        repository.save(q3);
    }
}
