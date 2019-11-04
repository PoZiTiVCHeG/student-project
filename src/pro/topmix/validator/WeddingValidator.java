package pro.topmix.validator;

import pro.topmix.domain.AnswerWedding;
import pro.topmix.domain.StudentOrder;

public class WeddingValidator {

    public AnswerWedding checkWedding(StudentOrder so) {
        System.out.println("Wedding запущен!");
        return new AnswerWedding();
    }
}
