//package nl.tudelft.oopp.demo;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//import nl.tudelft.oopp.demo.entities.Question;
//import nl.tudelft.oopp.demo.repositories.QuestionRepository;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//@DataJpaTest
//public class QuoteTest {
//    @Autowired
//    private QuestionRepository questionRepository;
//
//    @Test
//    public void saveAndRetrieveQuote() {
//        String questionUser = "Yuji Reda";
//        String questionContent = "What is JPA?";
//        Question quote = new Question(questionUser, questionContent);
//        questionRepository.save(quote);
//
//        Question quote2 = questionRepository.getOne((long) 1);
//        assertEquals(quote, quote2);
//    }
//}