package nl.tudelft.oopp.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import nl.tudelft.oopp.demo.entities.Question;
import nl.tudelft.oopp.demo.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    private QuestionRepository repository;

    @GetMapping
    public void searchQuotes(@RequestParam String u, @RequestParam String q) {
        Question newQuestion = new Question(u, q);
        repository.save(newQuestion);
    }

    /**
     * GET Endpoint to retrieve a random quote.
     *
     * @return randomly selected {@link Question}.
     */
    @GetMapping // /quote
    @ResponseBody
    public Question getRandomQuote() {
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

        ArrayList<Question> quotes = new ArrayList<>();
        quotes.add(q1);
        quotes.add(q2);
        quotes.add(q3);

        return quotes.get(new Random().nextInt(quotes.size()));
    }
}
